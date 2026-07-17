/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends id {
    private db[] field_x;
    static int field_r;
    static int field_p;
    static int field_v;
    static int field_w;
    static java.applet.Applet field_u;
    private db field_t;
    static int[] field_s;
    static String field_q;

    final static String c(int param0) {
        if (!(dj.field_a != o.field_l)) {
            return lc.field_p;
        }
        if (!(dj.field_a != el.field_E)) {
            return gk.field_c;
        }
        if (param0 != -5) {
            field_p = -104;
        }
        if (!(al.field_f.a(true))) {
            return gk.field_c;
        }
        return va.field_a;
    }

    final db a(byte param0, int param1) {
        int var3 = -43 % ((param0 - 73) / 41);
        db dupTemp$0 = new db();
        ((tc) this).field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static void a(kl param0) {
        try {
            nl.field_e.b(-104, (gg) (Object) param0);
            ca.a(4, param0, (byte) 71);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "tc.F(" + (param0 != null ? "{...}" : "null") + 44 + 4 + 44 + 0 + 41);
        }
    }

    tc(tc param0, boolean param1) {
        this();
        try {
            param0.a(param1, -59, (tc) this);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "tc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void e() {
        field_s = null;
        field_u = null;
        field_q = null;
    }

    final void a(int param0, pb[] param1) {
        db[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var7 = ((tc) this).field_x;
              var3 = var7;
              if (param0 < -64) {
                break L1;
              } else {
                ((tc) this).field_t = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("tc.I(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void d() {
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = stellarshard.field_B;
          if (param1 >= 124) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          kc.field_b = 0;
          k.field_b = null;
          dl.field_A = null;
          var2 = ll.field_b;
          ll.field_b = l.field_b;
          od.field_v.field_i = od.field_v.field_i + 1;
          if (param0 == 51) {
            od.field_v.field_g = 2;
            break L1;
          } else {
            if (param0 != 50) {
              od.field_v.field_g = 1;
              break L1;
            } else {
              od.field_v.field_g = 5;
              break L1;
            }
          }
        }
        L2: {
          l.field_b = var2;
          if (od.field_v.field_i < 2) {
            break L2;
          } else {
            if (51 != param0) {
              break L2;
            } else {
              return 2;
            }
          }
        }
        L3: {
          if (2 > od.field_v.field_i) {
            break L3;
          } else {
            if (param0 == 50) {
              return 5;
            } else {
              break L3;
            }
          }
        }
        if (od.field_v.field_i >= 4) {
          return 1;
        } else {
          return -1;
        }
    }

    public tc() {
        ((tc) this).field_x = new db[6];
        ((tc) this).field_t = new db();
        db dupTemp$0 = new db();
        ((tc) this).field_x[0] = dupTemp$0;
        db var1 = dupTemp$0;
        var1.a((byte) 62);
    }

    final void a(int param0, int param1, pb[] param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (((tc) this).field_x[var4_int] == null) {
                ((tc) this).field_x[var4_int] = new db();
            }
            ((tc) this).field_x[param0].field_d = param2;
            var4_int = -105 % ((param1 - 56) / 32);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "tc.G(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, pb param1) {
        db[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            var7 = ((tc) this).field_x;
            var3 = var7;
            if (param0) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_b = param1;
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
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("tc.H(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        db var7 = null;
        db var9 = null;
        ig var10 = null;
        db var11 = null;
        db var12 = null;
        db var13 = null;
        db var14 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_2_0 = null;
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
              if (param3 instanceof ig) {
                stackOut_2_0 = (rj) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (rj) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (ig) (Object) stackIn_3_0;
              if (param4 == 4549) {
                break L2;
              } else {
                String discarded$1 = tc.c(22);
                break L2;
              }
            }
            L3: {
              gg.a(126, param3.field_p + (param1 + param3.field_w), param3.field_k + param2, param2 - -param3.field_k - -param3.field_t, param1 - -param3.field_w);
              if (var10 == null) {
                break L3;
              } else {
                param0 = param0 & var10.field_E;
                break L3;
              }
            }
            L4: {
              var7 = ((tc) this).field_x[0];
              ((tc) this).field_t.a((byte) 76);
              var7.a((tc) this, ((tc) this).field_t, param4 ^ 4584, param2, param3, param1);
              if (var10 != null) {
                L5: {
                  if (!var10.field_z) {
                    break L5;
                  } else {
                    var11 = ((tc) this).field_x[1];
                    if (var11 != null) {
                      var11.a((tc) this, ((tc) this).field_t, 94, param2, param3, param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!var10.field_q) {
                  break L4;
                } else {
                  L6: {
                    var12 = ((tc) this).field_x[3];
                    if (var10.field_o == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a((tc) this, ((tc) this).field_t, 126, param2, param3, param1);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((tc) this).field_x[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a((tc) this, ((tc) this).field_t, param4 ^ -4525, param2, param3, param1);
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param3.e(0)) {
                var13 = ((tc) this).field_x[5];
                if (var13 != null) {
                  var13.a((tc) this, ((tc) this).field_t, 99, param2, param3, param1);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                var14 = ((tc) this).field_x[4];
                if (var14 != null) {
                  var14.a((tc) this, ((tc) this).field_t, -122, param2, param3, param1);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((tc) this).field_t.a(param2, (tc) this, param3, param4 + -4547, param1);
            id.b((byte) -58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("tc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param4 + 41);
        }
    }

    private final void a(boolean param0, int param1, tc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db var6 = null;
        db var7 = null;
        int var8 = 0;
        db stackIn_7_0 = null;
        db stackIn_8_0 = null;
        db stackIn_9_0 = null;
        db stackIn_9_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        db stackOut_6_0 = null;
        db stackOut_8_0 = null;
        db stackOut_8_1 = null;
        db stackOut_7_0 = null;
        db stackOut_7_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var4_int = 0;
              super.a((id) (Object) param2, (byte) -34);
              if (!param0) {
                ri.a((Object[]) (Object) ((tc) this).field_x, 0, (Object[]) (Object) param2.field_x, 0, 6);
                break L1;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var6 = ((tc) this).field_x[var5];
                      if (var6 != null) {
                        L4: {
                          var7 = param2.field_x[var5];
                          stackOut_6_0 = (db) var6;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var7 == null) {
                            db dupTemp$17 = new db();
                            param2.field_x[var5] = dupTemp$17;
                            stackOut_8_0 = (db) (Object) stackIn_8_0;
                            stackOut_8_1 = (db) dupTemp$17;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            break L4;
                          } else {
                            stackOut_7_0 = (db) (Object) stackIn_7_0;
                            stackOut_7_1 = (db) var7;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            break L4;
                          }
                        }
                        ((db) (Object) stackIn_9_0).a(stackIn_9_1, true);
                        break L3;
                      } else {
                        param2.field_x[var5] = null;
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
            stackOut_13_1 = new StringBuilder().append("tc.K(").append(param0).append(44).append(-59).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_q = "Continue";
    }
}
