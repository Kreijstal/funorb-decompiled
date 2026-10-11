/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private int field_j;
    static hg field_l;
    int field_k;
    private int field_d;
    static String field_g;
    private int field_h;
    private int field_e;
    static String field_f;
    static qc field_a;
    int field_b;
    private int field_c;
    private boolean field_i;

    final static void a(int param0, int param1, int param2, int param3, hl param4, byte param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = StarCannon.field_A;
        try {
          var6_int = (-param3 + param0 << 8) / param4.field_x;
          var7 = param4.field_w * var6_int + (param3 << 8);
          param2 = param2 + param4.field_w;
          param1 = param1 + param4.field_y;
          var8 = param2 + ki.field_j * param1;
          var9 = 0;
          var10 = param4.field_v;
          var11 = param4.field_u;
          var12 = -var11 + ki.field_j;
          if (param1 < ki.field_e) {
            var14 = ki.field_e - param1;
            var9 = var9 + var11 * var14;
            var8 = var8 + var14 * ki.field_j;
            var10 = var10 - var14;
            param1 = ki.field_e;
          }
          var13 = 0;
          if (param2 < ki.field_l) {
            var14Lifetime1 = -param2 + ki.field_l;
            var12 = var12 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            param2 = ki.field_l;
            var8 = var8 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (param1 + var10 > ki.field_i) {
            var10 = var10 - (param1 - (-var10 + ki.field_i));
          }
          if (param2 + var11 > ki.field_g) {
            var14Lifetime2 = param2 - (-var11 + ki.field_g);
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            if (param5 != -2) {
              field_l = (hg) null;
            }
            for (param1 = -var10; 0 > param1; param1++) {
              var14Lifetime3 = var7;
              for (param2 = -var11; param2 < 0; param2++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_B[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 > 255) {
                      ki.field_a[var8] = var17;
                    } else {
                      var18 = ki.field_a[var8];
                      var19 = 16711935 & (16711935 & var18) * var16 + var15 * (16711935 & var17) >> 8;
                      ki.field_a[var8] = w.a(w.a(var18, 65280) * var16 + w.a(var17, 65280) * var15 >> 8, 65280) + var19;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("n.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        int var2 = 96 / ((param0 - 4) / 44);
        return this.field_j == 96 ? true : false;
    }

    final void a(boolean param0, boolean param1, int param2, int param3) {
        this.field_i = param1 ? true : false;
        if (!param0) {
          this.field_e = 0;
          if (!this.field_i) {
            this.field_k = param2;
          } else {
            this.field_k = param3;
          }
          return;
        }
        this.e(-61);
        this.field_e = 0;
        if (!this.field_i) {
          this.field_k = param2;
        } else {
          this.field_k = param3;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        if (param1 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        this.field_h = 0;
        var4 = 53 % ((-29 - param2) / 39);
        this.field_c = 0;
        this.field_j = 0;
        if (kg.field_a == 0) {
          if (this.field_e != 0 &&
            te.field_b != 0) {
            if (this.field_d <= 0) {
              this.field_d = md.field_c;
              this.field_c = this.field_e;
            }
            this.field_d = this.field_d - 1;
            if (kg.field_a == 0 &&
              te.field_b == 0) {
              this.field_e = 0;
            }
            if (this.field_e != 0) {
              return;
            }
            if (!this.field_i &&
              !uf.field_d) {
              return;
            }
          } else {
            if (kg.field_a == 0 &&
              te.field_b == 0) {
              this.field_e = 0;
              if (this.field_e != 0) {
                return;
              }
              if (!this.field_i &&
                !uf.field_d) {
                return;
              }
            } else {
              if (this.field_e != 0) {
                return;
              }
              if (this.field_i) {
                if (param1 < 0) {
                  if (!this.field_i) {
                    return;
                  }
                  this.field_k = -1;
                  return;
                }
                if (this.field_k != param1) {
                }
                this.field_i = true;
                this.field_k = param1;
                return;
              }
              if (!uf.field_d) {
                return;
              }
            }
          }
          if (param1 < 0) {
            if (this.field_i) {
              this.field_k = -1;
            }
          } else {
            if (this.field_k != param1) {
            }
            this.field_i = true;
            this.field_k = param1;
          }
          return;
        }
        this.field_i = true;
        this.field_e = kg.field_a;
        this.field_d = m.field_e;
        this.field_k = param0;
        this.field_c = kg.field_a;
        this.field_h = kg.field_a;
        if (this.field_e == 0) {
          if (kg.field_a == 0 &&
            te.field_b == 0) {
            this.field_e = 0;
            if (this.field_e != 0) {
              return;
            }
            if (!this.field_i &&
              !uf.field_d) {
              return;
            }
          } else {
            if (this.field_e != 0) {
              return;
            }
            if (this.field_i) {
              if (param1 < 0) {
                if (!this.field_i) {
                  return;
                }
                this.field_k = -1;
                return;
              }
              if (this.field_k != param1) {
              }
              this.field_i = true;
              this.field_k = param1;
              return;
            }
            if (!uf.field_d) {
              return;
            }
          }
          if (param1 < 0) {
            if (this.field_i) {
              this.field_k = -1;
            }
          } else {
            if (this.field_k != param1) {
            }
            this.field_i = true;
            this.field_k = param1;
          }
          return;
        }
        if (te.field_b != 0) {
          if (this.field_d > 0) {
            this.field_d = this.field_d - 1;
            if (kg.field_a == 0 &&
              te.field_b == 0) {
              this.field_e = 0;
            }
            if (this.field_e != 0) {
              return;
            }
            if (!this.field_i &&
              !uf.field_d) {
              return;
            }
            if (param1 < 0) {
              if (this.field_i) {
                this.field_k = -1;
              }
            } else {
              if (this.field_k != param1) {
              }
              this.field_i = true;
              this.field_k = param1;
            }
            return;
          }
          this.field_d = md.field_c;
          this.field_c = this.field_e;
          this.field_d = this.field_d - 1;
          if (kg.field_a == 0 &&
            te.field_b == 0) {
            this.field_e = 0;
          }
          if (this.field_e != 0) {
            return;
          }
          if (!this.field_i &&
            !uf.field_d) {
            return;
          }
        } else {
          if (kg.field_a == 0 &&
            te.field_b == 0) {
            this.field_e = 0;
          }
          if (this.field_e != 0) {
            return;
          }
          if (!this.field_i &&
            !uf.field_d) {
            return;
          }
        }
        if (param1 < 0) {
          if (!this.field_i) {
            return;
          }
          this.field_k = -1;
          return;
        }
        if (this.field_k != param1) {
        }
        this.field_i = true;
        this.field_k = param1;
        return;
    }

    final boolean b(int param0) {
        if (param0 != -18433) {
          this.field_h = -10;
          if (2 != this.field_c) {
            return this.field_j == 96 ? true : false;
          }
          return true;
        }
        if (2 == this.field_c) {
          return true;
        }
        if (this.field_j != 96) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1) {
        int var3 = 71 % ((-9 - param0) / 55);
        if (0 != this.field_e) {
          return;
        }
        this.field_k = param1;
        this.field_i = false;
    }

    final void b(byte param0) {
        if (param0 != 92) {
          this.field_j = -19;
          this.field_j = 0;
          this.field_h = 0;
          this.field_c = 0;
          if (this.field_e == 0) {
            this.field_j = lb.field_B;
          }
          if (0 == this.field_e &&
            96 == lb.field_B) {
            if (0 >= this.field_k) {
              this.field_k = this.field_b;
            }
            this.field_k = this.field_k - 1;
            this.field_i = false;
          }
          if (this.field_e == 0 &&
            lb.field_B == 97) {
            this.field_k = this.field_k + 1;
            this.field_i = false;
            if (this.field_k >= this.field_b) {
              this.field_k = 0;
            }
          }
          return;
        }
        this.field_j = 0;
        this.field_h = 0;
        this.field_c = 0;
        if (this.field_e == 0) {
          this.field_j = lb.field_B;
          if (0 == this.field_e &&
            96 == lb.field_B) {
            if (0 >= this.field_k) {
              this.field_k = this.field_b;
            }
            this.field_k = this.field_k - 1;
            this.field_i = false;
            if (this.field_e == 0 &&
              lb.field_B == 97) {
              this.field_k = this.field_k + 1;
              this.field_i = false;
              if (this.field_k >= this.field_b) {
                this.field_k = 0;
              }
            }
            return;
          }
        } else {
          if (0 == this.field_e &&
            96 == lb.field_B) {
            if (0 >= this.field_k) {
              this.field_k = this.field_b;
            }
            this.field_k = this.field_k - 1;
            this.field_i = false;
          }
        }
        if (this.field_e != 0) {
          return;
        }
        if (lb.field_B != 97) {
          return;
        }
        this.field_k = this.field_k + 1;
        this.field_i = false;
        if (this.field_k < this.field_b) {
          return;
        }
        this.field_k = 0;
    }

    final void c(byte param0) {
        this.field_c = 0;
        this.field_h = 0;
        if (param0 >= 23) {
          this.field_j = 0;
          if (this.field_e == 0) {
            this.field_j = lb.field_B;
          }
          return;
        }
        field_a = (qc) null;
        this.field_j = 0;
        if (this.field_e == 0) {
          this.field_j = lb.field_B;
        }
    }

    final boolean d(byte param0) {
        int var2 = 14 % ((param0 + 50) / 44);
        return this.field_j == 97 ? true : false;
    }

    public static void f(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 0) {
          n.f(14);
          field_a = null;
          field_l = null;
          return;
        }
        field_a = null;
        field_l = null;
    }

    final void b(int param0, int param1) {
        this.field_c = 0;
        this.field_h = 0;
        this.field_j = 0;
        if (this.field_e == 0 &&
          lb.field_B == 96) {
          if (this.field_k <= 0) {
            this.field_k = this.field_b;
          }
          this.field_i = false;
          this.field_k = this.field_k - 1;
        }
        if (param1 >= -55) {
          this.c((byte) -59);
        }
        if (this.field_e == 0) {
          this.field_j = lb.field_B;
        }
        if (this.field_e == 0 &&
          lb.field_B == 97) {
          this.field_k = this.field_k + 1;
          if (this.field_b <= this.field_k) {
            this.field_k = 0;
          }
          this.field_i = false;
        }
        if (this.field_e != 0) {
          return;
        }
        if (lb.field_B != 98 &&
          lb.field_B != 99) {
          return;
        }
        if (this.field_k < 0) {
          this.field_k = param0;
        }
        this.field_i = false;
    }

    final boolean e(int param0) {
        if (param0 == -104) {
          return this.field_j == 103 ? true : false;
        }
        this.c(-116);
        return this.field_j == 103 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          this.field_b = -28;
          if (0 != this.field_h) {
            return true;
          }
          if (this.field_j != 84) {
            return this.field_j == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_h) {
          return true;
        }
        if (this.field_j == 84) {
          return true;
        }
        if (this.field_j != 83) {
          return false;
        }
        return true;
    }

    final boolean a(byte param0) {
        int var2 = -106 % ((param0 - 26) / 50);
        return this.field_j == 102 ? true : false;
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          this.d((byte) -84);
          if (this.field_c == 1) {
            return true;
          }
          if (this.field_j == 97) {
            return true;
          }
          if (84 == this.field_j) {
            return true;
          }
          if (this.field_j != 83) {
            return false;
          }
          return true;
        }
        if (this.field_c == 1) {
          return true;
        }
        if (this.field_j == 97) {
          return true;
        }
        if (84 == this.field_j) {
          return true;
        }
        if (this.field_j != 83) {
          return false;
        }
        return true;
    }

    final boolean h(int param0) {
        if (param0 != -84) {
          this.field_i = true;
          if (0 != this.field_c) {
            return true;
          }
          if (this.field_j != 84) {
            return this.field_j == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_c) {
          return true;
        }
        if (this.field_j == 84) {
          return true;
        }
        if (this.field_j != 83) {
          return false;
        }
        return true;
    }

    final void a(int param0) {
        this.field_j = 0;
        this.field_c = 0;
        this.field_h = 0;
        if (param0 == this.field_e) {
          this.field_j = lb.field_B;
          if (this.field_e == 0 &&
            lb.field_B == 98) {
            if (this.field_k <= 0) {
              this.field_k = this.field_b;
            }
            this.field_k = this.field_k - 1;
            this.field_i = false;
          }
          if (this.field_e == 0 &&
            lb.field_B == 99) {
            this.field_k = this.field_k + 1;
            this.field_i = false;
            if (this.field_k >= this.field_b) {
              this.field_k = 0;
            }
          }
          return;
        }
        if (this.field_e == 0 &&
          lb.field_B == 98) {
          if (this.field_k <= 0) {
            this.field_k = this.field_b;
          }
          this.field_k = this.field_k - 1;
          this.field_i = false;
        }
        if (this.field_e != 0) {
          return;
        }
        if (lb.field_B != 99) {
          return;
        }
        this.field_k = this.field_k + 1;
        this.field_i = false;
        if (this.field_k < this.field_b) {
          return;
        }
        this.field_k = 0;
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          return false;
        }
        return 0 != this.field_e ? true : false;
    }

    n(int param0) {
        this.field_k = 0;
        this.field_i = false;
        this.field_b = param0;
    }

    static {
        field_g = "Create a free account to start using this feature";
        field_f = "Waiting for graphics";
    }
}
