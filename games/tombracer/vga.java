/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vga extends vpa {
    private ng[] field_o;
    static vna field_n;
    static boolean field_q;
    private ng field_p;

    public vga() {
        ((vga) this).field_o = new ng[6];
        ((vga) this).field_p = new ng();
        ng dupTemp$0 = new ng();
        ((vga) this).field_o[0] = dupTemp$0;
        ng var1 = dupTemp$0;
        var1.a(true);
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
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
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (jm.a(var3, 19) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("vga.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -128 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, iu[] param1) {
        ng[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        Object var7 = null;
        ng[] var8 = null;
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = ((vga) this).field_o;
              var3 = var8;
              if (param0 == -18379) {
                break L1;
              } else {
                var7 = null;
                this.a((byte) -79, (vga) null, false);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_i = param1;
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
            stackOut_9_1 = new StringBuilder().append("vga.F(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void a(iu param0, byte param1) {
        ng[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ng var6 = null;
        int var7 = 0;
        ng[] var8 = null;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = ((vga) this).field_o;
            var3 = var8;
            var5 = -107 / ((-39 - param1) / 62);
            var4 = 0;
            L1: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var4];
                  if (var6 != null) {
                    var6.field_c = param0;
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
            stackOut_8_1 = new StringBuilder().append("vga.A(");
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void b() {
        field_n = null;
    }

    final void a(int param0, int param1, iu[] param2) {
        int var4_int = 0;
        try {
            if (param0 != 0) {
                ((vga) this).field_p = null;
            }
            var4_int = param1;
            if (null == ((vga) this).field_o[var4_int]) {
                ((vga) this).field_o[var4_int] = new ng();
            }
            ((vga) this).field_o[param1].field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vga.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ng a(int param0, byte param1) {
        if (param1 < 40) {
            ng discarded$0 = ((vga) this).a(100, (byte) 15);
        }
        ng dupTemp$1 = new ng();
        ((vga) this).field_o[param0] = dupTemp$1;
        return dupTemp$1;
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        ng var7 = null;
        ng var9 = null;
        rj var10 = null;
        ng var11 = null;
        ng var12 = null;
        ng var13 = null;
        ng var14 = null;
        ae stackIn_3_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ae stackOut_1_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof rj)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ae) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ae) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (rj) (Object) stackIn_3_0;
              tga.a(param2 + -16799168, param0.field_i + param1, param1 - -param0.field_i + param0.field_m, param0.field_n + param3, param0.field_n + param3 + param0.field_p);
              if (var10 != null) {
                param4 = param4 & var10.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((vga) this).field_o[0];
              ((vga) this).field_p.a(true);
              if (param2 == 16777215) {
                break L3;
              } else {
                ((vga) this).field_o = null;
                break L3;
              }
            }
            L4: {
              var7.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (var10.field_w) {
                    var11 = ((vga) this).field_o[1];
                    if (var11 != null) {
                      var11.a((vga) this, param0, 125, param3, param1, ((vga) this).field_p);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var10.field_f) {
                  L6: {
                    var12 = ((vga) this).field_o[3];
                    if (0 == var10.field_s) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((vga) this).field_o[2];
                  if (var9 != null) {
                    var9.a((vga) this, param0, param2 ^ 16777092, param3, param1, ((vga) this).field_p);
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
              if (param0.b((byte) -34)) {
                var13 = ((vga) this).field_o[5];
                if (var13 != null) {
                  var13.a((vga) this, param0, 123, param3, param1, ((vga) this).field_p);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param4) {
                var14 = ((vga) this).field_o[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a((vga) this, param0, 126, param3, param1, ((vga) this).field_p);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((vga) this).field_p.a(-83, param1, (vga) this, param3, param0);
            pfa.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var6;
            stackOut_34_1 = new StringBuilder().append("vga.B(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, vga param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        Object var8 = null;
        ng stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ng stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ng stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ng stackIn_11_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ng stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ng stackOut_10_2 = null;
        ng stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ng stackOut_9_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -16) {
                break L1;
              } else {
                var8 = null;
                ((vga) this).a(-72, (iu[]) null);
                break L1;
              }
            }
            L2: {
              super.a((vpa) (Object) param1, param0 + -64);
              if (!param2) {
                lua.a((Object[]) (Object) ((vga) this).field_o, 0, (Object[]) (Object) param1.field_o, 0, 6);
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= 6) {
                    break L2;
                  } else {
                    L4: {
                      var5 = ((vga) this).field_o[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L5: {
                          var6 = param1.field_o[var4_int];
                          stackOut_8_0 = (ng) var5;
                          stackOut_8_1 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var6 != null) {
                            stackOut_10_0 = (ng) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (ng) var6;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L5;
                          } else {
                            ng dupTemp$13 = new ng();
                            param1.field_o[var4_int] = dupTemp$13;
                            stackOut_9_0 = (ng) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (ng) dupTemp$13;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L5;
                          }
                        }
                        ((ng) (Object) stackIn_11_0).a(stackIn_11_1 != 0, stackIn_11_2);
                        break L4;
                      } else {
                        param1.field_o[var4_int] = null;
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
            stackOut_15_1 = new StringBuilder().append("vga.D(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    vga(vga param0, boolean param1) {
        this();
        try {
            param0.a((byte) -16, (vga) this, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new vna();
    }
}
