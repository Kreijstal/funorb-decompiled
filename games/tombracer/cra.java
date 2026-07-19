/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cra {
    private int field_j;
    private int field_g;
    private int field_c;
    private int field_l;
    private int field_d;
    int field_f;
    boolean field_o;
    private dk[] field_h;
    private int[] field_e;
    static String field_a;
    private boolean field_n;
    private int field_i;
    private int field_m;
    private dk field_b;
    private int field_k;

    final void a(int param0, byte param1) {
        this.field_f = param0;
        this.field_o = true;
        this.field_g = this.field_b.field_l[this.field_f];
        this.field_c = this.field_b.field_l[(1 + this.field_f) % this.b(param1)];
        this.field_d = 0;
    }

    private final int b(byte param0) {
        int var2 = 118 % ((param0 - 43) / 36);
        return this.field_b.field_l.length;
    }

    private final boolean a(int param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          this.field_o = true;
          if (param0 < -43) {
            break L0;
          } else {
            this.field_i = 78;
            break L0;
          }
        }
        L1: {
          if (this.field_b.field_i) {
            L2: {
              this.field_j = 1 + this.field_f;
              if (this.field_b.field_l.length > this.field_j) {
                break L2;
              } else {
                L3: {
                  this.field_m = this.field_m + 1;
                  if (this.field_b.field_f) {
                    break L3;
                  } else {
                    if (this.field_b.field_j > this.field_m) {
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (this.field_b.field_b < 0) {
                      break L5;
                    } else {
                      if (this.field_b.field_b < this.b((byte) -76)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_j = 0;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                this.field_j = this.field_b.field_b;
                break L2;
              }
            }
            this.field_c = this.field_b.field_l[this.field_j];
            break L1;
          } else {
            break L1;
          }
        }
        L6: {
          this.field_f = this.field_f + 1;
          if (this.field_b.field_l.length <= this.field_f) {
            L7: {
              if (!this.field_b.field_i) {
                this.field_m = this.field_m + 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_b.field_f) {
                break L8;
              } else {
                if (this.field_m < this.field_b.field_j) {
                  break L8;
                } else {
                  return true;
                }
              }
            }
            L9: {
              L10: {
                if (this.field_b.field_b < 0) {
                  break L10;
                } else {
                  if (this.field_b.field_b < this.field_b.field_l.length) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              this.field_f = 0;
              if (var3 == 0) {
                break L6;
              } else {
                break L9;
              }
            }
            this.field_f = this.field_b.field_b;
            break L6;
          } else {
            break L6;
          }
        }
        this.field_g = this.field_b.field_l[this.field_f];
        this.field_d = this.field_b.field_e[this.field_f];
        this.field_i = this.field_b.field_e[this.field_f];
        return false;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 >= -9) {
            return false;
        }
        return ((-1 != (24 & param2 ^ -1) ? 1 : 0) | (544 == (544 & param2) ? 1 : 0)) != 0;
    }

    final static void a(cn param0, cn param1, int param2, boolean param3, cn param4) {
        try {
            if (param2 != 1) {
                cn var6 = (cn) null;
                cra.a((cn) null, (cn) null, -57, true, (cn) null);
            }
            gva.field_b = ai.a((byte) 121, "");
            gva.field_b.a(-71, false);
            fha.a(true, param1, param0, param4);
            pq.b(117);
            kl.field_a = fta.field_c;
            wt.field_d = fta.field_c;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cra.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        this.field_m = 0;
        this.field_j = 0;
        this.field_o = false;
        this.field_d = 0;
        this.field_c = 0;
        this.field_f = 0;
        if (param0 > -63) {
            this.field_m = 101;
        }
        this.field_g = 0;
        this.field_i = 1;
    }

    final boolean b(int param0) {
        int var2 = 0;
        if (this.field_n) {
            return false;
        }
        this.field_o = false;
        if (null != this.field_h) {
            if (0 <= this.field_k) {
                this.field_e[this.field_k] = this.field_e[this.field_k] - 1;
                if (!(0 <= this.field_e[this.field_k])) {
                    var2 = this.field_k;
                    this.a(this.field_h[this.field_k], -30988);
                    this.field_k = var2;
                    this.field_h[this.field_k] = null;
                    this.field_k = this.field_k + 1;
                    if (this.field_k == this.field_h.length) {
                        this.field_k = 0;
                    }
                    if (!(this.field_h[this.field_k] != null)) {
                        this.field_k = -1;
                    }
                }
            }
        }
        if (param0 < 6) {
            return true;
        }
        if (this.field_b == null) {
            return true;
        }
        this.field_d = this.field_d - 1;
        if ((this.field_d ^ -1) >= -1) {
            return this.a(-99);
        }
        return false;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 > -59) {
            field_a = (String) null;
        }
    }

    final void a(int param0, ka param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -103 / ((param0 - -36) / 51);
                if (!this.field_b.field_i) {
                  break L2;
                } else {
                  param1.a(-124, hba.field_c, this.field_c, this.field_g, this.field_i - this.field_d, hba.field_c, this.field_i, this.field_b.field_h, 0);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param1.a(-121, hba.field_c, -1, this.field_g, 0, (ena) null, 0, this.field_b.field_h, 0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("cra.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_g = 93;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              L3: {
                if (this.field_b.field_f) {
                  break L3;
                } else {
                  if (this.field_m < this.field_b.field_j) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void a(dk param0, int param1) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        try {
            this.a((byte) -91);
            this.field_b = param0;
            this.field_f = -1;
            if (param1 != -30988) {
                discarded$0 = this.a(102);
            }
            discarded$1 = this.a(-95);
            this.field_k = -1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cra.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dk param0, int param1, int param2) {
        boolean discarded$0 = false;
        try {
            if (this.field_h == null) {
                throw new RuntimeException();
            }
            this.field_h[this.field_l] = param0;
            if (param2 != 8198) {
                discarded$0 = this.a(16);
            }
            this.field_e[this.field_l] = param1;
            if (0 > this.field_k) {
                this.field_k = this.field_l;
            }
            this.field_l = this.field_l + 1;
            if (!(this.field_h.length != this.field_l)) {
                this.field_l = 0;
            }
            this.field_o = true;
            this.field_i = 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cra.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public cra() {
        this.field_o = false;
    }

    cra(int param0) {
        this.field_o = false;
        this.field_e = new int[param0];
        this.field_k = -1;
        this.field_h = new dk[param0];
    }

    static {
        field_a = "There are no valid types of game that match your preferences.";
    }
}
