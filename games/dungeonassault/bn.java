/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    private int field_o;
    private int field_a;
    private int field_c;
    private int field_s;
    private int field_t;
    static int field_n;
    private int field_l;
    private int field_u;
    private int field_r;
    static nl field_j;
    private int field_e;
    static String field_i;
    static String[] field_m;
    static cn field_h;
    private int field_p;
    private int field_w;
    static cn field_f;
    private float field_y;
    private boolean field_d;
    private int field_v;
    private int field_b;
    static String field_q;
    private bm field_g;
    private int field_x;
    private int field_k;

    final void a(int param0) {
        this.field_g.a(this.field_e, this.field_t, (byte) -107);
        if (param0 != 6733) {
          java.awt.Component var3 = (java.awt.Component) null;
          bn.a(-69, (java.awt.Component) null, -15, 123);
        }
    }

    final void e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (param0 != 6731) {
          this.c(-81);
          if (cm.field_R != null) {
            return;
          }
          if (pb.field_G <= 0) {
            this.field_d = false;
          }
          if (this.field_d) {
            fieldTemp$1 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$1) {
              return;
            }
            this.field_c = this.field_k;
            if (this.field_b > sj.field_bb) {
              this.field_d = false;
            } else {
              this.c(103);
            }
            return;
          }
          if (this.field_x <= up.field_d) {
            if (this.field_x <= 0) {
              if (this.field_o != up.field_d) {
                this.field_g.a(this.field_v, this.field_o, (byte) -118);
              } else {
                if (eg.field_d != this.field_v) {
                  this.field_g.a(this.field_v, this.field_o, (byte) -118);
                }
              }
              return;
            }
            aj.field_Gb = 0;
          } else {
            aj.field_Gb = (-up.field_d + this.field_x) / 2;
          }
        } else {
          if (cm.field_R != null) {
            return;
          }
          if (pb.field_G <= 0) {
            this.field_d = false;
          }
          if (this.field_d) {
            fieldTemp$0 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$0) {
              return;
            }
            this.field_c = this.field_k;
            if (this.field_b > sj.field_bb) {
              this.field_d = false;
            } else {
              this.c(103);
            }
            return;
          }
          if (this.field_x > up.field_d) {
            aj.field_Gb = (-up.field_d + this.field_x) / 2;
          } else {
            if (this.field_x > 0) {
              aj.field_Gb = 0;
            }
          }
        }
        if (this.field_o == up.field_d &&
          eg.field_d == this.field_v) {
          return;
        }
        this.field_g.a(this.field_v, this.field_o, (byte) -118);
    }

    final boolean b(int param0) {
        int var2 = -125 / ((param0 - 24) / 43);
        if (this.field_b > sj.field_bb) {
          return false;
        }
        if (pb.field_G > 0) {
          return true;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_a = param0;
        this.field_x = param2;
        if (!param1) {
          field_j = (nl) null;
        }
    }

    final static c a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          c var5 = null;
          kf var5_ref = null;
          java.awt.Component var6 = null;
          c stackIn_3_0 = null;
          kf stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("ij");
              var5 = (c) (var4.newInstance());
              var5.a((byte) -48, param1, param3, param2);
              if (param0 != -1) {
                var6 = (java.awt.Component) null;
                bn.a(92, (java.awt.Component) null, 26, -40);
              }
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new kf();
              ((c) ((Object) var5_ref)).a((byte) 72, param1, param3, param2);
              stackIn_5_0 = var5_ref;
              return (c) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("bn.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime1Lifetime1;
        var6 = DungeonAssault.field_K;
        var2 = this.field_x;
        var4 = -124 / ((param0 + 40) / 32);
        var3 = this.field_a;
        if (!this.b(71)) {
          this.field_d = false;
          return;
        }
        if (this.field_p < var2) {
          var2 = this.field_p;
        } else {
          if (var2 >= this.field_s) {
            boolean decompiledFrameRemainder1 = true;
            if (this.field_r < var3) {
              var3 = this.field_r;
            } else {
              if (this.field_l > var3) {
                var3 = this.field_l;
                if (0.0f < this.field_y) {
                  var5 = (int)(this.field_y * (float)var3 + 0.5f);
                  if (var2 >= var5) {
                    if (var5 < var2) {
                      var2 = var5;
                    }
                  } else {
                    var3 = (int)((float)var2 / this.field_y);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (0.0f < this.field_y)) {
              var5Lifetime2 = (int)(this.field_y * (float)var3 + 0.5f);
              if (var2 < var5Lifetime2) {
                var3 = (int)((float)var2 / this.field_y);
              } else {
                if (var5Lifetime2 < var2) {
                  var2 = var5Lifetime2;
                }
              }
            }
            if (var2 != up.field_d) {
              this.field_g.a(var3, var2, (byte) -109);
            } else {
              if (eg.field_d != var3) {
                this.field_g.a(var3, var2, (byte) -109);
              }
            }
            if (0 < this.field_x) {
              aj.field_Gb = (-up.field_d + this.field_x) / 2;
            }
            return;
          }
          var2 = this.field_s;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_r < var3) {
          var3 = this.field_r;
        } else {
          if (this.field_l > var3) {
            var3 = this.field_l;
            if (!(0.0f < this.field_y)) {
              if (var2 != up.field_d) {
                this.field_g.a(var3, var2, (byte) -109);
              } else {
                if (eg.field_d != var3) {
                  this.field_g.a(var3, var2, (byte) -109);
                }
              }
              if (0 < this.field_x) {
                aj.field_Gb = (-up.field_d + this.field_x) / 2;
              }
              return;
            }
            var5Lifetime1 = (int)(this.field_y * (float)var3 + 0.5f);
            if (var2 >= var5Lifetime1) {
              if (var5Lifetime1 < var2) {
                var2 = var5Lifetime1;
              }
            } else {
              var3 = (int)((float)var2 / this.field_y);
            }
            decompiledFrameRemainder0 = false;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (0.0f < this.field_y)) {
          var5Lifetime1Lifetime1 = (int)(this.field_y * (float)var3 + 0.5f);
          if (var2 < var5Lifetime1Lifetime1) {
            var3 = (int)((float)var2 / this.field_y);
            if (var2 == up.field_d &&
              eg.field_d == var3) {
              if (0 >= this.field_x) {
                return;
              }
              aj.field_Gb = (-up.field_d + this.field_x) / 2;
              return;
            }
            this.field_g.a(var3, var2, (byte) -109);
            if (0 < this.field_x) {
              aj.field_Gb = (-up.field_d + this.field_x) / 2;
            }
            return;
          }
          if (var5Lifetime1Lifetime1 < var2) {
            var2 = var5Lifetime1Lifetime1;
          }
        }
        if (var2 != up.field_d) {
          this.field_g.a(var3, var2, (byte) -109);
        } else {
          if (eg.field_d != var3) {
            this.field_g.a(var3, var2, (byte) -109);
          }
        }
        if (0 >= this.field_x) {
          return;
        }
        aj.field_Gb = (-up.field_d + this.field_x) / 2;
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_m = null;
        field_h = null;
        if (param0 <= -102) {
          field_q = null;
          field_j = null;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        bn.a(41, (java.awt.Component) null, 93, -122);
        field_q = null;
        field_j = null;
    }

    private bn() throws Throwable {
        throw new Error();
    }

    final ek d(int param0) {
        this.field_e = eg.field_d;
        this.field_t = up.field_d;
        this.field_g.a(this.field_w, this.field_u, (byte) -86);
        if (param0 < 32) {
          return (ek) null;
        }
        ve.field_a = false;
        ek var2 = gh.a(0, -66, 0, this.field_w, i.field_A, this.field_u);
        if (var2 != null) {
          return var2;
        }
        this.a(6733);
        return var2;
    }

    static {
        field_n = 2;
        field_i = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_m = new String[]{"Trap", "<%highlight>This room contains a Trap!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>."};
        field_q = "INSTRUCTIONS";
    }
}
