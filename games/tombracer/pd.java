/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pd extends nv {
    private boolean field_n;
    private boolean field_o;
    private int field_q;
    private int field_r;
    static int[] field_p;

    void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, this.field_q / 50, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 >= -64) {
            this.a(false, (byte) -88);
            return this.field_o;
        }
        return this.field_o;
    }

    final int a(int param0, int param1) {
        hca var4;
        param0 = upa.a(this.field_o, param0, (byte) -53);
        param0 = upa.a(this.field_n, param0, (byte) -111);
        if (param1 >= -48) {
          var4 = (hca) null;
          this.a(-22, (hca) null);
          param0 = fs.a((byte) 37, param0, this.field_r);
          return param0;
        } else {
          param0 = fs.a((byte) 37, param0, this.field_r);
          return param0;
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pd.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        ooa.field_e = fba.a(8, 0.4000000059604645f, 8, true, 4, 1, 2048, 35);
        int var1 = 56 % ((param0 - 57) / 45);
    }

    void a(boolean param0, byte param1) {
        this.field_n = param0 ? true : false;
        if (param1 != 2) {
            this.field_o = false;
        }
    }

    abstract boolean a(int param0, hca param1);

    final void k(int param0) {
        hca var3;
        hca var4;
        hca var5;
        hca var6;
        hca var7;
        hca var8;
        hca var9;
        hca var10;
        if (param0 == 5418) {
          if (this.field_o) {
            if (0 < this.field_r) {
              this.field_r = this.field_r - 1;
              if (-1 != (this.field_r ^ -1)) {
                L0: {
                  if (this.field_o) {
                    break L0;
                  } else {
                    var10 = this.m((byte) 19);
                    if (!this.field_n) {
                      if (var10.q(81)) {
                        break L0;
                      } else {
                        if (!this.field_g.a((byte) 110, var10.e(9648), var10.d(3), var10.a((byte) 55), var10.c(-125))) {
                          break L0;
                        } else {
                          if (this.a(param0 + -5533, var10)) {
                            if (0 >= this.field_q) {
                              this.field_o = true;
                              return;
                            } else {
                              this.field_r = this.field_q;
                              this.field_o = true;
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      if (var10.q(102)) {
                        break L0;
                      } else {
                        if (this.field_g.a((byte) 110, var10.e(9648), var10.d(3), var10.a((byte) 55), var10.c(-63))) {
                          break L0;
                        } else {
                          this.field_n = false;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L1: {
                  this.field_o = false;
                  this.g((byte) 3);
                  if (this.field_o) {
                    break L1;
                  } else {
                    var9 = this.m((byte) 19);
                    if (!this.field_n) {
                      if (var9.q(81)) {
                        break L1;
                      } else {
                        if (!this.field_g.a((byte) 110, var9.e(9648), var9.d(3), var9.a((byte) 55), var9.c(-125))) {
                          break L1;
                        } else {
                          if (this.a(param0 + -5533, var9)) {
                            if (0 >= this.field_q) {
                              this.field_o = true;
                              return;
                            } else {
                              this.field_r = this.field_q;
                              this.field_o = true;
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      if (var9.q(102)) {
                        break L1;
                      } else {
                        if (this.field_g.a((byte) 110, var9.e(9648), var9.d(3), var9.a((byte) 55), var9.c(-63))) {
                          break L1;
                        } else {
                          this.field_n = false;
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              if (!this.field_o) {
                var8 = this.m((byte) 19);
                var3 = var8;
                if (!this.field_n) {
                  if (!var8.q(81)) {
                    if (this.field_g.a((byte) 110, var8.e(9648), var8.d(3), var8.a((byte) 55), var8.c(-125))) {
                      if (this.a(param0 + -5533, var8)) {
                        if (0 >= this.field_q) {
                          this.field_o = true;
                          return;
                        } else {
                          this.field_r = this.field_q;
                          this.field_o = true;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!var8.q(102)) {
                    if (this.field_g.a((byte) 110, var8.e(9648), var8.d(3), var8.a((byte) 55), var8.c(-63))) {
                      return;
                    } else {
                      this.field_n = false;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (!this.field_o) {
              var7 = this.m((byte) 19);
              if (!this.field_n) {
                if (!var7.q(81)) {
                  if (this.field_g.a((byte) 110, var7.e(9648), var7.d(3), var7.a((byte) 55), var7.c(-125))) {
                    if (this.a(param0 + -5533, var7)) {
                      if (0 >= this.field_q) {
                        this.field_o = true;
                        return;
                      } else {
                        this.field_r = this.field_q;
                        this.field_o = true;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (!var7.q(102)) {
                  if (!this.field_g.a((byte) 110, var7.e(9648), var7.d(3), var7.a((byte) 55), var7.c(-63))) {
                    this.field_n = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          this.field_r = -20;
          if (this.field_o) {
            L2: {
              if (0 < this.field_r) {
                this.field_r = this.field_r - 1;
                if (-1 == (this.field_r ^ -1)) {
                  this.field_o = false;
                  this.g((byte) 3);
                  break L2;
                } else {
                  if (!this.field_o) {
                    L3: {
                      var5 = this.m((byte) 19);
                      if (!this.field_n) {
                        if (!var5.q(81)) {
                          if (this.field_g.a((byte) 110, var5.e(9648), var5.d(3), var5.a((byte) 55), var5.c(-125))) {
                            if (this.a(param0 + -5533, var5)) {
                              if (0 >= this.field_q) {
                                this.field_o = true;
                                return;
                              } else {
                                this.field_r = this.field_q;
                                this.field_o = true;
                                return;
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (!var5.q(102)) {
                          if (!this.field_g.a((byte) 110, var5.e(9648), var5.d(3), var5.a((byte) 55), var5.c(-63))) {
                            this.field_n = false;
                            break L3;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                break L2;
              }
            }
            if (!this.field_o) {
              var6 = this.m((byte) 19);
              var3 = var6;
              if (!this.field_n) {
                if (!var6.q(81)) {
                  if (this.field_g.a((byte) 110, var6.e(9648), var6.d(3), var6.a((byte) 55), var6.c(-125))) {
                    if (this.a(param0 + -5533, var6)) {
                      if (0 >= this.field_q) {
                        this.field_o = true;
                        return;
                      } else {
                        this.field_r = this.field_q;
                        this.field_o = true;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (!var6.q(102)) {
                  if (this.field_g.a((byte) 110, var6.e(9648), var6.d(3), var6.a((byte) 55), var6.c(-63))) {
                    return;
                  } else {
                    this.field_n = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if (!this.field_o) {
              L4: {
                var4 = this.m((byte) 19);
                if (!this.field_n) {
                  if (!var4.q(81)) {
                    if (this.field_g.a((byte) 110, var4.e(9648), var4.d(3), var4.a((byte) 55), var4.c(-125))) {
                      if (this.a(param0 + -5533, var4)) {
                        if (0 >= this.field_q) {
                          this.field_o = true;
                          return;
                        } else {
                          this.field_r = this.field_q;
                          this.field_o = true;
                          return;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (!var4.q(102)) {
                    if (!this.field_g.a((byte) 110, var4.e(9648), var4.d(3), var4.a((byte) 55), var4.c(-63))) {
                      this.field_n = false;
                      break L4;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    pd(la param0, boolean param1) {
        super(param0, param1);
        this.field_o = false;
        this.field_n = false;
        this.field_r = -1;
    }

    abstract void g(byte param0);

    public static void l(int param0) {
        if (param0 <= 31) {
            field_p = (int[]) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    pd(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_o = false;
        this.field_n = false;
        this.field_r = -1;
        try {
            this.field_q = 50 * param1.b((byte) 44, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        kh var2;
        if (param0 != 34) {
          field_p = (int[]) null;
          var2 = ql.field_k;
          var2.k(param1, param0 + -3022);
          var2.i(1, 0);
          var2.i(3, 0);
          return;
        } else {
          var2 = ql.field_k;
          var2.k(param1, param0 + -3022);
          var2.i(1, 0);
          var2.i(3, 0);
          return;
        }
    }

    final static int a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == 2048) {
                break L1;
              } else {
                var5 = (int[]) null;
                pd.a((int[]) null, 49);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (param0.length <= var3) {
                stackIn_7_0 = var2_int;
                break L0;
              } else {
                var2_int = var2_int + tda.a(param1 + -1922, param0[var3]);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pd.BA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
    }
}
