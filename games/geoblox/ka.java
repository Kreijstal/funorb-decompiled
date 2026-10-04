/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static dm[][][] field_m;
    int field_k;
    int field_e;
    static float field_c;
    int field_d;
    static d field_i;
    static int field_h;
    int field_b;
    private int field_f;
    boolean field_g;
    boolean field_l;
    static long field_a;
    private int field_j;

    final static na[] a(String param0, String param1, boolean param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        na[] stackIn_2_0 = null;
        na[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (na[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.a((byte) 126, param0);
          var5 = param3.a(param1, -89, var4_int);
          stackIn_4_0 = sd.a(true, param3, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ka.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract void a(byte param0, int param1);

    void a(int param0, int param1) {
        int var4;
        var4 = Geoblox.field_C;
        if (param1 >= -26) {
          this.field_j = 8;
        }
        if (ki.field_d != 96) {
          if (ki.field_d == 97) {
            this.a((byte) 90, param0);
          } else {
            if (((ki.field_d == 84) ||
                (ki.field_d == 83))) {
              this.b(param0, (byte) -2);
            }
          }
        } else {
          this.a(param0, (byte) -7);
        }
    }

    void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        int var8 = Geoblox.field_C;
        if (!param4) {
            if (1 != param5) {
                this.a(param0, (byte) -121);
            } else {
                this.b(param0, (byte) -2);
            }
            s.field_H = lj.field_a;
        } else {
            s.field_H = s.field_H - 1;
            if (s.field_H <= 0) {
                if (param5 == 1) {
                    this.b(param0, (byte) -2);
                } else {
                    this.a(param0, (byte) 6);
                }
                s.field_H = fj.field_o;
            }
        }
        if (param2) {
            this.field_l = false;
        }
    }

    abstract void a(boolean param0, byte param1, int param2, int param3);

    public static void a(byte param0) {
        int var1 = -15 / ((param0 - 75) / 32);
        field_m = (dm[][][]) null;
        field_i = null;
    }

    int a(int param0, int param1, byte param2) {
        int var4;
        if ((this.field_j <= param0) &&
            (param0 < this.field_f) &&
            (this.field_k <= param1)) {
          if (param2 < 20) {
            return 81;
          }
          var4 = (param1 - this.field_k) / this.field_d;
          if (this.field_e > var4) {
            return var4;
          }
          return -1;
        }
        return -1;
    }

    abstract void b(int param0, byte param1);

    final void a(boolean param0) {
        int var2;
        int var3;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0;
        boolean stackIn_17_3;
        L0: {
          var3 = Geoblox.field_C;
          if (bi.field_g != 0) {
            var2 = this.a(mc.field_a, he.field_d, (byte) 28);
            this.field_b = var2;
            if (var2 != -1) {
              this.field_g = true;
              stackIn_16_1 = var2;
              stackIn_16_2 = mc.field_a;
              if (param0) {
                stackIn_17_0 = this;
                stackIn_17_3 = false;
              } else {
                stackIn_17_0 = this;
                stackIn_17_3 = true;
              }
              this.a(stackIn_16_1, stackIn_16_2, stackIn_17_3, -(var2 * this.field_d) - this.field_k + he.field_d, false, bi.field_g);
            } else {
              this.field_g = false;
            }
          } else {
            if ((gf.field_a != 0) &&
                (this.field_g)) {
              var2 = this.field_b;
              if (var2 == -1) {
                break L0;
              }
              this.a(var2, qa.field_a, false, -(this.field_d * var2) + (ue.field_e - this.field_k), true, gf.field_a);
              break L0;
            }
            this.field_g = false;
            if (wb.field_a) {
              var2 = this.a(qa.field_a, ue.field_e, (byte) 126);
              if (var2 != -1) {
                this.field_b = var2;
                this.field_l = false;
              } else {
                if (!this.field_l) {
                  this.field_b = var2;
                  this.field_l = false;
                }
              }
            }
          }
        }
        if (!param0) {
          this.field_j = 56;
        }
    }

    ka(int param0, int param1, int param2, int param3, int param4) {
        this.field_l = true;
        this.field_b = 0;
        this.field_j = param1;
        this.field_d = param4;
        this.field_f = param2;
        this.field_e = param0;
        this.field_k = param3;
    }

    abstract void a(int param0, byte param1);

    void a(int param0) {
        int var4 = Geoblox.field_C;
        int var2 = 0;
        if (param0 != -28750) {
            this.a(false);
        }
        int var3 = this.field_k;
        while (var2 < this.field_e) {
            this.a(this.field_b == var2 ? true : false, (byte) -112, var2, var3);
            var3 = var3 + this.field_d;
            var2++;
        }
    }

    static {
        field_m = new dm[7][7][4];
        field_h = 0;
        field_a = 0L;
    }
}
