/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ue {
    static ti field_h;
    private String field_d;
    static pd field_n;
    private int field_e;
    private int field_j;
    private boolean field_f;
    private int field_i;
    private int field_m;
    static String field_g;
    private kg field_k;
    private int field_l;

    final void a(kg param0, int param1, byte param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((jh) this).field_b = null;
            return;
        }
        if (((jh) this).field_k == param0) {
            if (((jh) this).field_f) {
                if (((jh) this).field_l == 2) {
                    if (((jh) this).field_d != null) {
                        if (!(!((jh) this).field_d.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((jh) this).field_d = param3;
        ((jh) this).field_f = true;
        if (param2 >= -63) {
            Object var7 = null;
            ((jh) this).a((String) null, (byte) -90, (kg) null, -10, 16);
        }
        ((jh) this).field_l = 2;
        ((jh) this).field_k = param0;
        ol var9 = this.a((byte) 107, param4, param0, param3);
        ol var10 = var9;
        var10.field_g[0] = param1 - param0.a(param3);
        var10.field_g[param3.length()] = param1;
        eh.a(var10, (byte) 79, param3, param0, 0);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (null == el.field_n) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) el.field_n;
                    // monitorenter el.field_n
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        el.field_n = null;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, kg param3, String param4) {
        if (param4 == null) {
            ((jh) this).field_b = null;
            return;
        }
        if (param3 == ((jh) this).field_k) {
            if (((jh) this).field_f) {
                if ((((jh) this).field_l ^ -1) == -2) {
                    if (null != ((jh) this).field_d) {
                        if (((jh) this).field_d.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((jh) this).field_l = 1;
        ((jh) this).field_f = true;
        ((jh) this).field_k = param3;
        ol var8 = this.a((byte) 34, param2, param3, param4);
        int var7 = param3.a(param4);
        if (param1 != 7531) {
            ((jh) this).field_i = 41;
        }
        var8.field_g[0] = param0 + -(var7 >> 1558484161);
        var8.field_g[param4.length()] = (var7 >> 953290081) + param0;
        eh.a(var8, (byte) 79, param4, param3, 0);
    }

    final void a(int param0, int param1, int param2, int param3, String param4, kg param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ol var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        ol stackIn_32_0 = null;
        ol stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        ol stackIn_33_0 = null;
        ol stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        ol stackIn_34_0 = null;
        ol stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        ol stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String stackIn_36_2 = null;
        kg stackIn_36_3 = null;
        ol stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_37_2 = null;
        kg stackIn_37_3 = null;
        ol stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_38_2 = null;
        kg stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        ol stackOut_31_0 = null;
        ol stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        ol stackOut_33_0 = null;
        ol stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        ol stackOut_32_0 = null;
        ol stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        ol stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String stackOut_35_2 = null;
        kg stackOut_35_3 = null;
        ol stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        kg stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        ol stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_36_2 = null;
        kg stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        L0: {
          var16 = Transmogrify.field_A ? 1 : 0;
          if (-1 != (param2 ^ -1)) {
            break L0;
          } else {
            param2 = param5.field_C;
            break L0;
          }
        }
        if (param4 == null) {
          ((jh) this).field_b = null;
          return;
        } else {
          L1: {
            if (param5 != ((jh) this).field_k) {
              break L1;
            } else {
              if (((jh) this).field_f) {
                break L1;
              } else {
                if (((jh) this).field_l != param1) {
                  break L1;
                } else {
                  if (param7 != ((jh) this).field_i) {
                    break L1;
                  } else {
                    if (((jh) this).field_m != param2) {
                      break L1;
                    } else {
                      if (param6 != ((jh) this).field_e) {
                        break L1;
                      } else {
                        if (param3 != ((jh) this).field_j) {
                          break L1;
                        } else {
                          if (((jh) this).field_d == null) {
                            break L1;
                          } else {
                            if (((jh) this).field_d.equals((Object) (Object) param4)) {
                              return;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((jh) this).field_m = param2;
            ((jh) this).field_d = param4;
            ((jh) this).field_i = param7;
            ((jh) this).field_e = param6;
            ((jh) this).field_k = param5;
            ((jh) this).field_f = false;
            ((jh) this).field_l = param1;
            ((jh) this).field_j = param3;
            var17 = new String[1 + param5.b(param4, param3)];
            var18 = var17;
            var10 = Math.max(1, param5.a(param4, new int[1], var18));
            var11 = -73 / ((-6 - param0) / 50);
            if ((((jh) this).field_i ^ -1) != -4) {
              break L2;
            } else {
              if (1 != var10) {
                break L2;
              } else {
                ((jh) this).field_i = 1;
                break L2;
              }
            }
          }
          L3: {
            ((jh) this).field_b = new ol[var10];
            if (((jh) this).field_i == 0) {
              var12 = param5.field_y;
              break L3;
            } else {
              if (1 == ((jh) this).field_i) {
                var12 = param5.field_y + (-(((jh) this).field_m * var10) + ((jh) this).field_e >> 1969747265);
                break L3;
              } else {
                if (2 == ((jh) this).field_i) {
                  var12 = -param5.field_t + ((jh) this).field_e - ((jh) this).field_m * var10;
                  break L3;
                } else {
                  L4: {
                    var13 = (-(var10 * ((jh) this).field_m) + ((jh) this).field_e) / (1 + var10);
                    if (0 > var13) {
                      var13 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var12 = var13 + param5.field_y;
                  ((jh) this).field_m = ((jh) this).field_m + var13;
                  break L3;
                }
              }
            }
          }
          var13 = 0;
          L5: while (true) {
            if (var13 >= var10) {
              return;
            } else {
              L6: {
                var14 = var17[var13];
                stackOut_31_0 = null;
                stackOut_31_1 = null;
                stackOut_31_2 = var12 - param5.field_y;
                stackOut_31_3 = var12 + param5.field_t;
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                stackIn_33_2 = stackOut_31_2;
                stackIn_33_3 = stackOut_31_3;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                stackIn_32_3 = stackOut_31_3;
                if (var14 != null) {
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = stackIn_33_3;
                  stackOut_33_4 = var14.length();
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  stackIn_34_4 = stackOut_33_4;
                  break L6;
                } else {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = 0;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_34_4 = stackOut_32_4;
                  break L6;
                }
              }
              L7: {
                new ol(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                var15 = stackIn_34_0;
                var15.field_g[0] = 0;
                if (var14 == null) {
                  break L7;
                } else {
                  L8: {
                    var15.field_g[var14.length()] = param5.a(var14);
                    stackOut_35_0 = (ol) var15;
                    stackOut_35_1 = 79;
                    stackOut_35_2 = (String) var14;
                    stackOut_35_3 = (kg) param5;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (-4 != (param1 ^ -1)) {
                      stackOut_37_0 = (ol) (Object) stackIn_37_0;
                      stackOut_37_1 = stackIn_37_1;
                      stackOut_37_2 = (String) (Object) stackIn_37_2;
                      stackOut_37_3 = (kg) (Object) stackIn_37_3;
                      stackOut_37_4 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      stackIn_38_4 = stackOut_37_4;
                      break L8;
                    } else {
                      stackOut_36_0 = (ol) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = (String) (Object) stackIn_36_2;
                      stackOut_36_3 = (kg) (Object) stackIn_36_3;
                      stackOut_36_4 = ((jh) this).a(param3, var14, param5.a(var14), 12);
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L8;
                    }
                  }
                  eh.a(stackIn_38_0, (byte) stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4);
                  break L7;
                }
              }
              ((jh) this).field_b[var13] = var15;
              var12 = var12 + param2;
              var13++;
              continue L5;
            }
          }
        }
    }

    final void a(String param0, byte param1, kg param2, int param3, int param4) {
        if (!(param0 != null)) {
            ((jh) this).field_b = null;
            return;
        }
        if (((jh) this).field_k == param2) {
            if (((jh) this).field_f) {
                if (((jh) this).field_l == 0) {
                    if (((jh) this).field_d != null) {
                        if (((jh) this).field_d.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((jh) this).field_l = 0;
        ((jh) this).field_f = true;
        ((jh) this).field_k = param2;
        ((jh) this).field_d = param0;
        int var6 = -37 / ((param1 - -50) / 49);
        ol var7 = this.a((byte) 52, param3, param2, param0);
        var7.field_g[0] = param4;
        var7.field_g[param0.length()] = param2.a(param0) + param4;
        eh.a(var7, (byte) 79, param0, param2, 0);
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -1) {
            field_h = null;
        }
        field_g = null;
        field_h = null;
    }

    private final ol a(byte param0, int param1, kg param2, String param3) {
        if (param0 <= 17) {
            return null;
        }
        ol var6 = new ol(-param2.field_y + param1, param1 + param2.field_t, param3.length());
        ol var5 = var6;
        ((jh) this).field_b = new ol[]{var6};
        return var5;
    }

    final static void a(sg param0, int param1) {
        int var2 = 0;
        sg var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != param0.field_h) {
          L0: {
            L1: {
              if (-1 != (param0.field_l ^ -1)) {
                break L1;
              } else {
                if (param0.field_f != 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (q.field_b <= var2) {
                break L0;
              } else {
                var3 = eg.field_a[var2];
                if (2 == var3.field_i) {
                  if (var3.field_l == param0.field_l) {
                    if (param0.field_f == var3.field_f) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1 >= 11) {
              break L3;
            } else {
              var5 = null;
              jh.a((sg) null, -103);
              break L3;
            }
          }
          L4: {
            if (param0.field_j == null) {
              break L4;
            } else {
              break L4;
            }
          }
          mh.a(-27968, param0);
          return;
        } else {
          return;
        }
    }

    public jh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new pd();
    }
}
