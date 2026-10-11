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
        if (param0 != 10) {
          return;
        }
        if (null == this.field_a) {
          return;
        }
        if (this.field_b) {
          if (0 >= this.field_d) {
            return;
          }
          this.field_d = this.field_d - this.field_c;
          return;
        }
        if (this.field_a.field_d == 6) {
          if (this.field_d < this.field_a.field_b - 2) {
            this.field_d = this.field_d + this.field_c;
          } else {
            if (this.field_a.field_d != 6 &&
              !this.field_b) {
              this.field_e = true;
            }
            this.field_d = this.field_a.field_b - 2;
          }
        } else {
          if (this.field_a.field_d == 5) {
            if (this.field_d < this.field_a.field_b - 2) {
              this.field_d = this.field_d + this.field_c;
            } else {
              if (this.field_a.field_d != 6 &&
                !this.field_b) {
                this.field_e = true;
              }
              this.field_d = this.field_a.field_b - 2;
            }
          } else {
            if (10 != this.field_a.field_d) {
              if (-2 + this.field_a.field_b <= this.field_d) {
                this.field_d = 0;
              } else {
                this.field_d = this.field_d + this.field_c;
              }
            } else {
              if (this.field_d < this.field_a.field_b - 2) {
                this.field_d = this.field_d + this.field_c;
              } else {
                if (this.field_a.field_d != 6 &&
                  !this.field_b) {
                  this.field_e = true;
                }
                this.field_d = this.field_a.field_b - 2;
              }
            }
          }
        }
    }

    final nla a(int param0) {
        if (this.field_a == null) {
          return null;
        }
        if (param0 < -94) {
          return this.field_a.a(this.field_d, (byte) 107);
        }
        this.field_b = true;
        return this.field_a.a(this.field_d, (byte) 107);
    }

    bba(hs param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = 1;
        try {
          stackIn_4_1 = (param1);
          this.field_b = stackIn_4_1;
          this.field_a = param0;
          if (!this.field_b) {
            return;
          }
          this.a((byte) -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bba.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
