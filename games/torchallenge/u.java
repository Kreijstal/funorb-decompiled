/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int[] field_c;
    private ha field_f;
    static uj field_a;
    private lj field_d;
    private lj field_e;
    private ha field_g;
    static int[][][] field_b;

    final static void a(int param0, int param1) {
        fe var2 = null;
        int var3 = 0;
        if (0 <= param1) {
          if (param1 < 13) {
            if (param0 != 12604) {
              field_c = null;
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              e discarded$4 = ol.a(param0 + -12732, var2, var3);
              return;
            } else {
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              e discarded$5 = ol.a(param0 + -12732, var2, var3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    private final fe a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        q var9 = null;
        fe var10 = null;
        fe stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        fe stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        fe stackOut_13_0 = null;
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
            var5_int = (param3 << 4 & 65533 | param3 >>> 12) ^ param2;
            var5_int = var5_int | param3 << 16;
            var6 = (long)var5_int;
            var8 = (fe) (Object) ((u) this).field_g.a((byte) 97, var6);
            if (var8 != null) {
              stackOut_2_0 = (fe) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (0 < param1[0]) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (fe) (Object) stackIn_7_0;
                  }
                }
              }
              var9 = q.a(((u) this).field_d, param3, param2);
              if (var9 != null) {
                L2: {
                  var10 = var9.b();
                  var8 = var10;
                  ((u) this).field_g.a(106, (da) (Object) var8, var6);
                  if (param1 == null) {
                    break L2;
                  } else {
                    param1[0] = param1[0] - var10.field_k.length;
                    break L2;
                  }
                }
                stackOut_13_0 = (fe) var8;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("u.C(").append(0).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    final fe a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        fe stackIn_4_0 = null;
        fe stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_6_0 = null;
        fe stackOut_3_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 > 85) {
              break L0;
            } else {
              var5 = null;
              fe discarded$2 = ((u) this).a(108, (int[]) null, -71);
              break L0;
            }
          }
          if (((u) this).field_e.c((byte) 52) != 1) {
            if (((u) this).field_e.a(param1, -89) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_6_0 = this.a((byte) 119, param2, 0, param1);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          } else {
            stackOut_3_0 = this.a((byte) 113, param2, param1, 0);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("u.E(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final fe a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        fe stackIn_3_0 = null;
        fe stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_2_0 = null;
        fe stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((u) this).field_d.c((byte) 52) == 1) {
            stackOut_2_0 = this.a(0, param1, param2, 0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            L0: {
              if (param0 == -1) {
                break L0;
              } else {
                u.a(-35, -112);
                break L0;
              }
            }
            if (((u) this).field_d.a(param2, -77) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_7_0 = this.a(0, param1, 0, param2);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("u.H(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, lj param1) {
        ka var2 = new ka(param1.a(-2, "", "final_frame.jpg"), (java.awt.Component) (Object) bg.field_P);
        int var3 = var2.field_u;
        int var4 = var2.field_x;
        wb.b((byte) 66);
        hf.field_a = new ka(var3, 3 * var4 / 4);
        hf.field_a.d();
        var2.a(0, 0);
        td.field_o = new ka(var3, var4 - hf.field_a.field_x);
        td.field_o.d();
        var2.a(0, -hf.field_a.field_x);
        try {
            td.field_o.field_p = hf.field_a.field_x;
            int discarded$0 = -9;
            ie.b();
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "u.A(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, int param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
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
            Throwable decompiledCaughtException = null;
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
                if (!uj.field_a.startsWith("win")) {
                  break L0;
                } else {
                  int discarded$6 = 1;
                  if (!ol.a(param3)) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              L1: {
                if (param2 < -56) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              {
                L2: {
                  param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                  break L2;
                }
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("u.B(");
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
              L4: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    u(lj param0, lj param1) {
        ((u) this).field_f = new ha(256);
        ((u) this).field_g = new ha(256);
        try {
            ((u) this).field_d = param0;
            ((u) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "u.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final fe a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        wg var9 = null;
        Object stackIn_2_0 = null;
        fe stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        fe stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_13_0 = null;
        fe stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        fe stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            var5_int = param2 ^ (param3 >>> 12 | (param3 & -268431361) << 4);
            if (param0 > 109) {
              var5_int = var5_int | param3 << 16;
              var6 = 4294967296L ^ (long)var5_int;
              var8 = (fe) (Object) ((u) this).field_g.a((byte) 89, var6);
              if (var8 == null) {
                L1: {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (0 < param1[0]) {
                      break L1;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      return (fe) (Object) stackIn_9_0;
                    }
                  }
                }
                L2: {
                  var9 = (wg) (Object) ((u) this).field_f.a((byte) 100, var6);
                  if (var9 == null) {
                    var9 = wg.a(((u) this).field_e, param3, param2);
                    if (var9 != null) {
                      ((u) this).field_f.a(-101, (da) (Object) var9, var6);
                      break L2;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (fe) (Object) stackIn_14_0;
                    }
                  } else {
                    break L2;
                  }
                }
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.a(true);
                  ((u) this).field_g.a(-98, (da) (Object) var8, var6);
                  stackOut_19_0 = (fe) var8;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  return (fe) (Object) stackIn_18_0;
                }
              } else {
                stackOut_4_0 = (fe) var8;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fe) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("u.G(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    final static void a() {
        int var2 = 36;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 200, 450};
        field_b = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
