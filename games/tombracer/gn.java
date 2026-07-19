/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gn extends b {
    static cha field_C;
    static String field_y;
    private int field_x;
    jta field_z;
    static String[] field_w;
    boolean field_B;
    static String field_A;

    private final int b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          return 84;
        } else {
          L0: {
            if (!this.field_B) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              if (this != this.field_z.a((byte) -76)) {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 256;
                stackIn_6_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 != 0) {
          field_A = (String) null;
          field_C = null;
          field_y = null;
          field_A = null;
          return;
        } else {
          field_C = null;
          field_y = null;
          field_A = null;
          return;
        }
    }

    final ae g(byte param0) {
        ae var2 = super.g(param0);
        if (var2 != null) {
            return var2;
        }
        return (ae) (this);
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 >= 126) {
            break L0;
          } else {
            this.c(-76, -128, 127);
            break L0;
          }
        }
        var2 = this.b(false);
        var3 = -this.field_x + var2;
        if (var3 <= 0) {
          L1: {
            if (0 > var3) {
              this.field_x = this.field_x + (-16 + var3 + 1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (0 == this.field_x) {
            if (var2 != 0) {
              return false;
            } else {
              L2: {
                if (this.field_B) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L2;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L2;
                }
              }
              return stackIn_21_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            this.field_x = this.field_x + (7 + var3) / 8;
            if (0 > var3) {
              this.field_x = this.field_x + (-16 + var3 + 1) / 16;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              if (0 != this.field_x) {
                break L5;
              } else {
                if (var2 != 0) {
                  break L5;
                } else {
                  if (this.field_B) {
                    break L5;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L4;
          }
          return stackIn_11_0 != 0;
        }
    }

    boolean a(byte param0) {
        if (param0 <= -53) {
          this.field_x = this.b(false);
          if (this.field_x == 0) {
            if (this.field_B) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static iu[] b(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          gn.c(91);
          return ura.a(param2, param0, false, 1, param3);
        } else {
          return ura.a(param2, param0, false, 1, param3);
        }
    }

    gn(jta param0, int param1, int param2) {
        super(bb.field_m - param1 >> -857858847, -param2 + qba.field_a >> 964196801, param1, param2, (isa) null);
        try {
            this.field_x = 0;
            this.field_z = param0;
            this.field_B = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_x != 0) {
          if (-257 >= (this.field_x ^ -1)) {
            if (-1 != (param3 ^ -1)) {
              return;
            } else {
              this.a(param1 + this.field_n, (byte) -67, this.field_i + param0);
              super.a(param0, param1, 0, param3);
              return;
            }
          } else {
            if (fta.field_a != null) {
              if (fta.field_a.field_m >= this.field_m) {
                if (fta.field_a.field_q < this.field_p) {
                  fta.field_a = new iu(this.field_m, this.field_p);
                  nm.a(fta.field_a, (byte) 118);
                  bea.a();
                  this.a(0, (byte) -67, 0);
                  super.a(-this.field_i + -param0, -param1 + -this.field_n, param2, param3);
                  pfa.a(param2 ^ 1);
                  fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
                  return;
                } else {
                  nm.a(fta.field_a, (byte) 118);
                  bea.a();
                  this.a(0, (byte) -67, 0);
                  super.a(-this.field_i + -param0, -param1 + -this.field_n, param2, param3);
                  pfa.a(param2 ^ 1);
                  fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
                  return;
                }
              } else {
                fta.field_a = new iu(this.field_m, this.field_p);
                nm.a(fta.field_a, (byte) 118);
                bea.a();
                this.a(0, (byte) -67, 0);
                super.a(-this.field_i + -param0, -param1 + -this.field_n, param2, param3);
                pfa.a(param2 ^ 1);
                fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
                return;
              }
            } else {
              fta.field_a = new iu(this.field_m, this.field_p);
              nm.a(fta.field_a, (byte) 118);
              bea.a();
              this.a(0, (byte) -67, 0);
              super.a(-this.field_i + -param0, -param1 + -this.field_n, param2, param3);
              pfa.a(param2 ^ 1);
              fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, byte param1, int param2);

    final void c(int param0, int param1, int param2) {
        if (param0 != -11560) {
          this.field_B = false;
          this.a((byte) -31, param2, param1, -param2 + bb.field_m >> -1836968479, qba.field_a + -param1 >> -229002495);
          return;
        } else {
          this.a((byte) -31, param2, param1, -param2 + bb.field_m >> -1836968479, qba.field_a + -param1 >> -229002495);
          return;
        }
    }

    static {
        field_A = "Macroing or use of bots";
        field_y = "I've heard that stepping on cracks can bring bad luck. It does here, especially if you hang around too long.";
    }
}
