/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String[] field_a;
    private int field_d;
    private int field_e;
    static char[] field_f;
    float field_j;
    private bl[] field_i;
    static int field_g;
    static int field_h;
    private int field_c;
    String field_b;

    final boolean a(boolean param0) {
        int var3 = 0;
        bl var5 = null;
        bl var6 = null;
        var3 = DungeonAssault.field_K;
        if (param0) {
          int discarded$1 = wk.a(73, -60);
          L0: while (true) {
            if (((wk) this).field_e > ((wk) this).field_d) {
              var6 = ((wk) this).field_i[((wk) this).field_d];
              if (!var6.field_q.a(-14354)) {
                this.a((byte) 12, 0, var6);
                return false;
              } else {
                L1: {
                  if (0 > var6.field_m) {
                    break L1;
                  } else {
                    if (!var6.field_q.a(false, var6.field_m)) {
                      this.a((byte) 12, var6.field_q.c(-123, var6.field_m), var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_h == null) {
                    break L2;
                  } else {
                    if (!var6.field_q.a(false, var6.field_h)) {
                      this.a((byte) 12, var6.field_q.b(var6.field_h, -1), var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.field_m >= 0) {
                    break L3;
                  } else {
                    if (var6.field_h != null) {
                      break L3;
                    } else {
                      if (null == var6.field_f) {
                        break L3;
                      } else {
                        if (!var6.field_q.a((byte) 59)) {
                          this.a((byte) 12, var6.field_q.b(100), var6);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((wk) this).field_d = ((wk) this).field_d + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((wk) this).field_e > ((wk) this).field_d) {
              var5 = ((wk) this).field_i[((wk) this).field_d];
              if (!var5.field_q.a(-14354)) {
                this.a((byte) 12, 0, var5);
                return false;
              } else {
                L5: {
                  if (0 > var5.field_m) {
                    break L5;
                  } else {
                    if (!var5.field_q.a(false, var5.field_m)) {
                      this.a((byte) 12, var5.field_q.c(-123, var5.field_m), var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_h == null) {
                    break L6;
                  } else {
                    if (!var5.field_q.a(false, var5.field_h)) {
                      this.a((byte) 12, var5.field_q.b(var5.field_h, -1), var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5.field_m >= 0) {
                    break L7;
                  } else {
                    if (var5.field_h != null) {
                      break L7;
                    } else {
                      if (null == var5.field_f) {
                        break L7;
                      } else {
                        if (!var5.field_q.a((byte) 59)) {
                          this.a((byte) 12, var5.field_q.b(100), var5);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((wk) this).field_d = ((wk) this).field_d + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(int param0, String param1, se param2, int param3, int[] param4) {
        tf var6 = null;
        try {
            var6 = new tf(param2, param1, param4);
            var6.b(-param2.field_H + 366, 32, -var6.field_i + 552);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wk.A(" + 552 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 366 + ',' + (param4 != null ? "{...}" : "null") + ',' + 31139 + ')');
        }
    }

    private final void a(byte param0, int param1, bl param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(((wk) this).field_d + 1) + (float)param1 / 100.0f;
              ((wk) this).field_j = (float)((wk) this).field_c * var4_float / (float)(((wk) this).field_e + 1);
              if (param1 != 0) {
                ((wk) this).field_b = param2.field_f + " - " + param1 + "%";
                break L1;
              } else {
                ((wk) this).field_b = param2.field_g;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("wk.K(").append(12).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public static void b() {
        field_a = null;
        field_f = null;
    }

    final static void a() {
        sn.a(66, 17);
    }

    final static cn[] a(cn[] param0, int param1) {
        cn[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        cn[] var5 = null;
        cn[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = new cn[param0.length];
            var2 = var5;
            var3 = param1;
            L1: while (true) {
              if (param0.length <= var3) {
                stackOut_4_0 = (cn[]) var2;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                int discarded$2 = -105;
                var5[var3] = g.a(param0[var3]);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("wk.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static int c(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            boolean discarded$28 = lg.field_w.a(wo.field_b, (byte) 66, ci.field_m, true);
            lg.field_w.b(true);
            L1: while (true) {
              int discarded$29 = 47;
              if (!ha.b()) {
                if (!param0) {
                  if (ki.field_f != -1) {
                    var1_int = ki.field_f;
                    sn.a(16, -1);
                    stackOut_9_0 = var1_int;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    if (cd.field_b) {
                      stackOut_13_0 = 3;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (wd.field_d != ql.field_f) {
                        if (!im.field_b.b(36)) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (ol.field_i == ql.field_f) {
                            stackOut_24_0 = 2;
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            return -1;
                          }
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                } else {
                  stackOut_5_0 = 11;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$30 = lg.field_w.a(126, mm.field_t, ob.field_Yb);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "wk.H(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    private final void a(nh param0, String param1, String param2, boolean param3, int param4, String param5) {
        bl[] var9 = null;
        bl var8 = null;
        bl var10 = null;
        try {
            if (!(((wk) this).field_i.length > ((wk) this).field_e)) {
                var9 = new bl[((wk) this).field_e * 2];
                bl[] var7 = var9;
                cj.a((Object[]) (Object) ((wk) this).field_i, 0, (Object[]) (Object) var9, 0, ((wk) this).field_e);
                ((wk) this).field_i = var9;
            }
            var8 = new bl();
            var10 = var8;
            bl var7_ref = var10;
            var10.field_g = param5;
            var10.field_h = param2;
            var10.field_m = -1;
            var10.field_f = param1;
            var10.field_q = param0;
            int fieldTemp$0 = ((wk) this).field_e;
            ((wk) this).field_e = ((wk) this).field_e + 1;
            ((wk) this).field_i[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + false + ',' + -1 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, String param1, String param2, nh param3, int param4) {
        RuntimeException runtimeException = null;
        Object var7 = null;
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
              this.a(param3, param0, param1, false, -1, param2);
              if (param4 < -75) {
                break L1;
              } else {
                var7 = null;
                cn[] discarded$2 = wk.a((cn[]) null, 114);
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
            stackOut_3_1 = new StringBuilder().append("wk.C(");
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
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
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, String param2, nh param3) {
        if (param1 != 237) {
            return;
        }
        try {
            this.a(param3, param2, (String) null, false, -1, param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (0 == (param0 & 7)) {
            break L0;
          } else {
            var2 = -(param0 & 7) + 8;
            break L0;
          }
        }
        if (param1 != 18605) {
          int discarded$2 = wk.c(true);
          var3 = var2 + param0;
          return var3;
        } else {
          var3 = var2 + param0;
          return var3;
        }
    }

    wk(int param0) {
        ((wk) this).field_i = new bl[16];
        ((wk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
