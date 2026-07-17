/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class m extends tb {
    static cj field_B;
    static cj field_x;
    static String field_A;
    static fm field_C;
    static int field_z;
    static int field_y;
    static ja field_w;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        if (param1 == 0) {
          if (gi.field_i == null) {
            return;
          } else {
            var3 = gi.field_i.a((byte) 113, param0);
            if (var3 != 0) {
              if (var3 != 2) {
                gi.field_i = null;
                ic.field_e = -1;
                return;
              } else {
                if (null == gi.field_i.field_wb) {
                  gi.field_i = null;
                  ic.field_e = -1;
                  return;
                } else {
                  if (gi.field_i.field_wb.equals((Object) (Object) "")) {
                    gi.field_i = null;
                    ic.field_e = -1;
                    return;
                  } else {
                    L0: {
                      if (gi.field_i.field_wb.charAt(0) != 91) {
                        var9 = (CharSequence) (Object) gi.field_i.field_wb;
                        var4 = tg.a(var9, false);
                        var5 = var4;
                        var5 = var4;
                        break L0;
                      } else {
                        var4 = gi.field_i.field_wb;
                        break L0;
                      }
                    }
                    L1: {
                      var5 = null;
                      if (0 == ic.field_e) {
                        var5 = ii.a(var4, (byte) 116, param2);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (1 != ic.field_e) {
                        break L2;
                      } else {
                        var5 = gn.a(var4, 103, param2);
                        break L2;
                      }
                    }
                    L3: {
                      if (ic.field_e == 2) {
                        var5 = sf.a(param1 + -86, param2, var4);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (ic.field_e != 3) {
                        break L4;
                      } else {
                        var5 = ng.a(var4, var4, param1 + -25, param2);
                        break L4;
                      }
                    }
                    if (var5 == null) {
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    } else {
                      var7 = null;
                      vm.a(var4, 0, (String) null, var5, 2, 0);
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          var6 = null;
          java.awt.Frame discarded$1 = m.a(-30, (go) null, 112, 17, -89, 48);
          if (gi.field_i != null) {
            var3 = gi.field_i.a((byte) 113, param0);
            if (var3 != 0) {
              if (var3 != 2) {
                gi.field_i = null;
                ic.field_e = -1;
                return;
              } else {
                if (null == gi.field_i.field_wb) {
                  gi.field_i = null;
                  ic.field_e = -1;
                  return;
                } else {
                  if (gi.field_i.field_wb.equals((Object) (Object) "")) {
                    gi.field_i = null;
                    ic.field_e = -1;
                    return;
                  } else {
                    L5: {
                      if (gi.field_i.field_wb.charAt(0) != 91) {
                        var8 = (CharSequence) (Object) gi.field_i.field_wb;
                        var4 = tg.a(var8, false);
                        var5 = var4;
                        var4 = var5;
                        var5 = var4;
                        break L5;
                      } else {
                        var4 = gi.field_i.field_wb;
                        break L5;
                      }
                    }
                    L6: {
                      var5 = null;
                      if (0 == ic.field_e) {
                        var5 = ii.a(var4, (byte) 116, param2);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (1 != ic.field_e) {
                        break L7;
                      } else {
                        var5 = gn.a(var4, 103, param2);
                        break L7;
                      }
                    }
                    L8: {
                      if (ic.field_e == 2) {
                        var5 = sf.a(param1 + -86, param2, var4);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (ic.field_e != 3) {
                        break L9;
                      } else {
                        var5 = ng.a(var4, var4, param1 + -25, param2);
                        var4 = var5;
                        var5 = var4;
                        var4 = var5;
                        break L9;
                      }
                    }
                    if (var5 == null) {
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    } else {
                      var7 = null;
                      vm.a(var4, 0, (String) null, var5, 2, 0);
                      gi.field_i = null;
                      ic.field_e = -1;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private m(fm param0, int param1) {
        super(param0, param1);
    }

    final String d(cf param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param1 == -9327) {
                break L1;
              } else {
                var4 = null;
                java.awt.Frame discarded$2 = m.a(-33, (go) null, 73, 31, -76, 61);
                break L1;
              }
            }
            stackOut_2_0 = hg.a(40, '*', param0.field_j.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("m.BA(");
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_x = null;
        field_w = null;
        field_B = null;
    }

    final static void c(int param0) {
        il var1 = (il) (Object) db.field_a.a(true);
        if (!(var1 != null)) {
            var1 = new il();
        }
        var1.a(oo.field_e, oo.field_d, oo.field_g, (byte) -120, oo.field_i, oo.field_f, oo.field_b, oo.field_l);
        mo.field_Fb.a((br) (Object) var1, false);
    }

    final static java.awt.Frame a(int param0, go param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        sm[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        sm[] var10 = null;
        di var11 = null;
        Object stackIn_27_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        java.awt.Frame stackOut_39_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_34_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1.a(-96)) {
              L1: {
                if (param3 == 0) {
                  var10 = jg.a(-123, param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_26_0 = null;
                          stackIn_27_0 = stackOut_26_0;
                          return (java.awt.Frame) (Object) stackIn_27_0;
                        }
                      } else {
                        L3: {
                          if (param0 != var10[var8].field_e) {
                            var8++;
                            break L3;
                          } else {
                            if (param4 == var10[var8].field_a) {
                              L4: {
                                if (param2 == 0) {
                                  break L4;
                                } else {
                                  if (param2 != var10[var8].field_d) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param3 < var10[var8].field_c) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var7_int = 1;
                              param3 = var10[var8].field_c;
                              break L3;
                            } else {
                              var8++;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(param0, (byte) 126, param2, param3, param4);
              L6: while (true) {
                if (var11.field_f != 0) {
                  L7: {
                    if (param5 > 85) {
                      break L7;
                    } else {
                      field_x = null;
                      break L7;
                    }
                  }
                  var7 = (java.awt.Frame) var11.field_d;
                  if (var7 != null) {
                    if (2 != var11.field_f) {
                      stackOut_39_0 = (java.awt.Frame) var7;
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    } else {
                      sp.a(param1, 1, var7);
                      stackOut_37_0 = null;
                      stackIn_38_0 = stackOut_37_0;
                      return (java.awt.Frame) (Object) stackIn_38_0;
                    }
                  } else {
                    stackOut_34_0 = null;
                    stackIn_35_0 = stackOut_34_0;
                    return (java.awt.Frame) (Object) stackIn_35_0;
                  }
                } else {
                  vd.a(false, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var6;
            stackOut_41_1 = new StringBuilder().append("m.G(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L8;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_40_0;
    }

    m(int param0) {
        this(ke.field_h, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Waiting for music";
        field_w = new ja(540, 140);
    }
}
