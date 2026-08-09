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
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        mi stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            fieldTemp$2 = param1.field_b - 1;
            param1.field_b = param1.field_b - 1;
            var2_int = fieldTemp$2;
            var3 = new StringBuilder();
            L2: while (true) {
              L3: {
                if (param1.a(0)) {
                  break L3;
                } else {
                  L4: {
                    var4 = param1.b(param0 + 21143);
                    if (Character.isWhitespace((char) var4)) {
                      break L4;
                    } else {
                      if (var4 == 44) {
                        break L4;
                      } else {
                        if (var4 == 40) {
                          break L4;
                        } else {
                          if (41 != var4) {
                            discarded$3 = var3.append((char) var4);
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  param1.field_b = param1.field_b - 1;
                  break L3;
                }
              }
              L5: {
                L6: {
                  var5 = var3.toString();
                  if (var5.equals("true")) {
                    break L6;
                  } else {
                    if (!var5.equals("false")) {
                      L7: {
                        if (45 == var5.charAt(0)) {
                          break L7;
                        } else {
                          if (Character.isDigit(var5.charAt(0))) {
                            break L7;
                          } else {
                            var4 = tr.field_f;
                            break L5;
                          }
                        }
                      }
                      var4 = dc.field_o;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var4 = dja.field_r;
                break L5;
              }
              stackIn_21_0 = new mi(var4, var2_int, var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ska.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(roa param0, byte param1) {
        try {
            if (param1 < 40) {
                this.a(true);
            }
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, mg param1) {
        try {
            if (param0 < 81) {
                this.l(-69);
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
        int var2;
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
        int var3;
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
        int var2;
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
        this.field_o = true;
        try {
            this.field_n = new mg(param0.field_E, param1);
            this.field_u = jl.a(param0, true, param1);
            this.field_o = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            this.field_u.a(90, this.field_o);
            if (-9 >= (param0.field_E ^ -1)) {
                this.field_p = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        if (!this.field_p) {
          L0: {
            if (null == this.field_n) {
              break L0;
            } else {
              this.field_n.d(0);
              if (this.field_n.c(0)) {
                L1: {
                  stackIn_44_0 = this;

                  if (this.field_s) {
                    stackIn_45_0 = this;
                    stackIn_45_1 = 0;
                    break L1;
                  } else {
                    stackIn_45_0 = this;
                    stackIn_45_1 = 1;
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
                    stackIn_14_0 = this;

                    if (this.field_s) {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 1;
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
        in var4;
        param0 = upa.a(this.field_s, param0, (byte) -55);
        if (param1 > -48) {
          var4 = (in) null;
          ska.a(-27, (in) null);
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
