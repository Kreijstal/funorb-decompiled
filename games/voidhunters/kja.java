/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kja extends htb {
    static String field_C;
    private hob field_F;
    private ij field_B;
    static String field_G;
    private String[] field_D;
    static ij field_E;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((kja) this).g((byte) 122);
    }

    final void c(int param0, int param1, int param2, int param3) {
        super.c(param0, param1, param2, param3);
        int var5 = param1 - ((kja) this).field_g;
        int var6 = param3 + -((kja) this).field_r;
        hob var7 = this.b(var5, var6, param2 ^ param2);
        if (var7 != null) {
            if (null != ((kja) this).field_l) {
                ((ln) (Object) ((kja) this).field_l).a(-1, param0, var7.field_i, (kja) this);
            }
        }
    }

    String d(byte param0) {
        if (null == ((kja) this).field_F) {
            return null;
        }
        if (null == ((kja) this).field_D) {
            return null;
        }
        if (((kja) this).field_F.field_i >= ((kja) this).field_D.length) {
            return null;
        }
        if (param0 != 125) {
            return null;
        }
        return ((kja) this).field_D[((kja) this).field_F.field_i];
    }

    private final hob b(int param0, int param1, int param2) {
        hob var4 = null;
        hob var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var4 = (hob) (Object) ((kja) this).field_B.d(param2 + param2);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (hob) (Object) ((kja) this).field_B.a((byte) 95);
                continue L0;
              } else {
                L2: {
                  if (param0 < var5.field_h) {
                    break L2;
                  } else {
                    if (var5.field_k > param1) {
                      break L2;
                    } else {
                      if (var5.field_g + var5.field_h <= param0) {
                        break L2;
                      } else {
                        if (var5.field_k + var5.field_j >= param1) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_f;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    kja(String param0, wwa param1) {
        super(param0, (sba) null);
        ((kja) this).field_F = null;
        try {
            ((kja) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != -23) {
            Object var6 = null;
            boolean discarded$0 = ((kja) this).a(110, (shb) null);
        }
        ((kja) this).a(param2, param0, ((at) (Object) ((kja) this).field_q).a((shb) this, (byte) 81), 1, param1);
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((kja) this).field_D) {
                  break L2;
                } else {
                  if (param0 < ((kja) this).field_D.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7 = new String[param0 - -1];
                var4 = var7;
                if (((kja) this).field_D != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (((kja) this).field_D.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = ((kja) this).field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((kja) this).field_D = var4;
              break L1;
            }
            L5: {
              if (param1 == -1) {
                break L5;
              } else {
                ((kja) this).a(87, 68, 4, -44, 106);
                break L5;
              }
            }
            ((kja) this).field_D[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("kja.I(").append(param0).append(',').append(param1).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param0 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_G = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("kja.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, shb param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((kja) this).field_F = null;
              if (((kja) this).field_e) {
                var5_int = -((kja) this).field_g + kc.field_b + -param1;
                var6 = -param0 + (uia.field_b - ((kja) this).field_r);
                ((kja) this).field_F = this.b(var5_int, var6, 0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("kja.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 52, param3);
        if (0 != param1) {
          return;
        } else {
          return;
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        at var3 = null;
        ar var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        toa var12 = null;
        int var13 = 0;
        int var14 = 0;
        hob var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = VoidHunters.field_G;
        ((kja) this).field_B = new ij();
        var2 = 0;
        var3 = (at) (Object) ((kja) this).field_q;
        var4 = var3.a((shb) this, 3);
        L0: while (true) {
          var5 = ((kja) this).field_j.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (param0 > 110) {
                break L1;
              } else {
                ((kja) this).field_D = null;
                break L1;
              }
            }
            return;
          } else {
            var7 = ((kja) this).field_j.indexOf(">", var5);
            var6 = ((kja) this).field_j.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((kja) this).field_j.indexOf("</hotspot>", var5);
            var8 = var4.a(true, var5);
            var9 = var4.a(true, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_c[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(var5, -125);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  } else {
                    stackOut_8_0 = var4.a(var2, -114);
                    stackIn_12_0 = stackOut_8_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new hob(var7, var13, var12.field_b, var14 + -var13, Math.max(var3.a(124), -var12.field_b + var12.field_a));
                  if (var10 != null) {
                    ((hob) var10).field_f = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((kja) this).field_B.b(-10258, (ksa) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void a() {
        field_G = null;
        field_E = null;
        field_C = null;
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Software";
        field_G = "Spawn Nebula";
    }
}
