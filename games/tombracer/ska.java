/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ska extends nv implements mra {
    private boolean field_t;
    private mg field_n;
    private boolean field_o;
    static kia field_r;
    private boolean field_p;
    private roa field_u;
    private boolean field_s;
    static String[] field_q;

    final void a(boolean param0, fsa param1) {
        try {
            if (!param0) {
                this.field_p = false;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static mi a(int param0, in param1) {
        int fieldTemp$4 = 0;
        StringBuilder discarded$5 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        mi stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -45) {
                break L1;
              } else {
                field_r = (kia) null;
                break L1;
              }
            }
            fieldTemp$4 = param1.field_b - 1;
            param1.field_b = param1.field_b - 1;
            var2_int = fieldTemp$4;
            var3 = new StringBuilder();
            L2: while (true) {
              L3: {
                if (param1.a(0)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var4 = param1.b(param0 + 21143);
                      if (Character.isWhitespace((char) var4)) {
                        break L5;
                      } else {
                        if (var4 == 44) {
                          break L5;
                        } else {
                          if (var4 == 40) {
                            break L5;
                          } else {
                            if (41 != var4) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    param1.field_b = param1.field_b - 1;
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                  discarded$5 = var3.append((char) var4);
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                L7: {
                  L8: {
                    var5 = var3.toString();
                    if (var5.equals("true")) {
                      break L8;
                    } else {
                      if (!var5.equals("false")) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var4 = dja.field_r;
                  if (var6 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (45 == var5.charAt(0)) {
                    break L9;
                  } else {
                    if (Character.isDigit(var5.charAt(0))) {
                      break L9;
                    } else {
                      var4 = tr.field_f;
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var4 = dc.field_o;
                break L6;
              }
              stackOut_22_0 = new mi(var4, var2_int, var5);
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("ska.V(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final void a(roa param0, byte param1) {
        int discarded$0 = 0;
        try {
            if (param1 < 40) {
                discarded$0 = this.a(true);
            }
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, mg param1) {
        roa discarded$0 = null;
        try {
            if (param0 < 81) {
                discarded$0 = this.l(-69);
            }
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ska(la param0, boolean param1) {
        super(param0, param1);
        this.field_o = true;
        try {
            this.field_n = new mg();
            this.field_u = ci.a(0, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_n.a(15637, param1);
            this.field_u.a(param1, (byte) 84);
            param1.a((byte) -128, this.field_o ? 1 : 0, 1);
            param1.a((byte) -128, this.field_p ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != 884207088) {
            return;
        }
        field_q = null;
    }

    public final boolean b(int param0) {
        int var2 = 0;
        var2 = -86 / ((param0 - 37) / 45);
        if (this.field_t) {
          if (!this.field_f) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final roa l(int param0) {
        if (param0 != -2) {
            ska.c(-6);
            return this.field_u;
        }
        return this.field_u;
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            this.field_s = true;
            return true;
        }
        return true;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = 31 / ((59 - param0) / 41);
        if (param1 <= param2) {
          return rra.a(false, (param1 << 884207088) / param2);
        } else {
          return 2048 + -rra.a(false, (param2 << 1344739600) / param1);
        }
    }

    final boolean g(byte param0) {
        if (param0 == -68) {
          if (this.field_s) {
            if (!this.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_n = (mg) null;
          if (this.field_s) {
            if (!this.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void m(int param0) {
        int var2 = 0;
        if (this.field_k) {
          return;
        } else {
          super.m(-65);
          var2 = 92 % ((param0 - 28) / 49);
          if (!this.field_f) {
            this.field_t = false;
            return;
          } else {
            return;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            kh var3 = (kh) null;
            this.a(true, (kh) null);
            return 20;
        }
        return 20;
    }

    ska(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        this.field_o = true;
        try {
          L0: {
            L1: {
              this.field_n = new mg(param0.field_E, param1);
              this.field_u = jl.a(param0, true, param1);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((param1.b((byte) 44, 1) ^ -1) != -2) {
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
            L2: {
              ((ska) (this)).field_o = stackIn_4_1 != 0;
              this.field_u.a(90, this.field_o);
              if (-9 < (param0.field_E ^ -1)) {
                break L2;
              } else {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((ska) (this)).field_p = stackIn_8_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("ska.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        if (!this.field_p) {
          L0: {
            if (null == this.field_n) {
              break L0;
            } else {
              this.field_n.d(0);
              if (this.field_n.c(0)) {
                L1: {
                  stackOut_42_0 = this;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_43_0 = stackOut_42_0;
                  if (this.field_s) {
                    stackOut_44_0 = this;
                    stackOut_44_1 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    break L1;
                  } else {
                    stackOut_43_0 = this;
                    stackOut_43_1 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    break L1;
                  }
                }
                ((ska) (this)).field_s = stackIn_45_1 != 0;
                break L0;
              } else {
                this.field_u.c(param0 + -5515);
                this.field_t = false;
                if (param0 == 5418) {
                  if (this.field_s) {
                    this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
                    if (this.field_u.a(12111)) {
                      return;
                    } else {
                      this.c(false);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L2: {
                    field_r = (kia) null;
                    if (!this.field_s) {
                      break L2;
                    } else {
                      this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
                      if (!this.field_u.a(12111)) {
                        this.c(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          this.field_u.c(param0 + -5515);
          this.field_t = false;
          if (param0 == 5418) {
            if (this.field_s) {
              this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
              if (!this.field_u.a(12111)) {
                this.c(false);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            field_r = (kia) null;
            if (this.field_s) {
              this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
              if (this.field_u.a(12111)) {
                return;
              } else {
                this.c(false);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (!this.m((byte) 19).u(-25561)) {
            L3: {
              if (null == this.field_n) {
                break L3;
              } else {
                this.field_n.d(0);
                if (this.field_n.c(0)) {
                  L4: {
                    stackOut_12_0 = this;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (this.field_s) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  ((ska) (this)).field_s = stackIn_15_1 != 0;
                  break L3;
                } else {
                  L5: {
                    this.field_u.c(param0 + -5515);
                    this.field_t = false;
                    if (param0 == 5418) {
                      break L5;
                    } else {
                      field_r = (kia) null;
                      break L5;
                    }
                  }
                  L6: {
                    if (!this.field_s) {
                      break L6;
                    } else {
                      this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
                      if (!this.field_u.a(12111)) {
                        this.c(false);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                }
              }
            }
            this.field_u.c(param0 + -5515);
            this.field_t = false;
            if (param0 == 5418) {
              if (this.field_s) {
                this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
                if (this.field_u.a(12111)) {
                  return;
                } else {
                  this.c(false);
                  return;
                }
              } else {
                return;
              }
            } else {
              L7: {
                field_r = (kia) null;
                if (!this.field_s) {
                  break L7;
                } else {
                  this.field_t = this.field_u.a(this.field_g.g(-25787), this.field_g.P(param0 + -5418) << -2002197072, this.e(param0 + -5412), this.field_g.d(3), this.field_g.e(param0 + 4230), this.b(true), 0, 0, et.b(this.field_g.a((byte) 55), this.field_g.c(param0 ^ -5478), 123) / 2, false);
                  if (!this.field_u.a(12111)) {
                    this.c(false);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(int param0, int param1) {
        mi discarded$2 = null;
        in var4 = null;
        param0 = upa.a(this.field_s, param0, (byte) -55);
        if (param1 > -48) {
          var4 = (in) null;
          discarded$2 = ska.a(-27, (in) null);
          param0 = upa.a(this.field_t, param0, (byte) -119);
          param0 = fs.a((byte) 89, param0, this.field_u.b(524288));
          return param0;
        } else {
          param0 = upa.a(this.field_t, param0, (byte) -119);
          param0 = fs.a((byte) 89, param0, this.field_u.b(524288));
          return param0;
        }
    }

    static {
        field_r = new kia();
        field_q = new String[100];
    }
}
