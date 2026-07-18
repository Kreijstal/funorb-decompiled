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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_17_0 = 0;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (qh.field_l) {
                break L1;
              } else {
                if (bi.field_h != null) {
                  break L1;
                } else {
                  var3_int = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (0 != gk.field_d) {
                break L2;
              } else {
                if (null == rv.field_n) {
                  break L2;
                } else {
                  var3_int = 0;
                  break L2;
                }
              }
            }
            L3: {
              if (gk.field_d != 2) {
                break L3;
              } else {
                if (hv.a(-19229)) {
                  break L3;
                } else {
                  var3_int = 0;
                  break L3;
                }
              }
            }
            if (param1 == 1) {
              if (84 == gf.field_k) {
                L4: {
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (jm.field_g.length() <= 0) {
                          break L6;
                        } else {
                          L7: {
                            var4_ref_String = jm.field_g.toString();
                            if (!mw.a(var4_ref_String, -1)) {
                              break L7;
                            } else {
                              vf.a((String) null, 0, 125, (String) null, qo.field_b, 2);
                              vf.a((String) null, 0, param1 + 124, (String) null, mi.field_n, 2);
                              if (var11 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var5 = gk.field_d;
                            if (var5 != 0) {
                              break L8;
                            } else {
                              if (pw.field_w == null) {
                                break L8;
                              } else {
                                var5 = 1;
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (af.a(var5, 26291) != 2) {
                              break L9;
                            } else {
                              fk.a(116, var5, param2, 1);
                              break L9;
                            }
                          }
                          no.a(-1, gk.field_d, param1 + 108, var4_ref_String, bd.field_k, param0);
                          break L6;
                        }
                      }
                      bea.d(param1 ^ -128);
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (gk.field_d != 0) {
                    bea.d(-111);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_46_0 = 1;
                stackIn_47_0 = stackOut_46_0;
                return stackIn_47_0 != 0;
              } else {
                if (85 != gf.field_k) {
                  var4 = dla.field_j;
                  if (!hs.a((char) var4, 376)) {
                    stackOut_98_0 = 0;
                    stackIn_99_0 = stackOut_98_0;
                    break L0;
                  } else {
                    L10: {
                      if (var3_int == 0) {
                        break L10;
                      } else {
                        if (jm.field_g.length() < 80) {
                          L11: {
                            L12: {
                              StringBuilder discarded$3 = jm.field_g.append((char) var4);
                              var5 = 485;
                              var6 = cha.field_l;
                              var6 = kba.a(param1 + -128, var6);
                              if (gk.field_d == 2) {
                                break L12;
                              } else {
                                L13: {
                                  var7 = "";
                                  if (gk.field_d == 0) {
                                    L14: {
                                      if (null != pw.field_w) {
                                        break L14;
                                      } else {
                                        if (am.field_O) {
                                          var7 = "[" + cja.field_r + "] ";
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (pw.field_w != null) {
                                      L15: {
                                        if (!ada.field_k) {
                                          break L15;
                                        } else {
                                          if (null == jc.field_n) {
                                            break L15;
                                          } else {
                                            var7 = "[" + jc.field_n + "] ";
                                            if (var11 == 0) {
                                              break L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                                var7 = var7 + var6 + ": ";
                                var5 = var5 - dc.field_r.a(var7);
                                if (var11 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L16: {
                              var7 = lga.a(true, new String[1], iia.field_q);
                              var8 = lga.a(true, new String[1], wla.field_n);
                              var9 = dc.field_r.a(var7);
                              var10 = dc.field_r.a(var8);
                              if (~var10 > ~var9) {
                                break L16;
                              } else {
                                var5 = var5 - var10;
                                if (var11 == 0) {
                                  break L11;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var5 = var5 - var9;
                            break L11;
                          }
                          if (~var5 <= ~dc.field_r.a(jm.field_g.toString())) {
                            break L10;
                          } else {
                            StringBuilder discarded$4 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    stackOut_96_0 = 1;
                    stackIn_97_0 = stackOut_96_0;
                    return stackIn_97_0 != 0;
                  }
                } else {
                  L17: {
                    if (var3_int == 0) {
                      break L17;
                    } else {
                      if (0 < jm.field_g.length()) {
                        StringBuilder discarded$5 = sw.a(jm.field_g, param1 ^ 5, jm.field_g.length() - 1, ' ');
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  stackOut_58_0 = 1;
                  stackIn_59_0 = stackOut_58_0;
                  return stackIn_59_0 != 0;
                }
              }
            } else {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vaa.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_99_0 != 0;
    }

    public vaa() {
        this(-1, 1000000, 1000000);
    }

    private vaa(int param0, int param1, int param2) {
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_38_0 = null;
        String stackIn_41_0 = null;
        Object stackIn_43_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        String stackOut_25_0 = null;
        Object stackOut_42_0 = null;
        String stackOut_40_0 = null;
        String stackOut_37_0 = null;
        String stackOut_34_0 = null;
        String stackOut_31_0 = null;
        String stackOut_28_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_3_0 = lga.a(true, new String[1], lca.field_r);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == 2) {
                stackOut_8_0 = lga.a(true, new String[1], il.field_e);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param1 != 3) {
                  if (param1 != 4) {
                    if (param1 != 5) {
                      L1: {
                        if (param2 == -1) {
                          break L1;
                        } else {
                          field_a = null;
                          break L1;
                        }
                      }
                      if (param1 == 6) {
                        stackOut_25_0 = lga.a(true, new String[1], fr.field_s);
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (param1 != 11) {
                              if (param1 != 12) {
                                if (13 != param1) {
                                  stackOut_42_0 = null;
                                  stackIn_43_0 = stackOut_42_0;
                                  break L0;
                                } else {
                                  stackOut_40_0 = lga.a(true, new String[1], kc.field_a);
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0;
                                }
                              } else {
                                stackOut_37_0 = lga.a(true, new String[1], rr.field_x);
                                stackIn_38_0 = stackOut_37_0;
                                return stackIn_38_0;
                              }
                            } else {
                              stackOut_34_0 = lga.a(true, new String[1], ek.field_o);
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0;
                            }
                          } else {
                            stackOut_31_0 = lga.a(true, new String[1], ru.field_j);
                            stackIn_32_0 = stackOut_31_0;
                            return stackIn_32_0;
                          }
                        } else {
                          stackOut_28_0 = lga.a(true, new String[1], hia.field_i);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      }
                    } else {
                      stackOut_17_0 = lga.a(true, new String[1], gw.field_c);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  } else {
                    stackOut_14_0 = lga.a(true, new String[1], tn.field_b);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_11_0 = lga.a(true, new String[1], wia.field_c);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var3;
            stackOut_44_1 = new StringBuilder().append("vaa.A(");
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L2;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_43_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -1) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vaa.D(" + param0 + ')');
        }
    }

    final void a(lu param0, byte[] param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
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
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var4;
                stackOut_16_1 = new StringBuilder().append("vaa.C(");
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L4;
                }
              }
              L5: {
                stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L5;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L5;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
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
