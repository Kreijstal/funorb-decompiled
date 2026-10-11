/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is extends jea {
    private jea field_tb;
    private StringBuilder field_vb;
    private int field_ub;
    private jea field_zb;
    static hra field_wb;
    static pea field_xb;
    static float field_Ab;
    static jea field_yb;

    public static void f(int param0) {
        if (param0 == 2) {
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        }
        field_wb = (hra) null;
        field_xb = null;
        field_wb = null;
        field_yb = null;
    }

    final boolean a(boolean param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        if (this.field_ub != 0) {
          return false;
        }
        if (fna.field_h != 85) {
          if (this.field_vb.length() < 12) {
            var2 = Character.toLowerCase(kda.field_td);
            if (var2 == 32) {
              var2 = 95;
            }
            if (95 == var2 &&
              this.field_vb.length() > 0) {
              discarded$3 = this.field_vb.append((char) var2);
            }
            if (dja.a((byte) -17, (char) var2)) {
              discarded$4 = this.field_vb.append((char) var2);
              if (fna.field_h == 84) {
                if (this.field_vb.length() <= 0) {
                  this.field_ub = 1;
                } else {
                  this.field_r = this.field_vb.toString();
                  this.field_ub = 2;
                }
              }
              if (fna.field_h == 13) {
                this.field_ub = 1;
              }
              if (!param0) {
                return true;
              }
              field_Ab = -0.0745474174618721f;
              return true;
            }
            if (dp.a(125, (char) var2)) {
              discarded$5 = this.field_vb.append((char) var2);
              if (fna.field_h == 84) {
                if (this.field_vb.length() <= 0) {
                  this.field_ub = 1;
                } else {
                  this.field_r = this.field_vb.toString();
                  this.field_ub = 2;
                }
              }
              if (fna.field_h == 13) {
                this.field_ub = 1;
              }
              if (param0) {
                field_Ab = -0.0745474174618721f;
              }
              return true;
            }
          }
          if (fna.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (fna.field_h == 13) {
            this.field_ub = 1;
          }
          if (param0) {
            field_Ab = -0.0745474174618721f;
          }
          return true;
        }
        if (0 < this.field_vb.length()) {
          ana.a(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
        }
        if (this.field_vb.length() >= 12) {
          if (fna.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (fna.field_h == 13) {
            this.field_ub = 1;
          }
          if (param0) {
            field_Ab = -0.0745474174618721f;
          }
          return true;
        }
        var2Lifetime1 = Character.toLowerCase(kda.field_td);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (95 == var2Lifetime1 &&
          this.field_vb.length() > 0) {
          discarded$0 = this.field_vb.append((char) var2Lifetime1);
        }
        if (dja.a((byte) -17, (char) var2Lifetime1)) {
          discarded$1 = this.field_vb.append((char) var2Lifetime1);
          if (fna.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (fna.field_h == 13) {
            this.field_ub = 1;
          }
          if (!param0) {
            return true;
          }
          field_Ab = -0.0745474174618721f;
          return true;
        }
        if (!dp.a(125, (char) var2Lifetime1)) {
          if (fna.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (fna.field_h == 13) {
            this.field_ub = 1;
          }
          if (!param0) {
            return true;
          }
          field_Ab = -0.0745474174618721f;
          return true;
        }
        discarded$2 = this.field_vb.append((char) var2Lifetime1);
        if (fna.field_h == 84) {
          if (this.field_vb.length() <= 0) {
            this.field_ub = 1;
            if (fna.field_h == 13) {
              this.field_ub = 1;
            }
            if (param0) {
              field_Ab = -0.0745474174618721f;
            }
            return true;
          }
          this.field_r = this.field_vb.toString();
          this.field_ub = 2;
        }
        if (fna.field_h == 13) {
          this.field_ub = 1;
        }
        if (!param0) {
          return true;
        }
        field_Ab = -0.0745474174618721f;
        return true;
    }

    final int a(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 != 1513) {
          field_wb = (hra) null;
        }
        this.c(-57, param0);
        if (!param0) {
          this.field_tb.field_r = this.field_vb.toString();
          if (param0 &&
            hf.field_b != 0 &&
            0 == this.field_y) {
            this.field_ub = 1;
          }
          return this.field_ub;
        }
        while (true) {
          if (!es.a(true)) {
            this.field_tb.field_r = this.field_vb.toString();
            if (!param0) {
              return this.field_ub;
            }
            if (hf.field_b == 0) {
              return this.field_ub;
            }
            if (0 != this.field_y) {
              return this.field_ub;
            }
            this.field_ub = 1;
            return this.field_ub;
          }
          if (fna.field_h == 85 &&
            this.field_vb.length() > 0) {
            ana.a(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
          }
          if (ih.a((CharSequence) ((Object) this.field_vb), true, kda.field_td)) {
            discarded$0 = this.field_vb.append(kda.field_td);
          } else {
            if (this.field_vb.length() == 0 &&
              91 == kda.field_td) {
              discarded$1 = this.field_vb.append(kda.field_td);
            } else {
              if (1 == this.field_vb.length() &&
                kda.field_td == 35) {
                discarded$2 = this.field_vb.append(kda.field_td);
              } else {
                if (kda.field_td == 93) {
                  discarded$3 = this.field_vb.append(kda.field_td);
                }
              }
            }
          }
          if (fna.field_h != 84) {
            if (13 == fna.field_h) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (this.field_vb.length() <= 0) {
          return 1;
        }
        this.field_r = this.field_vb.toString();
        return 2;
    }

    is(int param0, int param1, int param2, int param3, String param4, jea param5, jea param6, jea param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_ub = 0;
        try {
          this.field_zb = new jea(0L, param6, param4);
          this.b(-125, this.field_zb);
          this.field_tb = new jea(0L, param7);
          this.field_tb.field_ib = 16764006;
          this.b(-128, this.field_tb);
          this.field_tb.field_sb = "|";
          this.field_vb = new StringBuilder(12);
          var9_int = this.field_zb.b((byte) 69);
          this.field_zb.a(var9_int, di.field_a, -23776, 3, 5);
          this.field_tb.a(var9_int, di.field_a, -23776, 3 + di.field_a, 5);
          var10 = 5 + (var9_int + 5);
          var11 = di.field_a * 2 + 6;
          var12 = bt.a((byte) -8, var10, param2, param0);
          var13 = hsa.a(param3, var11, param1, (byte) 69);
          this.a(var10, var11, -23776, var13, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("is.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_wb = new hra();
        field_xb = new pea(16);
    }
}
