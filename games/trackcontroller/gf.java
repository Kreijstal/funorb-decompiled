/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_c;
    private boolean field_d;
    private int field_u;
    static uf field_o;
    private int field_n;
    private int field_p;
    private int field_e;
    private int field_r;
    private float field_k;
    static int field_g;
    private int field_j;
    private int field_f;
    private int field_i;
    private int field_v;
    static String field_a;
    private int field_h;
    private int field_s;
    static int field_q;
    private fl field_b;
    private int field_l;
    private int field_t;
    private int field_m;

    final void b(boolean param0) {
        int fieldTemp$0 = 0;
        if (null != og.field_rb) {
          return;
        }
        if (hk.field_d <= 0) {
          this.field_d = false;
        }
        if (!this.field_d) {
          if (this.field_j > og.field_pb) {
            gb.field_i = (-og.field_pb + this.field_j) / 2;
          } else {
            if (0 < this.field_j) {
              gb.field_i = 0;
            }
          }
          if (this.field_s == og.field_pb &&
            wf.field_b == this.field_h) {
            return;
          }
          this.field_b.a(this.field_s, this.field_h, (byte) 4);
          return;
        }
        if (!param0) {
          return;
        }
        fieldTemp$0 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_i = this.field_m;
        if (this.field_t > eb.field_i) {
          this.field_d = false;
        } else {
          this.a(false);
        }
        return;
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = param2;
        if (param0 != 0) {
          this.field_t = 68;
          this.field_j = param1;
          return;
        }
        this.field_j = param1;
    }

    public static void a(byte param0) {
        if (param0 != 46) {
          field_g = -115;
          field_o = null;
          field_a = null;
          return;
        }
        field_o = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TrackController.field_F ? 1 : 0;
        var2 = this.field_j;
        var3 = this.field_e;
        if (!this.a(32130)) {
          this.field_d = false;
          return;
        }
        if (this.field_c >= var3) {
          if (var3 < this.field_r) {
            var3 = this.field_r;
          }
        } else {
          var3 = this.field_c;
        }
        if (var2 > this.field_l) {
          var2 = this.field_l;
        } else {
          if (this.field_u <= var2) {
            if (!(0.0f < this.field_k)) {
              if (param0) {
                this.a(-92);
              }
              if (og.field_pb != var2) {
                this.field_b.a(var2, var3, (byte) 4);
              } else {
                if (var3 != wf.field_b) {
                  this.field_b.a(var2, var3, (byte) 4);
                }
              }
              if (0 < this.field_j) {
                gb.field_i = (this.field_j - og.field_pb) / 2;
              }
              return;
            }
            var4 = (int)(this.field_k * (float)var3 + 0.5f);
            boolean decompiledFrameRemainder1 = true;
            if (var2 < var4) {
              var3 = (int)((float)var2 / this.field_k);
            } else {
              if (var2 > var4) {
                var2 = var4;
                if (param0) {
                  this.a(-92);
                }
                if (og.field_pb != var2) {
                  this.field_b.a(var2, var3, (byte) 4);
                } else {
                  if (var3 != wf.field_b) {
                    this.field_b.a(var2, var3, (byte) 4);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              if (param0) {
                this.a(-92);
                if (og.field_pb != var2) {
                  this.field_b.a(var2, var3, (byte) 4);
                } else {
                  if (var3 != wf.field_b) {
                    this.field_b.a(var2, var3, (byte) 4);
                  }
                }
              } else {
                if (og.field_pb == var2 &&
                  var3 == wf.field_b) {
                  if (0 >= this.field_j) {
                    return;
                  }
                  gb.field_i = (this.field_j - og.field_pb) / 2;
                  return;
                }
                this.field_b.a(var2, var3, (byte) 4);
              }
            }
            if (0 < this.field_j) {
              gb.field_i = (this.field_j - og.field_pb) / 2;
            }
            return;
          }
          var2 = this.field_u;
        }
        if (!(0.0f < this.field_k)) {
          if (param0) {
            this.a(-92);
          }
          if (og.field_pb != var2) {
            this.field_b.a(var2, var3, (byte) 4);
          } else {
            if (var3 != wf.field_b) {
              this.field_b.a(var2, var3, (byte) 4);
            }
          }
          if (0 < this.field_j) {
            gb.field_i = (this.field_j - og.field_pb) / 2;
          }
          return;
        }
        var4Lifetime1 = (int)(this.field_k * (float)var3 + 0.5f);
        boolean decompiledFrameRemainder0 = true;
        if (var2 < var4Lifetime1) {
          var3 = (int)((float)var2 / this.field_k);
        } else {
          if (var2 > var4Lifetime1) {
            var2 = var4Lifetime1;
            if (param0) {
              this.a(-92);
            }
            if (og.field_pb != var2 ||
              var3 != wf.field_b) {
              this.field_b.a(var2, var3, (byte) 4);
            }
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (!param0) {
            if (og.field_pb != var2) {
              this.field_b.a(var2, var3, (byte) 4);
            } else {
              if (var3 != wf.field_b) {
                this.field_b.a(var2, var3, (byte) 4);
              }
            }
          } else {
            this.a(-92);
            if (og.field_pb != var2) {
              this.field_b.a(var2, var3, (byte) 4);
              if (0 < this.field_j) {
                gb.field_i = (this.field_j - og.field_pb) / 2;
              }
              return;
            }
            if (var3 != wf.field_b) {
              this.field_b.a(var2, var3, (byte) 4);
            }
          }
        }
        if (0 >= this.field_j) {
          return;
        }
        gb.field_i = (this.field_j - og.field_pb) / 2;
    }

    final boolean a(int param0) {
        if (param0 != 32130) {
          this.c(98);
          if (eb.field_i < this.field_t) {
            return false;
          }
          if (hk.field_d > 0) {
            return true;
          }
          return false;
        }
        if (eb.field_i < this.field_t) {
          return false;
        }
        if (hk.field_d > 0) {
          return true;
        }
        return false;
    }

    final ih c(int param0) {
        this.field_p = wf.field_b;
        this.field_n = og.field_pb;
        this.field_b.a(this.field_f, this.field_v, (byte) 4);
        mj.field_c = false;
        ih var2 = dj.a(param0, this.field_v, this.field_f, (byte) 28, rg.field_c, 0);
        if (var2 != null) {
          return var2;
        }
        this.b(param0 + 6391);
        return var2;
    }

    final void b(int param0) {
        if (param0 == 6391) {
          this.field_b.a(this.field_n, this.field_p, (byte) 4);
          return;
        }
        this.field_h = 97;
        this.field_b.a(this.field_n, this.field_p, (byte) 4);
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Connection restored.";
        field_g = 500;
    }
}
