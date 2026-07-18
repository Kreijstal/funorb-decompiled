/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vaa {
    static sna field_a;
    static String field_c;
    static int field_d;
    private java.util.zip.Inflater field_e;
    static kv field_b;
    static int field_f;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        Object var17 = null;
        CharSequence var18 = null;
        L0: {
          var17 = null;
          var11 = BachelorFridge.field_y;
          var3 = 1;
          if (qh.field_l) {
            break L0;
          } else {
            if (bi.field_h != null) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (0 != gk.field_d) {
            break L1;
          } else {
            if (null == rv.field_n) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (gk.field_d != 2) {
            break L2;
          } else {
            int discarded$29 = -19229;
            if (hv.a()) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (84 == gf.field_k) {
          if (var3 == 0) {
            if (gk.field_d == 0) {
              return true;
            } else {
              bea.d(-111);
              return true;
            }
          } else {
            L3: {
              if (jm.field_g.length() <= 0) {
                bea.d(-127);
                break L3;
              } else {
                var4_ref_String = jm.field_g.toString();
                int discarded$30 = -1;
                if (!mw.a(var4_ref_String)) {
                  L4: {
                    var5 = gk.field_d;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      if (pw.field_w == null) {
                        break L4;
                      } else {
                        var5 = 1;
                        break L4;
                      }
                    }
                  }
                  if (af.a(var5, 26291) != 2) {
                    no.a(-1, gk.field_d, 109, var4_ref_String, bd.field_k, param0);
                    break L3;
                  } else {
                    fk.a(116, var5, param2, 1);
                    no.a(-1, gk.field_d, 109, var4_ref_String, bd.field_k, param0);
                    bea.d(-127);
                    break L3;
                  }
                } else {
                  int discarded$31 = 2;
                  vf.a((String) null, 0, 125, (String) null, qo.field_b);
                  int discarded$32 = 2;
                  vf.a((String) null, 0, 125, (String) null, mi.field_n);
                  bea.d(-127);
                  break L3;
                }
              }
            }
            return true;
          }
        } else {
          if (85 != gf.field_k) {
            var4 = dla.field_j;
            int discarded$33 = 376;
            if (hs.a((char) var4)) {
              if (var3 != 0) {
                if (jm.field_g.length() < 80) {
                  L5: {
                    StringBuilder discarded$34 = jm.field_g.append((char) var4);
                    var5 = 485;
                    var13 = cha.field_l;
                    var12 = kba.a(-127, var13);
                    var14 = var12;
                    if (gk.field_d == 2) {
                      var18 = (CharSequence) (Object) bd.field_k;
                      int discarded$35 = 7995;
                      var16 = lga.a(true, new String[1], iia.field_q);
                      var8 = lga.a(true, new String[1], wla.field_n);
                      var9 = dc.field_r.a(var16);
                      var10 = dc.field_r.a(var8);
                      if (var10 < var9) {
                        var5 = var5 - var9;
                        break L5;
                      } else {
                        var5 = var5 - var10;
                        if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                          return true;
                        } else {
                          int discarded$36 = 32;
                          StringBuilder discarded$37 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                          return true;
                        }
                      }
                    } else {
                      var7 = "";
                      if (gk.field_d == 0) {
                        if (null == pw.field_w) {
                          L6: {
                            if (am.field_O) {
                              var7 = "[" + cja.field_r + "] ";
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (pw.field_w != null) {
                            if (!ada.field_k) {
                              var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                              var15 = var7 + var14 + ": ";
                              var5 = var5 - dc.field_r.a(var15);
                              if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                int discarded$38 = 32;
                                StringBuilder discarded$39 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (null == jc.field_n) {
                                var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                var15 = var7 + var14 + ": ";
                                var5 = var5 - dc.field_r.a(var15);
                                if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                  int discarded$40 = 32;
                                  StringBuilder discarded$41 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                var7 = "[" + jc.field_n + "] ";
                                var15 = var7 + var14 + ": ";
                                var5 = var5 - dc.field_r.a(var15);
                                if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                  int discarded$42 = 32;
                                  StringBuilder discarded$43 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          } else {
                            var15 = var7 + var14 + ": ";
                            var5 = var5 - dc.field_r.a(var15);
                            break L5;
                          }
                        } else {
                          if (pw.field_w != null) {
                            if (ada.field_k) {
                              if (null == jc.field_n) {
                                var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                var15 = var7 + var14 + ": ";
                                var5 = var5 - dc.field_r.a(var15);
                                if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                  int discarded$44 = 32;
                                  StringBuilder discarded$45 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                L7: {
                                  var7 = "[" + jc.field_n + "] ";
                                  var15 = var7 + var14 + ": ";
                                  var5 = var5 - dc.field_r.a(var15);
                                  if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                                    break L7;
                                  } else {
                                    int discarded$46 = 32;
                                    StringBuilder discarded$47 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                    break L7;
                                  }
                                }
                                return true;
                              }
                            } else {
                              L8: {
                                var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                var15 = var7 + var14 + ": ";
                                var5 = var5 - dc.field_r.a(var15);
                                if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                                  break L8;
                                } else {
                                  int discarded$48 = 32;
                                  StringBuilder discarded$49 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                                  break L8;
                                }
                              }
                              return true;
                            }
                          } else {
                            var15 = var7 + var14 + ": ";
                            var5 = var5 - dc.field_r.a(var15);
                            if (var5 < dc.field_r.a(jm.field_g.toString())) {
                              int discarded$50 = 32;
                              StringBuilder discarded$51 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                              return true;
                            } else {
                              return true;
                            }
                          }
                        }
                      } else {
                        var15 = var7 + var14 + ": ";
                        var5 = var5 - dc.field_r.a(var15);
                        if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                          return true;
                        } else {
                          int discarded$52 = 32;
                          StringBuilder discarded$53 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                          return true;
                        }
                      }
                    }
                  }
                  if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                    return true;
                  } else {
                    int discarded$54 = 32;
                    StringBuilder discarded$55 = sw.a(jm.field_g, 4, -1 + jm.field_g.length());
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            L9: {
              if (var3 == 0) {
                break L9;
              } else {
                if (0 < jm.field_g.length()) {
                  int discarded$56 = 32;
                  StringBuilder discarded$57 = sw.a(jm.field_g, 4, jm.field_g.length() - 1);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            return true;
          }
        }
    }

    public vaa() {
        this(-1, 1000000, 1000000);
    }

    private vaa(int param0, int param1, int param2) {
    }

    final static String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_19_0 = null;
        String stackOut_35_0 = null;
        String stackOut_31_0 = null;
        String stackOut_28_0 = null;
        String stackOut_25_0 = null;
        String stackOut_22_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_2_0 = lga.a(true, new String[1], lca.field_r);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 == 2) {
                stackOut_6_0 = lga.a(true, new String[1], il.field_e);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 != 3) {
                  if (param1 != 4) {
                    if (param1 != 5) {
                      if (param1 == 6) {
                        stackOut_19_0 = lga.a(true, new String[1], fr.field_s);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (param1 != 11) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackOut_35_0 = lga.a(true, new String[1], kc.field_a);
                                  stackIn_36_0 = stackOut_35_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackOut_31_0 = lga.a(true, new String[1], rr.field_x);
                                stackIn_32_0 = stackOut_31_0;
                                return stackIn_32_0;
                              }
                            } else {
                              stackOut_28_0 = lga.a(true, new String[1], ek.field_o);
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            }
                          } else {
                            stackOut_25_0 = lga.a(true, new String[1], ru.field_j);
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        } else {
                          stackOut_22_0 = lga.a(true, new String[1], hia.field_i);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    } else {
                      stackOut_15_0 = lga.a(true, new String[1], gw.field_c);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = lga.a(true, new String[1], tn.field_b);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = lga.a(true, new String[1], wia.field_c);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("vaa.A(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L1;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ',' + -1 + ')');
        }
        return stackIn_36_0;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final void a(lu param0, byte[] param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
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
                L1: {
                  if (31 != param0.field_h[param0.field_g]) {
                    break L1;
                  } else {
                    if (param0.field_h[param0.field_g - -1] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (((vaa) this).field_e == null) {
                          ((vaa) this).field_e = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((vaa) this).field_e.setInput(param0.field_h, 10 + param0.field_g, param0.field_h.length + -8 + (-param0.field_g + param2));
                          int discarded$2 = ((vaa) this).field_e.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((vaa) this).field_e.reset();
                        throw new RuntimeException("");
                      }
                      ((vaa) this).field_e.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) runtimeException;
                stackOut_12_1 = new StringBuilder().append("vaa.C(");
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param0 == null) {
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
              L5: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
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
              throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Solicitation";
        field_f = -1;
    }
}
