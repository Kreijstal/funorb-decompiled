/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends pk {
    private int field_r;
    private boolean field_s;
    private boolean field_n;
    private km field_o;
    static long field_t;
    private km field_v;
    private lh field_x;
    private int field_q;
    private boolean field_p;
    km field_m;
    private int field_u;
    private String field_w;
    static int field_y;

    private final boolean c(byte param0) {
        int var2;
        int stackIn_7_0 = 0;
        var2 = 69 / ((-53 - param0) / 44);
        if (this.a((byte) -9)) {
          if (wh.field_f == 1) {
            if (!this.field_p) {
              if (!this.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              stackIn_7_0 = 1;
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(boolean param0) {
        int var3;
        var3 = Chess.field_G;
        if (this.field_q == wk.field_b) {
          L0: {
            this.field_o.b(this.field_i, this.field_k);
            if (this.field_x != null) {
              this.field_x.b(this.field_w, this.field_i - -(this.field_m.field_v / 2), this.field_m.field_u / 2 + (this.field_k - -(this.field_x.field_C / 2)), this.field_r, this.field_u);
              break L0;
            } else {
              break L0;
            }
          }
          if (!param0) {
            ta.b(85);
            return;
          } else {
            return;
          }
        } else {
          if (uc.field_a != this.field_q) {
            L1: {
              this.field_m.b(this.field_i, this.field_k);
              if (this.field_x != null) {
                this.field_x.b(this.field_w, this.field_i - -(this.field_m.field_v / 2), this.field_m.field_u / 2 + (this.field_k - -(this.field_x.field_C / 2)), this.field_r, this.field_u);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0) {
              return;
            } else {
              ta.b(85);
              return;
            }
          } else {
            if (this.field_v == null) {
              L2: {
                this.field_m.b(this.field_i, this.field_k);
                if (this.field_x != null) {
                  this.field_x.b(this.field_w, this.field_i - -(this.field_m.field_v / 2), this.field_m.field_u / 2 + (this.field_k - -(this.field_x.field_C / 2)), this.field_r, this.field_u);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!param0) {
                ta.b(85);
                return;
              } else {
                return;
              }
            } else {
              L3: {
                this.field_v.b(this.field_i, this.field_k);
                if (this.field_x != null) {
                  this.field_x.b(this.field_w, this.field_i - -(this.field_m.field_v / 2), this.field_m.field_u / 2 + (this.field_k - -(this.field_x.field_C / 2)), this.field_r, this.field_u);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (param0) {
                return;
              } else {
                ta.b(85);
                return;
              }
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 80 / ((param0 - 24) / 51);
        this.d((byte) 19);
        this.field_n = wh.field_f == 1 ? true : false;
    }

    private final void d(byte param0) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int var3;
        var3 = Chess.field_G;
        if (this.field_d) {
          this.field_q = wk.field_b;
          if (this.field_s) {
            L0: {
              if (!this.c((byte) 121)) {
                break L0;
              } else {
                L1: {
                  stackIn_54_0 = this;

                  if (this.field_d) {
                    stackIn_55_0 = this;
                    stackIn_55_1 = 0;
                    break L1;
                  } else {
                    stackIn_55_0 = this;
                    stackIn_55_1 = 1;
                    break L1;
                  }
                }
                ((ta) (this)).field_d = stackIn_55_1 != 0;
                break L0;
              }
            }
            if (param0 > 11) {
              return;
            } else {
              this.a(false);
              return;
            }
          } else {
            if (!this.c((byte) -126)) {
              this.field_d = false;
              if (param0 <= 11) {
                this.a(false);
                return;
              } else {
                return;
              }
            } else {
              this.field_d = true;
              if (param0 <= 11) {
                this.a(false);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (!this.a((byte) -9)) {
            this.field_q = fj.field_c;
            if (this.field_s) {
              L2: {
                if (!this.c((byte) 121)) {
                  break L2;
                } else {
                  L3: {
                    stackIn_35_0 = this;

                    if (this.field_d) {
                      stackIn_36_0 = this;
                      stackIn_36_1 = 0;
                      break L3;
                    } else {
                      stackIn_36_0 = this;
                      stackIn_36_1 = 1;
                      break L3;
                    }
                  }
                  ((ta) (this)).field_d = stackIn_36_1 != 0;
                  break L2;
                }
              }
              if (param0 <= 11) {
                this.a(false);
                return;
              } else {
                return;
              }
            } else {
              if (!this.c((byte) -126)) {
                this.field_d = false;
                if (param0 <= 11) {
                  this.a(false);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_d = true;
                if (param0 <= 11) {
                  this.a(false);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (wh.field_f != 1) {
              this.field_q = uc.field_a;
              if (this.field_s) {
                L4: {
                  if (!this.c((byte) 121)) {
                    break L4;
                  } else {
                    L5: {
                      stackIn_71_0 = this;

                      if (this.field_d) {
                        stackIn_72_0 = this;
                        stackIn_72_1 = 0;
                        break L5;
                      } else {
                        stackIn_72_0 = this;
                        stackIn_72_1 = 1;
                        break L5;
                      }
                    }
                    ((ta) (this)).field_d = stackIn_72_1 != 0;
                    break L4;
                  }
                }
                if (param0 > 11) {
                  return;
                } else {
                  this.a(false);
                  return;
                }
              } else {
                if (!this.c((byte) -126)) {
                  this.field_d = false;
                  if (param0 > 11) {
                    return;
                  } else {
                    this.a(false);
                    return;
                  }
                } else {
                  this.field_d = true;
                  if (param0 > 11) {
                    return;
                  } else {
                    this.a(false);
                    return;
                  }
                }
              }
            } else {
              this.field_q = wk.field_b;
              if (!this.field_s) {
                if (!this.c((byte) -126)) {
                  this.field_d = false;
                  if (param0 > 11) {
                    return;
                  } else {
                    this.a(false);
                    return;
                  }
                } else {
                  this.field_d = true;
                  if (param0 > 11) {
                    return;
                  } else {
                    this.a(false);
                    return;
                  }
                }
              } else {
                L6: {
                  if (!this.c((byte) 121)) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_7_0 = this;

                      if (this.field_d) {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 0;
                        break L7;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 1;
                        break L7;
                      }
                    }
                    ((ta) (this)).field_d = stackIn_8_1 != 0;
                    break L6;
                  }
                }
                L8: {
                  if (param0 > 11) {
                    break L8;
                  } else {
                    this.a(false);
                    break L8;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 != -9) {
          this.field_v = (km) null;
          return this.field_m.c(this.field_i, this.field_k, hn.field_k, rf.field_b);
        } else {
          return this.field_m.c(this.field_i, this.field_k, hn.field_k, rf.field_b);
        }
    }

    final static void a(r param0, int param1) {
        r var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            param0.c(-2193);
            if (param1 < -73) {
              break L0;
            } else {
              ta.b(29);
              break L0;
            }
          }
          var2 = (r) ((Object) bb.field_d.g(-18110));
          L1: while (true) {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                if (!var2.a(param0, -343)) {
                  break L2;
                } else {
                  var2 = (r) ((Object) bb.field_d.a((byte) -121));
                  continue L1;
                }
              }
            }
            if (var2 == null) {
              bb.field_d.a((o) (param0), (byte) -43);
              return;
            } else {
              he.a(param0, var2, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("ta.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    ta(int param0, int param1, km param2, km param3, km param4, boolean param5, boolean param6) {
        this.field_n = false;
        this.field_r = 1;
        this.field_s = false;
        this.field_p = false;
        this.field_u = -1;
        try {
            this.field_p = param6 ? true : false;
            this.field_m = param2;
            this.field_i = param0;
            this.field_s = param5 ? true : false;
            this.field_v = param4;
            this.field_k = param1;
            this.field_o = param3;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0) {
        qh.field_c.field_g = param0;
        qh.field_c.field_c = 0;
    }

    static {
        field_y = 0;
    }
}
