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
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          ((w) this).field_g = null;
          var2 = 0;
          L0: while (true) {
            if (((w) this).field_i.length <= var2) {
              return;
            } else {
              ((w) this).field_i[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L1: while (true) {
            if (((w) this).field_i.length <= var2) {
              return;
            } else {
              ((w) this).field_i[var2] = 0;
              var2++;
              continue L1;
            }
          }
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = new StringBuilder(8);
        var4 = 0;
        var5 = -1;
        L0: while (true) {
          if (param0.field_h < param0.field_g.length) {
            L1: {
              var5 = param0.h(255);
              if (var5 != dia.field_q) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  param2.b((byte) -59, (vg) (Object) new gka(var8.toString()));
                  if (param1 != -58) {
                    field_d = null;
                    return var5;
                  } else {
                    return var5;
                  }
                }
              }
            }
            L2: {
              if (!qqa.a(param0, mga.field_j, var5, true)) {
                break L2;
              } else {
                if (var4 != 0) {
                  break L2;
                } else {
                  L3: {
                    param2.b((byte) -59, (vg) (Object) new gka(var8.toString()));
                    if (param1 == -58) {
                      break L3;
                    } else {
                      field_d = null;
                      break L3;
                    }
                  }
                  return var5;
                }
              }
            }
            if (uqa.field_w == var5) {
              L4: {
                if (var4 == 0) {
                  break L4;
                } else {
                  if (param0.field_g.length != param0.field_h - -1) {
                    L5: {
                      var6 = param0.c((byte) 52);
                      if (qqa.a(param0, mga.field_j, var6, true)) {
                        break L5;
                      } else {
                        if (dia.field_q != var6) {
                          if (uqa.field_w == var6) {
                            StringBuilder discarded$3 = var8.append((char)var6);
                            break L4;
                          } else {
                            param0.field_h = param0.field_h - 1;
                            StringBuilder discarded$4 = var8.append((char)var5);
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    param0.field_h = param0.field_h - 1;
                    break L4;
                  } else {
                    throw new RuntimeException("Unterminated quote!");
                  }
                }
              }
              L6: {
                if (var4 != 0) {
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_30_0 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L6;
                }
              }
              var4 = stackIn_32_0;
              continue L0;
            } else {
              StringBuilder discarded$5 = var8.append((char)var5);
              continue L0;
            }
          } else {
            param2.b((byte) -59, (vg) (Object) new gka(var8.toString()));
            if (param1 != -58) {
              field_d = null;
              return var5;
            } else {
              return var5;
            }
          }
        }
    }

    final fla a(fm param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vb var11 = null;
        fla var12 = null;
        var3 = param0.e(9800);
        if (!((w) this).field_e) {
          if (-16 < (((w) this).field_g.a((byte) -16) ^ -1)) {
            if (var3 >= 0) {
              if ((var3 ^ -1) > -99) {
                if (((w) this).field_i[var3] < dda.field_f[var3]) {
                  L0: {
                    if (26 == var3) {
                      ((w) this).a(-101, new fm(28, param0.b(param1 + -43), param0.a(-127), param0.c(4)));
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if (this.a(-123, var3)) {
                      ((w) this).a(param1 ^ 86, new fm(89, param0.b(param1 + 105), param0.a(-121), param0.c(param1 ^ -62)));
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var4 = to.field_j[var3];
                  if (0 == (var4 ^ -1)) {
                    return null;
                  } else {
                    L2: {
                      var5 = to.field_i[var3];
                      if (0 >= var5) {
                        break L2;
                      } else {
                        var4 = var4 + uca.field_c.a(var5, 0);
                        break L2;
                      }
                    }
                    L3: {
                      var6 = 0;
                      if (var3 != -29) {
                        break L3;
                      } else {
                        var6 = 300;
                        break L3;
                      }
                    }
                    L4: {
                      if (param1 == var3) {
                        var6 = 300;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((var3 ^ -1) == -90) {
                        var6 = 300;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var7 = to.field_m[var3] ? 1 : 0;
                      var8 = to.field_k[var3] ? 1 : 0;
                      var9 = -1;
                      var10 = to.field_n[var3];
                      if (var8 != 0) {
                        break L6;
                      } else {
                        var9 = jba.a(((w) this).field_h, true, param0.b(param1 + -52));
                        var10 = ol.a(param0.b(-118), var3, (byte) -91, ((w) this).field_h, param0.a(-121), ((w) this).field_c);
                        break L6;
                      }
                    }
                    L7: {
                      var11 = v.a(100, (byte) -58, var9, var4, var6, var10);
                      if (var7 != 0) {
                        var11.field_f.b(-1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var12 = new fla(var11, var3, var7 != 0, var4, var10, var9);
                    ((w) this).field_g.b((byte) -100, (vg) (Object) var12);
                    ((w) this).field_i[var3] = ((w) this).field_i[var3] + 1;
                    return var12;
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
        } else {
          return null;
        }
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
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -89) {
          if (-86 != param1) {
            if (-87 != param1) {
              if (87 != param1) {
                if (88 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((w) this).field_g = null;
          if (-86 != param1) {
            if (-87 != param1) {
              if (87 != param1) {
                if (88 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -26) {
            field_f = null;
            field_d = null;
            field_f = null;
            return;
        }
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
