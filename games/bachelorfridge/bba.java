/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba {
    int field_d;
    int field_c;
    boolean field_e;
    private boolean field_b;
    private hs field_a;

    final void a(byte param0) {
        this.field_d = this.field_a.field_b - 2;
        if (param0 >= -62) {
            this.field_e = false;
        }
    }

    final void b(int param0) {
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 == 10) {
          if (null != this.field_a) {
            if (this.field_b) {
              if (0 < this.field_d) {
                this.field_d = this.field_d - this.field_c;
                return;
              } else {
                return;
              }
            } else {
              if (this.field_a.field_d != 6) {
                if ((this.field_a.field_d ^ -1) != -6) {
                  if (10 == this.field_a.field_d) {
                    if (this.field_d >= this.field_a.field_b - 2) {
                      if (this.field_a.field_d != 6) {
                        if (this.field_b) {
                          this.field_d = this.field_a.field_b + -2;
                          return;
                        } else {
                          this.field_e = true;
                          this.field_d = this.field_a.field_b + -2;
                          return;
                        }
                      } else {
                        this.field_d = this.field_a.field_b + -2;
                        return;
                      }
                    } else {
                      this.field_d = this.field_d + this.field_c;
                      return;
                    }
                  } else {
                    if (-2 + this.field_a.field_b <= this.field_d) {
                      this.field_d = 0;
                      return;
                    } else {
                      this.field_d = this.field_d + this.field_c;
                      return;
                    }
                  }
                } else {
                  if (this.field_d >= this.field_a.field_b - 2) {
                    if (this.field_a.field_d != 6) {
                      if (this.field_b) {
                        this.field_d = this.field_a.field_b + -2;
                        return;
                      } else {
                        this.field_e = true;
                        this.field_d = this.field_a.field_b + -2;
                        return;
                      }
                    } else {
                      this.field_d = this.field_a.field_b + -2;
                      return;
                    }
                  } else {
                    this.field_d = this.field_d + this.field_c;
                    return;
                  }
                }
              } else {
                if (this.field_d >= this.field_a.field_b - 2) {
                  if (this.field_a.field_d != 6) {
                    if (this.field_b) {
                      this.field_d = this.field_a.field_b + -2;
                      return;
                    } else {
                      this.field_e = true;
                      this.field_d = this.field_a.field_b + -2;
                      return;
                    }
                  } else {
                    this.field_d = this.field_a.field_b + -2;
                    return;
                  }
                } else {
                  this.field_d = this.field_d + this.field_c;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final nla a(int param0) {
        if (this.field_a != null) {
          if (param0 >= -94) {
            this.field_b = true;
            return this.field_a.a(this.field_d, (byte) 107);
          } else {
            return this.field_a.a(this.field_d, (byte) 107);
          }
        } else {
          return null;
        }
    }

    bba(hs param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = 1;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((bba) (this)).field_b = stackIn_4_1 != 0;
            this.field_a = param0;
            if (this.field_b) {
              this.a((byte) -115);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("bba.<init>(");

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
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
