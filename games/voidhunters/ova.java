/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ova {
    private int field_a;
    private byte[] field_c;
    private int field_e;
    private int field_d;
    private int field_b;
    private int field_f;

    final boolean a(int param0) {
        byte[] var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = (byte[]) null;
            this.a((byte[]) null, 29);
            if (this.field_c != null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_c != null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte[] param0, int param1) {
        try {
            this.field_c = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ova.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(faa param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            if (null == this.field_c) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              fieldTemp$0 = this.field_a - 1;
              this.field_a = this.field_a - 1;
              if (fieldTemp$0 <= 0) {
                L1: {
                  this.field_a = this.field_a + this.field_f;
                  if (!param1) {
                    break L1;
                  } else {
                    System.out.println("updating datasender, total " + this.field_c.length);
                    break L1;
                  }
                }
                L2: {
                  var4_int = param0.field_h.length - param0.field_e;
                  if (param2 > 121) {
                    break L2;
                  } else {
                    this.field_e = 8;
                    break L2;
                  }
                }
                L3: {
                  var5 = -this.field_d + var4_int;
                  if (!param1) {
                    break L3;
                  } else {
                    System.out.println("sendable_now " + var5);
                    break L3;
                  }
                }
                if (var5 > 0) {
                  L4: {
                    param0.h(24335, this.field_e);
                    param0.field_e = param0.field_e + 2;
                    var6 = param0.field_e;
                    param0.d(this.field_c.length, 332614536);
                    param0.d(this.field_b, 332614536);
                    if (var5 <= this.field_c.length + -this.field_b) {
                      break L4;
                    } else {
                      var5 = -this.field_b + this.field_c.length;
                      break L4;
                    }
                  }
                  L5: {
                    param0.a(var5, true);
                    param0.a(this.field_b, this.field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    this.field_b = this.field_b + var5;
                    if (this.field_b < this.field_c.length) {
                      break L5;
                    } else {
                      this.field_c = null;
                      if (param1) {
                        System.out.println("done sending this data.");
                        break L5;
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ova.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    ova(int param0) {
        this.field_d = 1024;
        this.field_f = 8;
        this.field_a = 0;
        this.field_e = param0;
    }

    static {
    }
}
