/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends sqa {
    private boolean field_e;
    int[] field_i;
    int field_c;
    int field_h;
    private vna field_g;
    static iu[] field_f;
    static String field_d;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; ((w) this).field_i.length > var2; var2++) {
            ((w) this).field_i[var2] = 0;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        fla var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 < -118) {
          var4 = (fla) (Object) ((w) this).field_g.f(-80);
          L0: while (true) {
            if (var4 == null) {
              ((w) this).field_g.d(8);
              this.a(true);
              return;
            } else {
              rs.a(var4, 107);
              var4 = (fla) (Object) ((w) this).field_g.e(107);
              continue L0;
            }
          }
        } else {
          ((w) this).field_g = null;
          var4 = (fla) (Object) ((w) this).field_g.f(-80);
          L1: while (true) {
            if (var4 == null) {
              ((w) this).field_g.d(8);
              this.a(true);
              return;
            } else {
              rs.a(var4, 107);
              var4 = (fla) (Object) ((w) this).field_g.e(107);
              continue L1;
            }
          }
        }
    }

    final static int a(uia param0, int param1, vna param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = new StringBuilder(8);
            var4 = 0;
            var5 = -1;
            L1: while (true) {
              L2: {
                if (param0.field_h >= param0.field_g.length) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.h(255);
                    if (var5 != dia.field_q) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!qqa.a(param0, mga.field_j, var5, true)) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (uqa.field_w == var5) {
                    L5: {
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (param0.field_g.length != param0.field_h - -1) {
                          L6: {
                            var6 = param0.c((byte) 52);
                            if (qqa.a(param0, mga.field_j, var6, true)) {
                              break L6;
                            } else {
                              if (dia.field_q != var6) {
                                if (uqa.field_w == var6) {
                                  StringBuilder discarded$3 = var8.append((char)var6);
                                  break L5;
                                } else {
                                  param0.field_h = param0.field_h - 1;
                                  StringBuilder discarded$4 = var8.append((char)var5);
                                  break L5;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          param0.field_h = param0.field_h - 1;
                          break L5;
                        } else {
                          throw new RuntimeException("Unterminated quote!");
                        }
                      }
                    }
                    L7: {
                      if (var4 != 0) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L7;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L7;
                      }
                    }
                    var4 = stackIn_24_0;
                    continue L1;
                  } else {
                    StringBuilder discarded$5 = var8.append((char)var5);
                    continue L1;
                  }
                }
              }
              L8: {
                param2.b((byte) -59, (vg) (Object) new gka(var8.toString()));
                if (param1 == -58) {
                  break L8;
                } else {
                  field_d = null;
                  break L8;
                }
              }
              stackOut_27_0 = var5;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("w.O(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_28_0;
    }

    final fla a(fm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vb var11 = null;
        fla var12 = null;
        Object stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        fla stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        fla stackOut_36_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_10_0 = null;
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
            var3_int = param0.e(9800);
            if (!((w) this).field_e) {
              if (((w) this).field_g.a((byte) -16) < 15) {
                if (var3_int >= 0) {
                  if (var3_int < 98) {
                    if (((w) this).field_i[var3_int] < dda.field_f[var3_int]) {
                      L1: {
                        if (26 == var3_int) {
                          ((w) this).a(-101, new fm(28, param0.b(param1 + -43), param0.a(-127), param0.c(4)));
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        if (this.a(-123, var3_int)) {
                          ((w) this).a(param1 ^ 86, new fm(89, param0.b(param1 + 105), param0.a(-121), param0.c(param1 ^ -62)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var4 = to.field_j[var3_int];
                      if (var4 != -1) {
                        L3: {
                          var5 = to.field_i[var3_int];
                          if (0 >= var5) {
                            break L3;
                          } else {
                            var4 = var4 + uca.field_c.a(var5, 0);
                            break L3;
                          }
                        }
                        L4: {
                          var6 = 0;
                          if (var3_int != 28) {
                            break L4;
                          } else {
                            var6 = 300;
                            break L4;
                          }
                        }
                        L5: {
                          if (param1 == ~var3_int) {
                            var6 = 300;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var3_int == 89) {
                            var6 = 300;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var7 = to.field_m[var3_int] ? 1 : 0;
                          var8 = to.field_k[var3_int] ? 1 : 0;
                          var9 = -1;
                          var10 = to.field_n[var3_int];
                          if (var8 != 0) {
                            break L7;
                          } else {
                            var9 = jba.a(((w) this).field_h, true, param0.b(param1 + -52));
                            var10 = ol.a(param0.b(-118), var3_int, (byte) -91, ((w) this).field_h, param0.a(-121), ((w) this).field_c);
                            break L7;
                          }
                        }
                        L8: {
                          var11 = v.a(100, (byte) -58, var9, var4, var6, var10);
                          if (var7 != 0) {
                            var11.field_f.b(-1);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12 = new fla(var11, var3_int, var7 != 0, var4, var10, var9);
                        ((w) this).field_g.b((byte) -100, (vg) (Object) var12);
                        ((w) this).field_i[var3_int] = ((w) this).field_i[var3_int] + 1;
                        stackOut_36_0 = (fla) var12;
                        stackIn_37_0 = stackOut_36_0;
                        break L0;
                      } else {
                        stackOut_19_0 = null;
                        stackIn_20_0 = stackOut_19_0;
                        return (fla) (Object) stackIn_20_0;
                      }
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (fla) (Object) stackIn_11_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("w.H(");
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
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 41);
        }
        return stackIn_37_0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 < 9) {
            ((w) this).field_g = null;
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != 0) {
          L0: {
            ((w) this).a(110, true);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((w) this).field_e = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((w) this).field_e = stackIn_4_1 != 0;
          return;
        }
    }

    private final boolean a(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 <= -89) {
          if (param1 != 85) {
            if (param1 != 86) {
              L0: {
                if (87 == param1) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (88 != param1) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_20_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((w) this).field_g = null;
          if (param1 != 85) {
            if (param1 != 86) {
              L1: {
                if (87 == param1) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                } else {
                  if (88 != param1) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_10_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
    }

    final void b(int param0, int param1, int param2) {
        ((w) this).field_h = param1;
        if (param2 != 89) {
            field_d = null;
            ((w) this).field_c = param0;
            return;
        }
        ((w) this).field_c = param0;
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        fm var5 = null;
        fla var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = (fm) (Object) ((w) this).field_b.f(-80);
        L0: while (true) {
          if (var5 == null) {
            if (param0 >= 75) {
              var6 = (fla) (Object) ((w) this).field_g.f(-80);
              L1: while (true) {
                if (var6 == null) {
                  return;
                } else {
                  var6.a(564550600, (w) this, param1);
                  var6 = (fla) (Object) ((w) this).field_g.e(110);
                  continue L1;
                }
              }
            } else {
              boolean discarded$5 = this.a(53, -23);
              var6 = (fla) (Object) ((w) this).field_g.f(-80);
              L2: while (true) {
                if (var6 == null) {
                  return;
                } else {
                  var6.a(564550600, (w) this, param1);
                  var6 = (fla) (Object) ((w) this).field_g.e(110);
                  continue L2;
                }
              }
            }
          } else {
            fla discarded$6 = ((w) this).a(var5, -58);
            var5.p(15);
            var5 = (fm) (Object) ((w) this).field_b.e(124);
            continue L0;
          }
        }
    }

    public w() {
        ((w) this).field_i = new int[98];
        ((w) this).field_g = new vna();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Offering Rematch";
    }
}
