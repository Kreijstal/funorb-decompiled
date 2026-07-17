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
        Object var12 = null;
        Object var13 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        Object var26 = null;
        CharSequence var27 = null;
        CharSequence var28 = null;
        CharSequence var29 = null;
        CharSequence var30 = null;
        CharSequence var31 = null;
        L0: {
          var20 = null;
          var21 = null;
          var22 = null;
          var23 = null;
          var24 = null;
          var25 = null;
          var26 = null;
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
            if (hv.a(-19229)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (param1 == 1) {
          if (84 == gf.field_k) {
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (jm.field_g.length() <= 0) {
                    break L4;
                  } else {
                    L5: {
                      var4_ref_String = jm.field_g.toString();
                      var7 = var4_ref_String;
                      var7 = var4_ref_String;
                      if (!mw.a(var4_ref_String, -1)) {
                        break L5;
                      } else {
                        var13 = null;
                        var12 = null;
                        vf.a((String) null, 0, 125, (String) null, qo.field_b, 2);
                        vf.a((String) null, 0, param1 + 124, (String) null, mi.field_n, 2);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var5 = gk.field_d;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (pw.field_w == null) {
                          break L6;
                        } else {
                          var5 = 1;
                          break L6;
                        }
                      }
                    }
                    if (af.a(var5, 26291) != 2) {
                      no.a(-1, gk.field_d, param1 + 108, var4_ref_String, bd.field_k, param0);
                      break L4;
                    } else {
                      fk.a(116, var5, param2, 1);
                      no.a(-1, gk.field_d, param1 + 108, var4_ref_String, bd.field_k, param0);
                      break L4;
                    }
                  }
                }
                bea.d(param1 ^ -128);
                if (var11 != 0) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
            if (gk.field_d == 0) {
              return true;
            } else {
              bea.d(-111);
              return true;
            }
          } else {
            if (85 != gf.field_k) {
              var4 = dla.field_j;
              if (hs.a((char) var4, 376)) {
                if (var3 != 0) {
                  if (jm.field_g.length() < 80) {
                    L7: {
                      L8: {
                        StringBuilder discarded$7 = jm.field_g.append(var4);
                        var5 = 485;
                        var16 = cha.field_l;
                        var18 = var16;
                        var7 = var18;
                        var7 = var16;
                        var15 = kba.a(param1 + -128, var16);
                        var18 = var15;
                        var7 = var18;
                        var7 = var15;
                        var17 = var15;
                        var18 = var17;
                        var7 = var18;
                        var7 = var17;
                        if (gk.field_d == 2) {
                          break L8;
                        } else {
                          var7 = "";
                          var18 = var7;
                          var7 = var18;
                          if (gk.field_d == 0) {
                            L9: {
                              if (null != pw.field_w) {
                                break L9;
                              } else {
                                if (am.field_O) {
                                  var7 = "[" + cja.field_r + "] ";
                                  break L9;
                                } else {
                                  if (pw.field_w != null) {
                                    L10: {
                                      L11: {
                                        if (!ada.field_k) {
                                          break L11;
                                        } else {
                                          if (null == jc.field_n) {
                                            break L11;
                                          } else {
                                            var7 = "[" + jc.field_n + "] ";
                                            if (var11 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                      break L10;
                                    }
                                    L12: {
                                      var18 = var7 + var17 + ": ";
                                      var5 = var5 - dc.field_r.a(var18);
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        L13: {
                                          var29 = (CharSequence) (Object) bd.field_k;
                                          var19 = lga.a(true, new String[1], iia.field_q);
                                          var8 = lga.a(true, new String[1], wla.field_n);
                                          var9 = dc.field_r.a(var19);
                                          var10 = dc.field_r.a(var8);
                                          if (var10 < var9) {
                                            break L13;
                                          } else {
                                            var5 = var5 - var10;
                                            break L13;
                                          }
                                        }
                                        var5 = var5 - var9;
                                        break L12;
                                      }
                                    }
                                    if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                      StringBuilder discarded$8 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                      return true;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L14: {
                                      var18 = var7 + var17 + ": ";
                                      var7 = var18;
                                      var7 = var18;
                                      var5 = var5 - dc.field_r.a(var18);
                                      if (var11 == 0) {
                                        break L14;
                                      } else {
                                        L15: {
                                          var28 = (CharSequence) (Object) bd.field_k;
                                          var19 = lga.a(true, new String[1], iia.field_q);
                                          var7 = var19;
                                          var7 = var19;
                                          var8 = lga.a(true, new String[1], wla.field_n);
                                          var7 = var8;
                                          var7 = var8;
                                          var9 = dc.field_r.a(var19);
                                          var10 = dc.field_r.a(var8);
                                          if (var10 < var9) {
                                            break L15;
                                          } else {
                                            var5 = var5 - var10;
                                            break L15;
                                          }
                                        }
                                        var5 = var5 - var9;
                                        break L14;
                                      }
                                    }
                                    L16: {
                                      if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                                        break L16;
                                      } else {
                                        StringBuilder discarded$9 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                        break L16;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                            }
                            if (pw.field_w != null) {
                              L17: {
                                L18: {
                                  if (!ada.field_k) {
                                    break L18;
                                  } else {
                                    if (null == jc.field_n) {
                                      break L18;
                                    } else {
                                      var7 = "[" + jc.field_n + "] ";
                                      if (var11 == 0) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var7 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                                break L17;
                              }
                              var18 = var7 + var17 + ": ";
                              var5 = var5 - dc.field_r.a(var18);
                              if (var11 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              L19: {
                                var18 = var7 + var17 + ": ";
                                var7 = var18;
                                var7 = var18;
                                var5 = var5 - dc.field_r.a(var18);
                                if (var11 == 0) {
                                  break L19;
                                } else {
                                  L20: {
                                    var30 = (CharSequence) (Object) bd.field_k;
                                    var19 = lga.a(true, new String[1], iia.field_q);
                                    var7 = var19;
                                    var7 = var19;
                                    var8 = lga.a(true, new String[1], wla.field_n);
                                    var7 = var8;
                                    var7 = var8;
                                    var9 = dc.field_r.a(var19);
                                    var10 = dc.field_r.a(var8);
                                    if (var10 < var9) {
                                      break L20;
                                    } else {
                                      var5 = var5 - var10;
                                      break L20;
                                    }
                                  }
                                  var5 = var5 - var9;
                                  break L19;
                                }
                              }
                              if (var5 < dc.field_r.a(jm.field_g.toString())) {
                                StringBuilder discarded$10 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                                return true;
                              } else {
                                return true;
                              }
                            }
                          } else {
                            L21: {
                              var18 = var7 + var17 + ": ";
                              var7 = var18;
                              var7 = var18;
                              var5 = var5 - dc.field_r.a(var18);
                              if (var11 == 0) {
                                break L21;
                              } else {
                                L22: {
                                  var27 = (CharSequence) (Object) bd.field_k;
                                  var19 = lga.a(true, new String[1], iia.field_q);
                                  var7 = var19;
                                  var7 = var19;
                                  var8 = lga.a(true, new String[1], wla.field_n);
                                  var7 = var8;
                                  var7 = var8;
                                  var9 = dc.field_r.a(var19);
                                  var10 = dc.field_r.a(var8);
                                  if (var10 < var9) {
                                    break L22;
                                  } else {
                                    var5 = var5 - var10;
                                    break L22;
                                  }
                                }
                                var5 = var5 - var9;
                                break L21;
                              }
                            }
                            if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                              return true;
                            } else {
                              StringBuilder discarded$11 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
                              return true;
                            }
                          }
                        }
                      }
                      L23: {
                        var31 = (CharSequence) (Object) bd.field_k;
                        var19 = lga.a(true, new String[1], iia.field_q);
                        var8 = lga.a(true, new String[1], wla.field_n);
                        var9 = dc.field_r.a(var19);
                        var10 = dc.field_r.a(var8);
                        if (var10 < var9) {
                          break L23;
                        } else {
                          var5 = var5 - var10;
                          if (var11 == 0) {
                            break L7;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var5 = var5 - var9;
                      break L7;
                    }
                    if (var5 >= dc.field_r.a(jm.field_g.toString())) {
                      return true;
                    } else {
                      StringBuilder discarded$12 = sw.a(jm.field_g, 4, -1 + jm.field_g.length(), ' ');
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
              if (var3 != 0) {
                if (0 >= jm.field_g.length()) {
                  return true;
                } else {
                  StringBuilder discarded$13 = sw.a(jm.field_g, param1 ^ 5, jm.field_g.length() - 1, ' ');
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public vaa() {
        this(-1, 1000000, 1000000);
    }

    private vaa(int param0, int param1, int param2) {
    }

    final static String a(String param0, int param1, int param2) {
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
          throw pe.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 44 + -1 + 41);
        }
        return stackIn_36_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -1) {
            return;
        }
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
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
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
              throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
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
