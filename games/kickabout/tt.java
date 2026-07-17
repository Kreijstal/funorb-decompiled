/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String field_a;
    static String field_d;
    static ut field_e;
    static boolean field_c;
    static int field_b;

    public static void a(boolean param0) {
        try {
            field_a = null;
            field_d = null;
            field_e = null;
            if (param0) {
                uo discarded$0 = tt.a(60, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "tt.B(" + param0 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        ml var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        gg var6 = null;
        String var7 = null;
        gg var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_12_0 = 0;
        gg stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        gg stackIn_54_2 = null;
        gg stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        gg stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        gg stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        gg stackOut_53_2 = null;
        gg stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        gg stackOut_59_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var1_ref = un.field_e;
            var2 = var1_ref.h((byte) -115);
            if (var2 == 0) {
              L1: {
                if (ni.field_m == null) {
                  ni.field_m = new em(128);
                  ou.field_y = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var1_ref.h((byte) -110) != 1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_12_0;
                  var4_ref_String = var1_ref.a(-118);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1_ref.a(-95);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L3;
              }
              L5: {
                var6 = fm.a(var4_ref_String, 145);
                var7 = var1_ref.a(-113);
                var8 = mo.a(0, (CharSequence) (Object) var4_ref_String);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var6 == null) {
                  var6 = fm.a(var7, 145);
                  if (var6 == null) {
                    break L6;
                  } else {
                    ni.field_m.a((am) (Object) var6, (byte) -4, (long)var8.hashCode());
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = new gg();
                  ni.field_m.a((am) (Object) var6, (byte) -4, (long)var8.hashCode());
                  int fieldTemp$2 = ou.field_y;
                  ou.field_y = ou.field_y + 1;
                  var6.field_Cb = fieldTemp$2;
                  qn.field_b.a((gn) (Object) var6, 3);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_Eb = var7;
              var6.field_yb = var5;
              var6.field_Gb = var4_ref_String;
              return;
            } else {
              if (1 != var2) {
                if (var2 != 2) {
                  if (var2 != 3) {
                    if (var2 == 4) {
                      ts.field_d = 1;
                      var3 = var1_ref.a(111);
                      bh.field_h = var3.intern();
                      var4 = var1_ref.h((byte) -115);
                      en.a(var4, -1);
                      return;
                    } else {
                      L8: {
                        bd.a("F1: " + tr.b(0), (Throwable) null, 1);
                        lr.b((byte) -116);
                        if (param0 > 38) {
                          break L8;
                        } else {
                          field_e = null;
                          break L8;
                        }
                      }
                      break L0;
                    }
                  } else {
                    L9: {
                      if (2 == ts.field_d) {
                        ts.field_d = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    if (1 == ts.field_d) {
                      ts.field_d = 2;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (kw.field_b == null) {
                    kw.field_b = new em(128);
                    bc.field_d = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var3 = var1_ref.a(-126);
                  if (!var3.equals((Object) (Object) "")) {
                    break L12;
                  } else {
                    var3 = null;
                    break L12;
                  }
                }
                L13: {
                  var4_ref_String = var1_ref.a(34);
                  var5 = var1_ref.a(-112);
                  var6 = tr.a(var4_ref_String, (byte) 40);
                  if (var6 != null) {
                    break L13;
                  } else {
                    var6 = tr.a(var5, (byte) 40);
                    if (null != var6) {
                      kw.field_b.a((am) (Object) var6, (byte) -4, (long)mo.a(0, (CharSequence) (Object) var4_ref_String).hashCode());
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (null != var6) {
                    break L14;
                  } else {
                    var6 = new gg();
                    kw.field_b.a((am) (Object) var6, (byte) -4, (long)mo.a(0, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$3 = bc.field_d;
                    bc.field_d = bc.field_d + 1;
                    var6.field_Cb = fieldTemp$3;
                    ne.field_I.a((gn) (Object) var6, 3);
                    break L14;
                  }
                }
                L15: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var6.field_Eb = var5;
                var6.field_zb = var3;
                var6.field_Gb = var4_ref_String;
                var6.c((byte) -109);
                var7_ref = (gg) (Object) ne.field_I.g(24009);
                L16: while (true) {
                  L17: {
                    L18: {
                      L19: {
                        L20: {
                          if (null == var7_ref) {
                            break L20;
                          } else {
                            stackOut_53_0 = (gg) var7_ref;
                            stackOut_53_1 = -21;
                            stackOut_53_2 = (gg) var6;
                            stackIn_61_0 = stackOut_53_0;
                            stackIn_61_1 = stackOut_53_1;
                            stackIn_61_2 = stackOut_53_2;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            stackIn_54_2 = stackOut_53_2;
                            if (var9 != 0) {
                              break L19;
                            } else {
                              if (!po.a(stackIn_54_0, (byte) stackIn_54_1, stackIn_54_2)) {
                                break L20;
                              } else {
                                var7_ref = (gg) (Object) ne.field_I.c(33);
                                if (var9 == 0) {
                                  continue L16;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7_ref) {
                          break L18;
                        } else {
                          stackOut_59_0 = (gg) var7_ref;
                          stackOut_59_1 = 16737894;
                          stackOut_59_2 = (gg) var6;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_61_1 = stackOut_59_1;
                          stackIn_61_2 = stackOut_59_2;
                          break L19;
                        }
                      }
                      ug.a((gn) (Object) stackIn_61_0, stackIn_61_1, (gn) (Object) stackIn_61_2);
                      if (var9 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                    ne.field_I.a((gn) (Object) var6, 3);
                    break L17;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "tt.A(" + param0 + 41);
        }
    }

    final static uo a(int param0, byte[] param1) {
        uo var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        uo stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        uo stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 12015) {
                break L1;
              } else {
                uo discarded$2 = tt.a(8, (byte[]) null);
                break L1;
              }
            }
            if (param1 != null) {
              var2 = new uo(param1, aq.field_f, fc.field_g, ku.field_c, lo.field_j, pq.field_O);
              tk.h((byte) -82);
              stackOut_6_0 = (uo) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (uo) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("tt.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You need <%0> to buy this pitch.";
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = 70;
    }
}
