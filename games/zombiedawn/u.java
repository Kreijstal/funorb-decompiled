/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class u {
    private int field_m;
    static int[] field_d;
    boolean field_k;
    private vn[] field_i;
    int field_l;
    private int field_n;
    private int field_g;
    int field_b;
    static sn field_e;
    private boolean field_c;
    int field_a;
    int field_h;
    private int field_j;
    static String field_f;

    private final void a(byte param0) {
        int var3 = ZombieDawn.field_J;
        this.field_h = 4;
        if (param0 <= 71) {
          this.field_m = -75;
          if (this.field_b == 2) {
            this.field_a = 130 + pb.a(so.field_a, 77, 1) << 4;
            return;
          }
          if (this.field_b == 1) {
            this.field_a = pb.a(so.field_a, 50, 1) + 90 << 4;
            return;
          }
          if (this.field_b == 0) {
            this.field_a = pb.a(so.field_a, 20, 1) + 87 << 4;
            return;
          }
          return;
        }
        if (this.field_b == 2) {
          this.field_a = 130 + pb.a(so.field_a, 77, 1) << 4;
          return;
        }
        if (this.field_b == 1) {
          this.field_a = pb.a(so.field_a, 50, 1) + 90 << 4;
          return;
        }
        if (this.field_b != 0) {
          return;
        }
        this.field_a = pb.a(so.field_a, 20, 1) + 87 << 4;
    }

    final void d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_46_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        if (30 <= fieldTemp$0) {
          this.field_g = 0;
          fieldTemp$1 = this.field_n + 1;
          this.field_n = this.field_n + 1;
          if (fieldTemp$1 <= 3) {
            if (param0 != this.field_b) {
              if (this.field_k) {
                fieldTemp$3 = this.field_m;
                this.field_m = this.field_m - 1;
                if (0 >= fieldTemp$3) {
                  this.field_k = false;
                  this.a((byte) 126);
                  return;
                }
              }
              if (this.a(param0 - 93)) {
                this.field_k = true;
                this.field_m = pb.a(so.field_a, 20, 1);
              } else {
                stackIn_10_1 = this.field_l;
                if (this.field_l < this.field_a) {
                  stackIn_11_2 = this.field_h;
                } else {
                  stackIn_11_2 = -this.field_h;
                }
                this.field_l = stackIn_10_1 + stackIn_11_2;
              }
              return;
            }
            this.field_n = 0;
            if (!this.field_k) {
              if (this.a(param0 - 93)) {
                this.field_k = true;
                this.field_m = pb.a(so.field_a, 20, 1);
              } else {
                stackIn_18_1 = this.field_l;
                if (this.field_l < this.field_a) {
                  stackIn_19_2 = this.field_h;
                } else {
                  stackIn_19_2 = -this.field_h;
                }
                this.field_l = stackIn_18_1 + stackIn_19_2;
              }
              return;
            }
            fieldTemp$2 = this.field_m;
            this.field_m = this.field_m - 1;
            if (0 >= fieldTemp$2) {
              this.field_k = false;
              this.a((byte) 126);
            } else {
              if (this.a(param0 - 93)) {
                this.field_k = true;
                this.field_m = pb.a(so.field_a, 20, 1);
              } else {
                stackIn_27_1 = this.field_l;
                if (this.field_l < this.field_a) {
                  stackIn_28_2 = this.field_h;
                } else {
                  stackIn_28_2 = -this.field_h;
                }
                this.field_l = stackIn_27_1 + stackIn_28_2;
              }
            }
            return;
          }
          this.field_n = 0;
        }
        if (param0 != this.field_b) {
          if (!this.field_k) {
            if (this.a(param0 - 93)) {
              this.field_k = true;
              this.field_m = pb.a(so.field_a, 20, 1);
            } else {
              stackIn_54_1 = this.field_l;
              if (this.field_l < this.field_a) {
                stackIn_55_2 = this.field_h;
              } else {
                stackIn_55_2 = -this.field_h;
              }
              this.field_l = stackIn_54_1 + stackIn_55_2;
            }
            return;
          }
          fieldTemp$4 = this.field_m;
          this.field_m = this.field_m - 1;
          if (0 >= fieldTemp$4) {
            this.field_k = false;
            this.a((byte) 126);
          } else {
            if (this.a(param0 - 93)) {
              this.field_k = true;
              this.field_m = pb.a(so.field_a, 20, 1);
            } else {
              stackIn_62_1 = this.field_l;
              if (this.field_l < this.field_a) {
                stackIn_63_2 = this.field_h;
              } else {
                stackIn_63_2 = -this.field_h;
              }
              this.field_l = stackIn_62_1 + stackIn_63_2;
            }
          }
          return;
        }
        this.field_n = 0;
        if (!this.field_k) {
          if (this.a(param0 - 93)) {
            this.field_k = true;
            this.field_m = pb.a(so.field_a, 20, 1);
          } else {
            stackIn_37_1 = this.field_l;
            if (this.field_l < this.field_a) {
              stackIn_38_2 = this.field_h;
            } else {
              stackIn_38_2 = -this.field_h;
            }
            this.field_l = stackIn_37_1 + stackIn_38_2;
          }
          return;
        }
        fieldTemp$5 = this.field_m;
        this.field_m = this.field_m - 1;
        if (0 >= fieldTemp$5) {
          this.field_k = false;
          this.a((byte) 126);
        } else {
          if (this.a(param0 - 93)) {
            this.field_k = true;
            this.field_m = pb.a(so.field_a, 20, 1);
          } else {
            stackIn_46_1 = this.field_l;
            if (this.field_l < this.field_a) {
              stackIn_47_2 = this.field_h;
            } else {
              stackIn_47_2 = -this.field_h;
            }
            this.field_l = stackIn_46_1 + stackIn_47_2;
          }
        }
        return;
    }

    private final boolean a(int param0) {
        int var2 = 60 % ((0 - param0) / 41);
        return Math.abs((this.field_l >> 4) - (this.field_a >> 4)) <= this.field_h ? true : false;
    }

    final void c(int param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = -126 / ((param0 - 56) / 57);
        int var3 = this.field_j * bd.field_e / 640;
        if (this.field_b == 1) {
          this.field_i[this.field_n].b(var3, nh.field_P - (this.field_l >> 4), 150, 13056);
          return;
        }
        if (0 != this.field_b) {
          if (!this.field_c) {
            this.field_i[this.field_n].b(var3, nh.field_P - (this.field_l >> 4));
            return;
          }
          this.field_i[this.field_n].c(var3, -(this.field_l >> 4) + nh.field_P);
          return;
        }
        this.field_i[this.field_n].c(this.field_j, nh.field_P - (this.field_l >> 4));
        if (640 >= bd.field_e) {
          return;
        }
        this.field_i[this.field_n].b(640 + this.field_j, -(this.field_l >> 4) + nh.field_P);
    }

    public static void b(int param0) {
        if (param0 < -2) {
          field_f = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_d = (int[]) null;
        field_f = null;
        field_d = null;
        field_e = null;
    }

    u(vn[] param0, int param1, int param2) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_k = false;
        try {
          this.field_j = param2;
          this.field_h = 4;
          this.field_b = param1;
          this.field_i = param0;
          stackIn_4_1 = (0 == pb.a(so.field_a, 2, 1));
          this.field_c = stackIn_4_1;
          this.field_n = pb.a(so.field_a, 3, 1);
          if (this.field_b == 0) {
            this.field_n = 0;
            this.field_c = false;
          }
          this.field_g = pb.a(so.field_a, 30, 1);
          if (this.field_b != 2) {
            if (this.field_b == 1) {
              this.field_l = 90 + pb.a(so.field_a, 50, 1) << 4;
            } else {
              if (this.field_b != 0) {
                this.a((byte) 95);
                return;
              }
              this.field_l = pb.a(so.field_a, 20, 1) + 87 << 4;
            }
          } else {
            this.field_l = pb.a(so.field_a, 77, 1) + 130 << 4;
          }
          this.a((byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("u.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = new int[]{170, 150, 140, 160};
        field_e = new sn("");
        field_f = "Waiting for music";
    }
}
