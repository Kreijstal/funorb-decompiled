/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends ug {
    ki field_j;
    ki field_i;
    static byte[] field_g;
    static int field_h;
    private float field_f;
    static int field_e;

    final void e(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_217_0 = 0;
        float var2;
        float var3;
        float var4;
        float var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        boolean decompiledFrameRemainder2 = true;
        var2 = -this.field_j.field_B + this.field_i.field_B;
        var3 = this.field_i.field_q - this.field_j.field_q;
        var4 = var2 * var2 + var3 * var3;
        var5 = this.field_f / (var4 + this.field_f) - 0.5f;
        var2 = var2 * var5;
        var3 = var3 * var5;
        if (this.field_j.field_x) {
          if (!this.field_i.field_x) {
            if (!this.field_i.field_j) {
              stackIn_104_0 = 0;
              decompiledFrameRemainder2 = false;
            }
            else {
              stackIn_58_0 = (5 == this.field_j.field_w) ? 0 : 1;
              boolean decompiledFrameRemainder1 = true;
              var6 = stackIn_58_0;
              if ((this.field_i.field_x ||
                this.field_i.field_j) && (!this.field_j.field_x &&
                !this.field_j.field_j)) {
                stackIn_69_0 = 0;
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_69_0 = (this.field_i.field_w != 5) ? 1 : 0;
              }
              var7 = stackIn_69_0;
              if (var7 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
              }
              if (var6 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
              } else {
                this.field_j.field_q = this.field_j.field_q - var3;
                this.field_j.field_B = this.field_j.field_B - var2;
              }
              if (var7 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
              }
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 - this.field_j.field_G);
              }
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
              }
              if (param0 != 5) {
                this.field_i = (ki) null;
              }
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
              }
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
              }
              if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
                this.field_i.field_q = (float)(-this.field_i.field_y);
              }
              if (this.field_j.field_j) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (this.field_i.field_j) {
                this.field_i.field_q = (float)(-this.field_i.field_y);
              }
              return;
            }
          }
        } else {
          if (this.field_j.field_j) {
            if (!this.field_i.field_x &&
              !this.field_i.field_j) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = (5 != this.field_j.field_w) ? 1 : 0;
            }
            boolean decompiledFrameRemainder0 = true;
            var6 = stackIn_10_0;
            if ((this.field_i.field_x ||
              this.field_i.field_j) && (!this.field_j.field_x &&
              !this.field_j.field_j)) {
              stackIn_21_0 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_21_0 = (this.field_i.field_w != 5) ? 1 : 0;
            }
            var7 = stackIn_21_0;
            if (var7 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            }
            if (var6 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            } else {
              this.field_j.field_q = this.field_j.field_q - var3;
              this.field_j.field_B = this.field_j.field_B - var2;
            }
            if (var7 != 0) {
              this.field_i.field_q = this.field_i.field_q + var3;
              this.field_i.field_B = this.field_i.field_B + var2;
            }
            if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(80 - this.field_j.field_G);
            }
            if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(this.field_j.field_G + 560);
            }
            if (param0 != 5) {
              this.field_i = (ki) null;
            }
            if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
              this.field_j.field_q = (float)(-this.field_j.field_y);
            }
            if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
              this.field_i.field_B = (float)(80 - this.field_i.field_G);
            }
            if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
              this.field_i.field_B = (float)(560 + this.field_i.field_G);
            }
            if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
              this.field_i.field_q = (float)(-this.field_i.field_y);
            }
            if (this.field_j.field_j) {
              this.field_j.field_q = (float)(-this.field_j.field_y);
            }
            if (this.field_i.field_j) {
              this.field_i.field_q = (float)(-this.field_i.field_y);
            }
            return;
          }
        }
        if (decompiledFrameRemainder2) {
          stackIn_104_0 = (5 != this.field_j.field_w) ? 1 : 0;
        }
        var6Lifetime1 = stackIn_104_0;
        if (!this.field_i.field_x) {
          if (!this.field_i.field_j) {
            stackIn_109_0 = (this.field_i.field_w == 5) ? 0 : 1;
            var7Lifetime1 = stackIn_109_0;
          } else {
            if (!this.field_j.field_x &&
              !this.field_j.field_j) {
              stackIn_147_0 = 0;
            } else {
              stackIn_147_0 = (this.field_i.field_w == 5) ? 0 : 1;
            }
            var7Lifetime1 = stackIn_147_0;
          }
          if (var7Lifetime1 == 0) {
            var3 = var3 * 2.0f;
            var2 = var2 * 2.0f;
          }
          if (var6Lifetime1 == 0) {
            var3 = var3 * 2.0f;
            var2 = var2 * 2.0f;
          } else {
            this.field_j.field_q = this.field_j.field_q - var3;
            this.field_j.field_B = this.field_j.field_B - var2;
          }
          if (var7Lifetime1 != 0) {
            this.field_i.field_q = this.field_i.field_q + var3;
            this.field_i.field_B = this.field_i.field_B + var2;
          }
          if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
            this.field_j.field_B = (float)(80 - this.field_j.field_G);
          }
          if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
            this.field_j.field_B = (float)(this.field_j.field_G + 560);
          }
          if (param0 != 5) {
            this.field_i = (ki) null;
          }
          if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
            this.field_j.field_q = (float)(-this.field_j.field_y);
          }
          if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
            this.field_i.field_B = (float)(80 - this.field_i.field_G);
          }
          if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
            this.field_i.field_B = (float)(560 + this.field_i.field_G);
          }
          if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
            this.field_i.field_q = (float)(-this.field_i.field_y);
          }
          if (this.field_j.field_j) {
            this.field_j.field_q = (float)(-this.field_j.field_y);
          }
        } else {
          if (this.field_j.field_x) {
            stackIn_182_0 = (this.field_i.field_w == 5) ? 0 : 1;
            var7Lifetime1 = stackIn_182_0;
            if (var7Lifetime1 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            }
            if (var6Lifetime1 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            } else {
              this.field_j.field_q = this.field_j.field_q - var3;
              this.field_j.field_B = this.field_j.field_B - var2;
            }
            if (var7Lifetime1 != 0) {
              this.field_i.field_q = this.field_i.field_q + var3;
              this.field_i.field_B = this.field_i.field_B + var2;
            }
            if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(80 - this.field_j.field_G);
            }
            if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(this.field_j.field_G + 560);
            }
            if (param0 != 5) {
              this.field_i = (ki) null;
            }
            if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
              this.field_j.field_q = (float)(-this.field_j.field_y);
            }
            if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
              this.field_i.field_B = (float)(80 - this.field_i.field_G);
            }
            if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
              this.field_i.field_B = (float)(560 + this.field_i.field_G);
            }
            if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
              this.field_i.field_q = (float)(-this.field_i.field_y);
            }
            if (this.field_j.field_j) {
              this.field_j.field_q = (float)(-this.field_j.field_y);
            }
          } else {
            if (this.field_j.field_j) {
              stackIn_217_0 = (this.field_i.field_w == 5) ? 0 : 1;
              var7Lifetime1 = stackIn_217_0;
              if (var7Lifetime1 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
              }
              if (var6Lifetime1 == 0) {
                var3 = var3 * 2.0f;
                var2 = var2 * 2.0f;
              } else {
                this.field_j.field_q = this.field_j.field_q - var3;
                this.field_j.field_B = this.field_j.field_B - var2;
              }
              if (var7Lifetime1 != 0) {
                this.field_i.field_q = this.field_i.field_q + var3;
                this.field_i.field_B = this.field_i.field_B + var2;
              }
              if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(80 - this.field_j.field_G);
              }
              if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
                this.field_j.field_B = (float)(this.field_j.field_G + 560);
              }
              if (param0 != 5) {
                this.field_i = (ki) null;
              }
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
              }
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
              }
              if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
                this.field_i.field_q = (float)(-this.field_i.field_y);
              }
              if (this.field_j.field_j) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (!this.field_i.field_j) {
                return;
              }
              this.field_i.field_q = (float)(-this.field_i.field_y);
              return;
            }
            var7Lifetime1 = 0;
            if (var7Lifetime1 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            }
            if (var6Lifetime1 == 0) {
              var3 = var3 * 2.0f;
              var2 = var2 * 2.0f;
            } else {
              this.field_j.field_q = this.field_j.field_q - var3;
              this.field_j.field_B = this.field_j.field_B - var2;
            }
            if (var7Lifetime1 != 0) {
              this.field_i.field_q = this.field_i.field_q + var3;
              this.field_i.field_B = this.field_i.field_B + var2;
            }
            if (80.0f >= this.field_j.field_B + (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(80 - this.field_j.field_G);
            }
            if (560.0f <= this.field_j.field_B - (float)this.field_j.field_G) {
              this.field_j.field_B = (float)(this.field_j.field_G + 560);
            }
            if (param0 != 5) {
              this.field_i = (ki) null;
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
              }
              if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                this.field_i.field_B = (float)(560 + this.field_i.field_G);
              }
              if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
                this.field_i.field_q = (float)(-this.field_i.field_y);
              }
              if (this.field_j.field_j) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
            } else {
              if (0.0f > (float)this.field_j.field_y + this.field_j.field_q) {
                this.field_j.field_q = (float)(-this.field_j.field_y);
              }
              if (this.field_i.field_B + (float)this.field_i.field_G <= 80.0f) {
                this.field_i.field_B = (float)(80 - this.field_i.field_G);
                if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                  this.field_i.field_B = (float)(560 + this.field_i.field_G);
                }
                if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
                  this.field_i.field_q = (float)(-this.field_i.field_y);
                }
                if (this.field_j.field_j) {
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                }
              } else {
                if ((float)(-this.field_i.field_G) + this.field_i.field_B >= 560.0f) {
                  this.field_i.field_B = (float)(560 + this.field_i.field_G);
                }
                if (this.field_i.field_q + (float)this.field_i.field_y < 0.0f) {
                  this.field_i.field_q = (float)(-this.field_i.field_y);
                  if (this.field_j.field_j) {
                    this.field_j.field_q = (float)(-this.field_j.field_y);
                  }
                } else {
                  if (!this.field_j.field_j) {
                    if (!this.field_i.field_j) {
                      return;
                    }
                    this.field_i.field_q = (float)(-this.field_i.field_y);
                    return;
                  }
                  this.field_j.field_q = (float)(-this.field_j.field_y);
                }
              }
            }
          }
        }
        if (this.field_i.field_j) {
          this.field_i.field_q = (float)(-this.field_i.field_y);
        }
    }

    final static void a(boolean param0) {
        hl.b(-16);
        qh.a(4, param0);
    }

    final static fg a(int param0) {
        if (param0 != -20601) {
          field_g = (byte[]) null;
          return (fg) ((Object) new uf());
        }
        return (fg) ((Object) new uf());
    }

    final void a(int param0, ki param1, float param2, ki param3) {
        try {
          this.field_j = param1;
          this.field_i = param3;
          this.field_f = param2 * ((float)param0 + param2);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "il.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    il(ki param0, ki param1, float param2) {
        try {
          this.field_j = param0;
          this.field_f = (-1.0f + param2) * param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_g = null;
    }

    static {
        field_e = -1;
    }
}
