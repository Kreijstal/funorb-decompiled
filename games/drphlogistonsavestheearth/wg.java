/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    private int field_l;
    static he field_c;
    private int field_m;
    private int field_t;
    private int field_p;
    private int field_s;
    private int field_e;
    private wf field_b;
    static String[] field_r;
    static qb field_u;
    private int field_f;
    private int field_n;
    private int field_g;
    private int field_o;
    static boolean field_d;
    private boolean field_q;
    private float field_j;
    private int field_a;
    private int field_i;
    private int field_v;
    static String[] field_h;
    static ql field_k;

    final void a(int param0, int param1, int param2) {
        this.field_i = param1;
        this.field_s = param0;
        if (param2 != 2) {
          wg.b(99);
        }
    }

    public static void b(int param0) {
        if (param0 == 2) {
          field_c = null;
          field_r = null;
          field_h = null;
          field_k = null;
          field_u = null;
          return;
        }
        field_h = (String[]) null;
        field_c = null;
        field_r = null;
        field_h = null;
        field_k = null;
        field_u = null;
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        if (df.field_l != null) {
          return;
        }
        if (0 >= hb.field_g) {
          this.field_q = false;
        }
        if (!this.field_q) {
          if (fg.field_h < this.field_i) {
            tg.field_b = (-fg.field_h + this.field_i) / 2;
          } else {
            if (0 < this.field_i) {
              tg.field_b = 0;
            }
          }
          if (this.field_p == fg.field_h &&
            bh.field_a == this.field_t) {
            return;
          }
          this.field_b.a(this.field_t, this.field_p, -64);
          return;
        }
        if (param0 < 120) {
          return;
        }
        fieldTemp$0 = this.field_m - 1;
        this.field_m = this.field_m - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_m = this.field_l;
        if (this.field_v > pe.field_g) {
          this.field_q = false;
        } else {
          this.a(false);
        }
        return;
    }

    final void b(byte param0) {
        if (param0 != -7) {
          return;
        }
        this.field_b.a(this.field_o, this.field_e, -64);
    }

    final boolean a(int param0) {
        if (param0 != -30292) {
          this.field_e = -23;
          if (pe.field_g < this.field_v) {
            return false;
          }
          if (hb.field_g > 0) {
            return true;
          }
          return false;
        }
        if (pe.field_g < this.field_v) {
          return false;
        }
        if (hb.field_g > 0) {
          return true;
        }
        return false;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_u = (qb) null;
          }
          stackIn_3_0 = fk.field_h.a("", param0, 24874);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime1Lifetime1;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param0) {
          var2 = this.field_i;
          var3 = this.field_s;
          if (!this.a(-30292)) {
            this.field_q = false;
            return;
          }
          if (var3 > this.field_n) {
            var3 = this.field_n;
          } else {
            if (this.field_f > var3) {
              var3 = this.field_f;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          if (this.field_g < var2) {
            var2 = this.field_g;
          } else {
            if (var2 < this.field_a) {
              var2 = this.field_a;
              if (0.0f < this.field_j) {
                var4 = (int)(0.5f + this.field_j * (float)var3);
                if (var4 <= var2) {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_j);
                }
              }
              decompiledFrameRemainder3 = false;
            }
          }
          if ((decompiledFrameRemainder3) &&
            (0.0f < this.field_j)) {
            var4Lifetime2 = (int)(0.5f + this.field_j * (float)var3);
            if (var4Lifetime2 > var2) {
              var3 = (int)((float)var2 / this.field_j);
            } else {
              if (var4Lifetime2 < var2) {
                var2 = var4Lifetime2;
              }
            }
          }
          if (fg.field_h != var2) {
            this.field_b.a(var3, var2, -64);
          } else {
            if (var3 != bh.field_a) {
              this.field_b.a(var3, var2, -64);
            }
          }
          if (0 < this.field_i) {
            tg.field_b = (this.field_i - fg.field_h) / 2;
          }
          return;
        }
        this.field_l = 50;
        var2Lifetime1 = this.field_i;
        var3Lifetime1 = this.field_s;
        if (!this.a(-30292)) {
          this.field_q = false;
          return;
        }
        boolean decompiledFrameRemainder2 = true;
        if (var3Lifetime1 > this.field_n) {
          var3Lifetime1 = this.field_n;
        } else {
          if (this.field_f <= var3Lifetime1) {
            boolean decompiledFrameRemainder1 = true;
            if (this.field_g < var2Lifetime1) {
              var2Lifetime1 = this.field_g;
            } else {
              if (var2Lifetime1 < this.field_a) {
                var2Lifetime1 = this.field_a;
                if (0.0f < this.field_j) {
                  var4Lifetime1 = (int)(0.5f + this.field_j * (float)var3Lifetime1);
                  if (var4Lifetime1 <= var2Lifetime1) {
                    if (var4Lifetime1 < var2Lifetime1) {
                      var2Lifetime1 = var4Lifetime1;
                    }
                  } else {
                    var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_j);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (0.0f < this.field_j)) {
              var4Lifetime1Lifetime2 = (int)(0.5f + this.field_j * (float)var3Lifetime1);
              if (var4Lifetime1Lifetime2 > var2Lifetime1) {
                var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_j);
              } else {
                if (var4Lifetime1Lifetime2 < var2Lifetime1) {
                  var2Lifetime1 = var4Lifetime1Lifetime2;
                }
              }
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            var3Lifetime1 = this.field_f;
          }
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_g < var2Lifetime1) {
            var2Lifetime1 = this.field_g;
          } else {
            if (var2Lifetime1 < this.field_a) {
              var2Lifetime1 = this.field_a;
              if (0.0f < this.field_j) {
                var4Lifetime1Lifetime1 = (int)(0.5f + this.field_j * (float)var3Lifetime1);
                if (var4Lifetime1Lifetime1 <= var2Lifetime1) {
                  if (var4Lifetime1Lifetime1 < var2Lifetime1) {
                    var2Lifetime1 = var4Lifetime1Lifetime1;
                  }
                } else {
                  var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_j);
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (0.0f < this.field_j)) {
            var4Lifetime1Lifetime1Lifetime1 = (int)(0.5f + this.field_j * (float)var3Lifetime1);
            if (var4Lifetime1Lifetime1Lifetime1 > var2Lifetime1) {
              var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_j);
            } else {
              if (var4Lifetime1Lifetime1Lifetime1 < var2Lifetime1) {
                var2Lifetime1 = var4Lifetime1Lifetime1Lifetime1;
              }
            }
          }
        }
        if (fg.field_h != var2Lifetime1) {
          this.field_b.a(var3Lifetime1, var2Lifetime1, -64);
        } else {
          if (var3Lifetime1 != bh.field_a) {
            this.field_b.a(var3Lifetime1, var2Lifetime1, -64);
          }
        }
        if (0 < this.field_i) {
          tg.field_b = (this.field_i - fg.field_h) / 2;
        }
        return;
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
        field_r = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_u = new qb();
        field_k = new ql(1);
    }
}
