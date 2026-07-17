/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ek {
    private oc field_p;
    private oc[] field_q;

    final void a(kc param0, byte param1) {
        oc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        oc[] var8 = null;
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
        var7 = Main.field_T;
        try {
          L0: {
            var8 = ((nd) this).field_q;
            var3 = var8;
            var4 = 0;
            var5 = 43 % ((-3 - param1) / 34);
            L1: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var4];
                  if (var6 != null) {
                    var6.field_b = param0;
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
            stackOut_8_1 = new StringBuilder().append("nd.M(");
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
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void a(kc[] param0, int param1) {
        oc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
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
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              var3 = ((nd) this).field_q;
              var4 = 0;
              if (param1 <= -118) {
                break L1;
              } else {
                ((nd) this).field_q = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_f = param0;
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
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("nd.P(");
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
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final oc a(byte param0, int param1) {
        if (param0 != -1) {
            Object var4 = null;
            ((nd) this).a(8, (lk) null, 72, -15, true);
        }
        oc dupTemp$0 = new oc();
        ((nd) this).field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(boolean param0, int param1, kc[] param2) {
        int var4_int = param1;
        if (((nd) this).field_q[var4_int] == null) {
            ((nd) this).field_q[var4_int] = new oc();
        }
        if (!param0) {
            return;
        }
        try {
            ((nd) this).field_q[param1].field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nd.N(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, boolean param1, nd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        oc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        oc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        oc stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oc stackIn_10_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        oc stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        oc stackOut_9_2 = null;
        oc stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        oc stackOut_8_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            super.a((ek) (Object) param2, (byte) -80);
            L1: {
              if (!param0) {
                og.a((Object[]) (Object) ((nd) this).field_q, 0, (Object[]) (Object) param2.field_q, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((nd) this).field_q[var4_int];
                      if (var5 == null) {
                        param2.field_q[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param2.field_q[var4_int];
                          stackOut_7_0 = (oc) var5;
                          stackOut_7_1 = -59;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (var6 == null) {
                            oc dupTemp$17 = new oc();
                            param2.field_q[var4_int] = dupTemp$17;
                            stackOut_9_0 = (oc) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (oc) dupTemp$17;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L4;
                          } else {
                            stackOut_8_0 = (oc) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (oc) var6;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L4;
                          }
                        }
                        ((oc) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2);
                        break L3;
                      }
                    }
                    var4_int++;
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
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("nd.O(").append(param0).append(44).append(0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    public nd() {
        ((nd) this).field_q = new oc[6];
        ((nd) this).field_p = new oc();
        oc dupTemp$0 = new oc();
        ((nd) this).field_q[0] = dupTemp$0;
        oc var1 = dupTemp$0;
        var1.a((byte) 44);
    }

    nd(nd param0, boolean param1) {
        this();
        try {
            param0.a(param1, false, (nd) this);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        oc var7 = null;
        oc var9 = null;
        hl var10 = null;
        oc var11 = null;
        oc var12 = null;
        oc var13 = null;
        oc var14 = null;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param1 instanceof hl) {
                stackOut_2_0 = (lk) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lk) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (hl) (Object) stackIn_3_0;
              ek.a(param1.field_i + param3, param1.field_h + param1.field_o + param0, param0 - -param1.field_o, (byte) 43, param1.field_q + (param1.field_i + param3));
              if (var10 != null) {
                param4 = param4 & var10.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = ((nd) this).field_q[0];
            ((nd) this).field_p.a((byte) 117);
            var7.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -10);
            if (param2 == 11447) {
              L3: {
                if (var10 == null) {
                  break L3;
                } else {
                  L4: {
                    if (var10.field_D) {
                      var11 = ((nd) this).field_q[1];
                      if (var11 != null) {
                        var11.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -105);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (var10.field_j) {
                    L5: {
                      var12 = ((nd) this).field_q[3];
                      if (var10.field_x == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -61);
                          break L3;
                        }
                      }
                    }
                    var9 = ((nd) this).field_q[2];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -19);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param1.d(88)) {
                  var13 = ((nd) this).field_q[5];
                  if (var13 == null) {
                    break L6;
                  } else {
                    var13.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -120);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (param4) {
                  break L7;
                } else {
                  var14 = ((nd) this).field_q[4];
                  if (var14 == null) {
                    break L7;
                  } else {
                    var14.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -85);
                    break L7;
                  }
                }
              }
              ((nd) this).field_p.a(param0, param1, param3, (byte) 88, (nd) this);
              gg.a(14756);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("nd.C(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
