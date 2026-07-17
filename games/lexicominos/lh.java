/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
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
              if (!(param3 instanceof kf)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (w) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (w) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (kf) (Object) stackIn_3_0;
              ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_D;
                break L2;
              }
            }
            L3: {
              var7 = ((lh) this).field_v[0];
              ((lh) this).field_t.a(param4 + 3389);
              var7.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (var10.field_C) {
                    var11 = ((lh) this).field_v[1];
                    if (var11 != null) {
                      var11.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_m) {
                  L5: {
                    var12 = ((lh) this).field_v[3];
                    if (0 == var10.field_h) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                        break L3;
                      }
                    }
                  }
                  var9 = ((lh) this).field_v[2];
                  if (var9 != null) {
                    var9.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
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
              if (param3.a(18337)) {
                var13 = ((lh) this).field_v[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param2) {
                var14 = ((lh) this).field_v[4];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param1, ((lh) this).field_t, (byte) 76, param0, (lh) this, param3);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4 == -3284) {
                break L8;
              } else {
                ((lh) this).field_v = null;
                break L8;
              }
            }
            ((lh) this).field_t.a((lh) this, param3, param1, param4 ^ 3254, param0);
            pd.a(param4 + -19665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("lh.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param4 + 41);
        }
    }

    public lh() {
        ((lh) this).field_v = new n[6];
        ((lh) this).field_t = new n();
        n dupTemp$0 = new n();
        ((lh) this).field_v[0] = dupTemp$0;
        n var1 = dupTemp$0;
        var1.a(109);
    }

    private final void a(boolean param0, lh param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        n stackIn_7_0 = null;
        n stackIn_8_0 = null;
        n stackIn_9_0 = null;
        n stackIn_9_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_6_0 = null;
        n stackOut_8_0 = null;
        n stackOut_8_1 = null;
        n stackOut_7_0 = null;
        n stackOut_7_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((ik) (Object) param1, false);
              if (!param0) {
                o.a((Object[]) (Object) ((lh) this).field_v, 0, (Object[]) (Object) param1.field_v, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((lh) this).field_v[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_v[var4_int];
                          stackOut_6_0 = (n) var5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var6 != null) {
                            stackOut_8_0 = (n) (Object) stackIn_8_0;
                            stackOut_8_1 = (n) var6;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            n dupTemp$17 = new n();
                            param1.field_v[var4_int] = dupTemp$17;
                            stackOut_7_0 = (n) (Object) stackIn_7_0;
                            stackOut_7_1 = (n) dupTemp$17;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        ((n) (Object) stackIn_9_0).a(stackIn_9_1, -25682);
                        break L3;
                      } else {
                        param1.field_v[var4_int] = null;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("lh.FA(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 6 + 41);
        }
    }

    final void a(db[] param0, byte param1) {
        n[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -112) {
              var7 = ((lh) this).field_v;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_f = param0;
                      break L2;
                    } else {
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("lh.B(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    lh(lh param0, boolean param1) {
        this();
        try {
            int discarded$0 = 6;
            param0.a(param1, (lh) this);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "lh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -24921) {
            break L0;
          } else {
            field_w = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wf.field_i < 20) {
              break L2;
            } else {
              if (!ha.a(126)) {
                break L2;
              } else {
                L3: {
                  if (be.field_l <= 0) {
                    break L3;
                  } else {
                    if (ca.d(true)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, db param1) {
        n[] var7 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        try {
            var7 = ((lh) this).field_v;
            n[] var3 = var7;
            for (var4 = 0; var4 < var7.length; var4++) {
                var5 = var7[var4];
                if (!(var5 == null)) {
                    var5.field_j = param1;
                }
            }
            int var3_int = 45 / ((param0 - -58) / 39);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "lh.CA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
            return null;
        }
        n dupTemp$0 = new n();
        ((lh) this).field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (((lh) this).field_v[var4_int] == null) {
                ((lh) this).field_v[var4_int] = new n();
            }
            if (param1) {
                ((lh) this).field_v = null;
            }
            ((lh) this).field_v[param2].field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "lh.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(wf param0, int param1) {
        int var2_int = 0;
        try {
            ki.field_g = param0.b(-1698573656) << 5;
            var2_int = param0.d(true);
            ki.field_g = ki.field_g + (var2_int >> 3);
            sg.field_a = 1835008 & var2_int << 18;
            sg.field_a = sg.field_a + (param0.b(-1698573656) << 2);
            var2_int = param0.d(true);
            hh.field_I = (63 & var2_int) << 15;
            sg.field_a = sg.field_a + (var2_int >> 6);
            hh.field_I = hh.field_I + (param0.d(true) << 7);
            if (param1 != -95) {
                Object var3 = null;
                lh.a((wf) null, 6);
            }
            var2_int = param0.d(true);
            hh.field_I = hh.field_I + (var2_int >> 1);
            th.field_s = var2_int << 16 & 65536;
            th.field_s = th.field_s + param0.b(-1698573656);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "lh.BA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
        field_w = false;
    }
}
