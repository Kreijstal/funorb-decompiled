/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    int field_b;
    private int field_j;
    private nm field_e;
    private nm[] field_d;
    private int field_a;
    static int field_f;
    private int[] field_g;
    private int field_h;
    static long field_c;
    private int field_i;

    final boolean a(int param0) {
        int dupTemp$0 = 0;
        int var2;
        if (null != this.field_d) {
          if (0 <= this.field_i) {
            L0: {
              dupTemp$0 = this.field_g[this.field_i];
              this.field_g[this.field_i] = dupTemp$0 - 1;
              if (dupTemp$0 >= 0) {
                break L0;
              } else {
                L1: {
                  var2 = this.field_i;
                  this.a(this.field_d[this.field_i], (byte) -107);
                  this.field_i = var2;
                  this.field_d[this.field_i] = null;
                  this.field_i = this.field_i + 1;
                  if (this.field_i == this.field_d.length) {
                    this.field_i = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (this.field_d[this.field_i] == null) {
                  this.field_i = -1;
                  break L0;
                } else {
                  if (param0 >= 121) {
                    if (null == this.field_e) {
                      return true;
                    } else {
                      this.field_h = this.field_h - 1;
                      if ((this.field_h ^ -1) >= -1) {
                        return this.c(0);
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param0 >= 121) {
              if (null == this.field_e) {
                return true;
              } else {
                this.field_h = this.field_h - 1;
                if ((this.field_h ^ -1) >= -1) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 121) {
              if (null == this.field_e) {
                return true;
              } else {
                this.field_h = this.field_h - 1;
                if ((this.field_h ^ -1) >= -1) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          if (param0 >= 121) {
            if (null == this.field_e) {
              return true;
            } else {
              this.field_h = this.field_h - 1;
              if ((this.field_h ^ -1) < -1) {
                return false;
              } else {
                return this.c(0);
              }
            }
          } else {
            return true;
          }
        }
    }

    private final void b(boolean param0) {
        this.field_h = 0;
        this.field_j = 0;
        this.field_a = 0;
        if (!param0) {
          this.field_h = -23;
          this.field_b = 0;
          return;
        } else {
          this.field_b = 0;
          return;
        }
    }

    final static hd b(int param0) {
        if (param0 > -108) {
            return (hd) null;
        }
        return bs.field_c.field_Ab;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Kickabout.field_G;
        try {
            e.field_k.b(-1);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                mi.field_b[var1_int] = 0L;
            }
            if (param0 <= 40) {
                dd.a((byte) 120);
            }
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                cp.field_d[var1_int] = 0L;
            }
            qh.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dd.F(" + param0 + ')');
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -113;
        }
        return this.field_e.field_e.length;
    }

    private final boolean c(int param0) {
        this.field_b = this.field_b + 1;
        if (this.field_e.field_e.length <= this.field_b) {
          this.field_a = this.field_a + 1;
          if (this.field_e.field_j) {
            if (-1 < (this.field_e.field_h ^ -1)) {
              this.field_b = 0;
              this.field_j = this.field_e.field_e[this.field_b];
              if (param0 != 0) {
                dd.b(-93);
                this.field_h = this.field_e.field_c[this.field_b];
                return false;
              } else {
                this.field_h = this.field_e.field_c[this.field_b];
                return false;
              }
            } else {
              if (this.field_e.field_h < this.field_e.field_e.length) {
                this.field_b = this.field_e.field_h;
                this.field_j = this.field_e.field_e[this.field_b];
                if (param0 != 0) {
                  dd.b(-93);
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                } else {
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                }
              } else {
                this.field_b = 0;
                this.field_j = this.field_e.field_e[this.field_b];
                if (param0 != 0) {
                  dd.b(-93);
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                } else {
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                }
              }
            }
          } else {
            if (this.field_e.field_f > this.field_a) {
              if (-1 < (this.field_e.field_h ^ -1)) {
                this.field_b = 0;
                this.field_j = this.field_e.field_e[this.field_b];
                if (param0 == 0) {
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                } else {
                  dd.b(-93);
                  this.field_h = this.field_e.field_c[this.field_b];
                  return false;
                }
              } else {
                if (this.field_e.field_h < this.field_e.field_e.length) {
                  this.field_b = this.field_e.field_h;
                  this.field_j = this.field_e.field_e[this.field_b];
                  if (param0 == 0) {
                    this.field_h = this.field_e.field_c[this.field_b];
                    return false;
                  } else {
                    dd.b(-93);
                    this.field_h = this.field_e.field_c[this.field_b];
                    return false;
                  }
                } else {
                  this.field_b = 0;
                  this.field_j = this.field_e.field_e[this.field_b];
                  if (param0 == 0) {
                    this.field_h = this.field_e.field_c[this.field_b];
                    return false;
                  } else {
                    dd.b(-93);
                    this.field_h = this.field_e.field_c[this.field_b];
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
          }
        } else {
          this.field_j = this.field_e.field_e[this.field_b];
          if (param0 == 0) {
            this.field_h = this.field_e.field_c[this.field_b];
            return false;
          } else {
            dd.b(-93);
            this.field_h = this.field_e.field_c[this.field_b];
            return false;
          }
        }
    }

    final void a(int param0, int param1) {
        this.field_b = param0;
        int var3 = 124 % ((28 - param1) / 60);
        this.field_j = this.field_e.field_e[this.field_b];
        this.field_h = 0;
    }

    final void a(nm param0, byte param1) {
        try {
            this.b(true);
            this.field_e = param0;
            if (param1 != -107) {
                this.field_h = -20;
            }
            this.field_j = this.field_e.field_e[this.field_b];
            this.field_h = this.field_e.field_c[this.field_b];
            this.field_i = -1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final qc a(qc param0, boolean param1, boolean param2, boolean param3) {
        qc var5 = null;
        RuntimeException var5_ref = null;
        qc stackIn_2_0 = null;
        qc stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        qc stackIn_6_0;
        boolean stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        qc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3) {
              L1: {
                stackIn_5_0 = (qc) (param0);

                stackIn_5_1 = param2;

                stackIn_5_2 = 0;

                if (param1) {
                  stackIn_6_0 = (qc) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = (qc) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = 1;
                  break L1;
                }
              }
              var5 = ((qc) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
              var5.a(se.field_C, this.field_j, (ef) null, -1, 0, 0, param1);
              stackIn_7_0 = (qc) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("dd.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public dd() {
    }

    dd(int param0) {
        this.field_i = -1;
        this.field_d = new nm[param0];
        this.field_g = new int[param0];
    }

    static {
        field_f = 0;
    }
}
