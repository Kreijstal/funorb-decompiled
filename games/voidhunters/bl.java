/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends dqa {
    static no field_x;
    private int field_w;
    static int field_A;
    static String field_y;
    boolean field_z;
    ida field_v;

    private final int c(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0) {
          L0: {
            this.c(-88, 94, 112);
            if (!this.field_z) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              if (this.field_v.g(0) == this) {
                stackIn_12_0 = 256;
                break L0;
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_z) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              if (this.field_v.g(0) == this) {
                stackIn_6_0 = 256;
                break L1;
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final shb g(byte param0) {
        shb var2 = super.g((byte) -123);
        if (param0 > -3) {
            return (shb) null;
        }
        if (var2 != null) {
            return var2;
        }
        return (shb) (this);
    }

    boolean a(int param0) {
        int var2;
        int var3;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        L0: {
          if (param0 == 248) {
            break L0;
          } else {
            bl.d(true);
            break L0;
          }
        }
        L1: {
          var2 = this.c(false);
          var3 = var2 - this.field_w;
          if (0 < var3) {
            this.field_w = this.field_w + (-1 + var3 - -8) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        if (-1 < (var3 ^ -1)) {
          this.field_w = this.field_w + (1 + (var3 + -16)) / 16;
          if (-1 == (this.field_w ^ -1)) {
            if (-1 != (var2 ^ -1)) {
              return false;
            } else {
              L2: {
                if (this.field_z) {
                  stackIn_21_0 = 0;
                  break L2;
                } else {
                  stackIn_21_0 = 1;
                  break L2;
                }
              }
              return stackIn_21_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          if (-1 == (this.field_w ^ -1)) {
            if (-1 != (var2 ^ -1)) {
              return false;
            } else {
              L3: {
                if (this.field_z) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = 1;
                  break L3;
                }
              }
              return stackIn_12_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (this.field_w != 0) {
          if (-257 >= (this.field_w ^ -1)) {
            if (param1 != 0) {
              return;
            } else {
              this.b(param3 - -this.field_r, 1630174241, param0 + this.field_g);
              super.b(param0, param1, 101, param3);
              return;
            }
          } else {
            if (null != vib.field_b) {
              if (vib.field_b.field_q >= this.field_h) {
                if (this.field_f <= vib.field_b.field_p) {
                  de.a(111, vib.field_b);
                  dma.a();
                  this.b(0, 1630174241, 0);
                  super.b(-param0 + -this.field_g, param1, 127, -this.field_r + -param3);
                  if (param2 <= 47) {
                    this.j((byte) 123);
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                    return;
                  } else {
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                    return;
                  }
                } else {
                  vib.field_b = new phb(this.field_h, this.field_f);
                  de.a(111, vib.field_b);
                  dma.a();
                  this.b(0, 1630174241, 0);
                  super.b(-param0 + -this.field_g, param1, 127, -this.field_r + -param3);
                  if (param2 <= 47) {
                    this.j((byte) 123);
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                    return;
                  } else {
                    bia.a((byte) 124);
                    vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                    return;
                  }
                }
              } else {
                vib.field_b = new phb(this.field_h, this.field_f);
                de.a(111, vib.field_b);
                dma.a();
                this.b(0, 1630174241, 0);
                super.b(-param0 + -this.field_g, param1, 127, -this.field_r + -param3);
                if (param2 <= 47) {
                  this.j((byte) 123);
                  bia.a((byte) 124);
                  vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                  return;
                } else {
                  bia.a((byte) 124);
                  vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                  return;
                }
              }
            } else {
              vib.field_b = new phb(this.field_h, this.field_f);
              de.a(111, vib.field_b);
              dma.a();
              this.b(0, 1630174241, 0);
              super.b(-param0 + -this.field_g, param1, 127, -this.field_r + -param3);
              if (param2 <= 47) {
                this.j((byte) 123);
                bia.a((byte) 124);
                vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                return;
              } else {
                bia.a((byte) 124);
                vib.field_b.d(param0 - -this.field_g, this.field_r + param3, this.field_w);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean j(byte param0) {
        this.field_w = this.c(false);
        if (param0 == 55) {
          if (0 == this.field_w) {
            if (this.field_z) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final void c(int param0, int param1, int param2) {
        this.a(-param0 + fob.field_a >> -740447583, param0, param2, 1, vi.field_p + -param2 >> -1860440319);
        if (param1 != -1860440319) {
            this.field_z = false;
        }
    }

    public static void i(byte param0) {
        field_y = null;
        if (param0 != -17) {
            bl.d(false);
            field_x = null;
            return;
        }
        field_x = null;
    }

    final static void d(boolean param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = rua.field_q;
              var1 = var5;
              if (!param0) {
                break L1;
              } else {
                bl.i((byte) 60);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "bl.EA(" + param0 + ')');
        }
    }

    bl(ida param0, int param1, int param2) {
        super(fob.field_a + -param1 >> 1173496577, -param2 + vi.field_p >> 1529758785, param1, param2, (wwa) null);
        try {
            this.field_w = 0;
            this.field_v = param0;
            this.field_z = false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_y = "Change team of clicked ship";
    }
}
