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
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          this.field_g = (vna) null;
          var2 = 0;
          L0: while (true) {
            if (this.field_i.length <= var2) {
              return;
            } else {
              this.field_i[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L1: while (true) {
            if (this.field_i.length <= var2) {
              return;
            } else {
              this.field_i[var2] = 0;
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0) {
        int var3;
        fla var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 < -118) {
          var4 = (fla) ((Object) this.field_g.f(-80));
          L0: while (true) {
            if (var4 == null) {
              this.field_g.d(8);
              this.a(true);
              return;
            } else {
              rs.a(var4, 107);
              var4 = (fla) ((Object) this.field_g.e(107));
              continue L0;
            }
          }
        } else {
          this.field_g = (vna) null;
          var4 = (fla) ((Object) this.field_g.f(-80));
          L1: while (true) {
            if (var4 == null) {
              this.field_g.d(8);
              this.a(true);
              return;
            } else {
              rs.a(var4, 107);
              var4 = (fla) ((Object) this.field_g.e(107));
              continue L1;
            }
          }
        }
    }

    final static int a(uia param0, int param1, vna param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
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
                    if ((var5 ^ -1) != (dia.field_q ^ -1)) {
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
                                  discarded$0 = var8.append((char)var6);
                                  break L5;
                                } else {
                                  param0.field_h = param0.field_h - 1;
                                  discarded$1 = var8.append((char)var5);
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
                        stackIn_26_0 = 0;
                        break L7;
                      } else {
                        stackIn_26_0 = 1;
                        break L7;
                      }
                    }
                    var4 = stackIn_26_0;
                    continue L1;
                  } else {
                    discarded$2 = var8.append((char)var5);
                    continue L1;
                  }
                }
              }
              L8: {
                param2.b((byte) -59, new gka(var8.toString()));
                if (param1 == -58) {
                  break L8;
                } else {
                  field_d = (String) null;
                  break L8;
                }
              }
              stackIn_30_0 = var5;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("w.O(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ')');
        }
        return stackIn_30_0;
    }

    final fla a(fm param0, int param1) {
        Object stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        fla stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            var3_int = param0.e(9800);
            if (!this.field_e) {
              if (-16 < (this.field_g.a((byte) -16) ^ -1)) {
                if (var3_int >= 0) {
                  if ((var3_int ^ -1) > -99) {
                    if (this.field_i[var3_int] < dda.field_f[var3_int]) {
                      L1: {
                        if (26 == var3_int) {
                          this.a(-101, new fm(28, param0.b(param1 + -43), param0.a(-127), param0.c(4)));
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        if (this.a(-123, var3_int)) {
                          this.a(param1 ^ 86, new fm(89, param0.b(param1 + 105), param0.a(-121), param0.c(param1 ^ -62)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var4 = to.field_j[var3_int];
                      if (0 != (var4 ^ -1)) {
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
                          if ((var3_int ^ -1) != -29) {
                            break L4;
                          } else {
                            var6 = 300;
                            break L4;
                          }
                        }
                        L5: {
                          if (param1 == (var3_int ^ -1)) {
                            var6 = 300;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if ((var3_int ^ -1) == -90) {
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
                            var9 = jba.a(this.field_h, true, param0.b(param1 + -52));
                            var10 = ol.a(param0.b(-118), var3_int, (byte) -91, this.field_h, param0.a(-121), this.field_c);
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
                        this.field_g.b((byte) -100, var12);
                        this.field_i[var3_int] = this.field_i[var3_int] + 1;
                        stackIn_37_0 = (fla) (var12);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_20_0 = null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("w.H(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L9;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fla) ((Object) stackIn_11_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fla) ((Object) stackIn_20_0);
          } else {
            return stackIn_37_0;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 < 9) {
            this.field_g = (vna) null;
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 != 0) {
          L0: {
            this.a(110, true);
            stackIn_7_0 = this;

            if (!param0) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((w) (this)).field_e = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((w) (this)).field_e = stackIn_4_1 != 0;
          return;
        }
    }

    private final boolean a(int param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 <= -89) {
          if (-86 != (param1 ^ -1)) {
            if (-87 != (param1 ^ -1)) {
              if (87 != param1) {
                if (88 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.field_g = (vna) null;
          if (-86 != (param1 ^ -1)) {
            if (-87 != (param1 ^ -1)) {
              if (87 != param1) {
                if (88 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
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
            field_f = (iu[]) null;
            field_d = null;
            field_f = null;
            return;
        }
        field_d = null;
        field_f = null;
    }

    final void b(int param0, int param1, int param2) {
        this.field_h = param1;
        if (param2 != 89) {
            field_d = (String) null;
            this.field_c = param0;
            return;
        }
        this.field_c = param0;
    }

    final void a(int param0, boolean param1) {
        boolean discarded$2 = false;
        int var4;
        fm var5;
        fla var6;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = (fm) ((Object) this.field_b.f(-80));
        L0: while (true) {
          if (var5 == null) {
            if (param0 >= 75) {
              var6 = (fla) ((Object) this.field_g.f(-80));
              L1: while (true) {
                if (var6 == null) {
                  return;
                } else {
                  var6.a(564550600, (w) (this), param1);
                  var6 = (fla) ((Object) this.field_g.e(110));
                  continue L1;
                }
              }
            } else {
              discarded$2 = this.a(53, -23);
              var6 = (fla) ((Object) this.field_g.f(-80));
              L2: while (true) {
                if (var6 == null) {
                  return;
                } else {
                  var6.a(564550600, (w) (this), param1);
                  var6 = (fla) ((Object) this.field_g.e(110));
                  continue L2;
                }
              }
            }
          } else {
            this.a(var5, -58);
            var5.p(15);
            var5 = (fm) ((Object) this.field_b.e(124));
            continue L0;
          }
        }
    }

    public w() {
        this.field_i = new int[98];
        this.field_g = new vna();
    }

    static {
        field_d = "Offering Rematch";
    }
}
