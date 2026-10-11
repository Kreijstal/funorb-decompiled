/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    private int field_x;
    static String field_l;
    static boolean field_n;
    private int field_u;
    static String field_e;
    private int field_r;
    private int field_w;
    private int field_h;
    private boolean field_c;
    static byte[][] field_y;
    private int field_i;
    private int field_o;
    private float field_d;
    static String field_a;
    private int field_s;
    private int field_t;
    static String field_q;
    static String field_z;
    private int field_v;
    private bm field_f;
    static String field_g;
    static String field_k;
    private int field_A;
    private int field_p;
    private int field_j;
    private int field_b;
    private int field_m;

    public static void c(int param0) {
        field_e = null;
        if (param0 == 0) {
          field_q = null;
          field_z = null;
          field_a = null;
          field_l = null;
          field_g = null;
          field_k = null;
          field_y = (byte[][]) null;
          return;
        }
        gg.b((byte) 88);
        field_q = null;
        field_z = null;
        field_a = null;
        field_l = null;
        field_g = null;
        field_k = null;
        field_y = (byte[][]) null;
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = Chess.field_G;
        var2 = this.field_p;
        var3 = this.field_h;
        if (param0 == -21187) {
          if (!this.b(-1)) {
            this.field_c = false;
            return;
          }
          if (this.field_o < var3) {
            var3 = this.field_o;
            if (var2 <= this.field_m) {
              if (var2 < this.field_i) {
                var2 = this.field_i;
              }
            } else {
              var2 = this.field_m;
            }
            if (this.field_d > 0.0f) {
              var4 = (int)((float)var3 * this.field_d + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_d);
              } else {
                if (var4 < var2) {
                  var2 = var4;
                }
              }
            }
            if (tm.field_c != var2) {
              this.field_f.a(var3, var2, (byte) 91);
            } else {
              if (var3 != em.field_O) {
                this.field_f.a(var3, var2, (byte) 91);
              }
            }
          } else {
            if (this.field_v > var3) {
              var3 = this.field_v;
            }
            if (var2 > this.field_m) {
              var2 = this.field_m;
              if (this.field_d > 0.0f) {
                var4 = (int)((float)var3 * this.field_d + 0.5f);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / this.field_d);
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                }
              }
              if (tm.field_c != var2) {
                this.field_f.a(var3, var2, (byte) 91);
              } else {
                if (var3 != em.field_O) {
                  this.field_f.a(var3, var2, (byte) 91);
                }
              }
            } else {
              if (var2 < this.field_i) {
                var2 = this.field_i;
              }
              boolean decompiledFrameRemainder0 = true;
              if (this.field_d > 0.0f) {
                var4 = (int)((float)var3 * this.field_d + 0.5f);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / this.field_d);
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    if (tm.field_c != var2) {
                      this.field_f.a(var3, var2, (byte) 91);
                    } else {
                      if (var3 != em.field_O) {
                        this.field_f.a(var3, var2, (byte) 91);
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (tm.field_c == var2 &&
                  var3 == em.field_O) {
                  if (0 >= this.field_p) {
                    return;
                  }
                  db.field_p = (-tm.field_c + this.field_p) / 2;
                  return;
                }
                this.field_f.a(var3, var2, (byte) 91);
              }
            }
          }
          if (0 < this.field_p) {
            db.field_p = (-tm.field_c + this.field_p) / 2;
          }
          return;
        }
        this.d(47);
        if (!this.b(-1)) {
          this.field_c = false;
          return;
        }
        if (this.field_o < var3) {
          var3 = this.field_o;
          if (var2 <= this.field_m) {
            if (var2 < this.field_i) {
              var2 = this.field_i;
            }
          } else {
            var2 = this.field_m;
          }
          if (this.field_d > 0.0f) {
            var4Lifetime1 = (int)((float)var3 * this.field_d + 0.5f);
            if (var2 < var4Lifetime1) {
              var3 = (int)((float)var2 / this.field_d);
            } else {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
          }
          if (tm.field_c != var2) {
            this.field_f.a(var3, var2, (byte) 91);
          } else {
            if (var3 != em.field_O) {
              this.field_f.a(var3, var2, (byte) 91);
            }
          }
          if (0 < this.field_p) {
            db.field_p = (-tm.field_c + this.field_p) / 2;
          }
          return;
        }
        if (this.field_v > var3) {
          var3 = this.field_v;
        }
        if (var2 > this.field_m) {
          var2 = this.field_m;
          if (this.field_d > 0.0f) {
            var4Lifetime2 = (int)((float)var3 * this.field_d + 0.5f);
            if (var2 < var4Lifetime2) {
              var3 = (int)((float)var2 / this.field_d);
            } else {
              if (var4Lifetime2 < var2) {
                var2 = var4Lifetime2;
              }
            }
          }
        } else {
          if (var2 < this.field_i) {
            var2 = this.field_i;
          }
          if (this.field_d > 0.0f) {
            var4Lifetime2 = (int)((float)var3 * this.field_d + 0.5f);
            if (var2 < var4Lifetime2) {
              var3 = (int)((float)var2 / this.field_d);
            } else {
              if (var4Lifetime2 < var2) {
                var2 = var4Lifetime2;
                if (tm.field_c != var2) {
                  this.field_f.a(var3, var2, (byte) 91);
                  if (0 < this.field_p) {
                    db.field_p = (-tm.field_c + this.field_p) / 2;
                  }
                  return;
                }
                if (var3 != em.field_O) {
                  this.field_f.a(var3, var2, (byte) 91);
                }
                if (0 >= this.field_p) {
                  return;
                }
                db.field_p = (-tm.field_c + this.field_p) / 2;
                return;
              }
            }
          }
        }
        if (tm.field_c != var2) {
          this.field_f.a(var3, var2, (byte) 91);
        } else {
          if (var3 != em.field_O) {
            this.field_f.a(var3, var2, (byte) 91);
          }
        }
        if (0 >= this.field_p) {
          return;
        }
        db.field_p = (-tm.field_c + this.field_p) / 2;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -25 % ((param1 + 8) / 63);
        this.field_p = param0;
        this.field_h = param2;
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        if (null != rm.field_R) {
          return;
        }
        if (cl.field_d <= param0) {
          this.field_c = false;
        }
        if (this.field_c) {
          fieldTemp$0 = this.field_u - 1;
          this.field_u = this.field_u - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_u = this.field_b;
          if (this.field_j > jg.field_K) {
            this.field_c = false;
          } else {
            this.d(-21187);
          }
          return;
        }
        if (tm.field_c < this.field_p) {
          db.field_p = (this.field_p - tm.field_c) / 2;
        } else {
          if (0 < this.field_p) {
            db.field_p = 0;
          }
        }
        if (tm.field_c == this.field_r &&
          this.field_s == em.field_O) {
          return;
        }
        this.field_f.a(this.field_s, this.field_r, (byte) -9);
    }

    final void c(byte param0) {
        int var2 = -66 % ((param0 + 15) / 58);
        this.field_f.a(this.field_A, this.field_t, (byte) -100);
    }

    final a a(byte param0) {
        a var2 = null;
        this.field_A = em.field_O;
        this.field_t = tm.field_c;
        this.field_f.a(this.field_x, this.field_w, (byte) -101);
        if (param0 == 101) {
          hf.field_a = false;
          var2 = fn.a(0, this.field_x, 0, 66, this.field_w, oc.field_l);
          if (var2 == null) {
            this.c((byte) -104);
          }
          return var2;
        }
        return (a) null;
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        om var4_ref_om = null;
        Object var5 = null;
        int var6 = 0;
        uj var8 = null;
        nk var9 = null;
        byte[] var13 = null;
        var6 = Chess.field_G;
        try {
          var9 = tk.field_h;
          if (param0 != 84) {
            gg.b((byte) -2);
          }
          var2 = var9.i(param0 ^ -46);
          if (var2 == 0) {
            var8 = (uj) (vm.field_h.g(param0 ^ -18154));
            if (var8 == null) {
              si.d(65280);
              return;
            }
            var4 = var9.i(-89);
            if (var4 != 0) {
              var13 = new byte[var4];
              var9.a(var4, (byte) 123, var13, 0);
            } else {
              var5 = null;
            }
            var9.field_l = var9.field_l + 4;
            if (!var9.e(-114)) {
              si.d(param0 ^ 65364);
              return;
            }
            var8.c(-2193);
          } else {
            if (var2 == 1) {
              var3 = var9.e((byte) -117);
              var4_ref_om = (om) (fg.field_c.g(-18110));
              while (var4_ref_om != null) {
                if (var3 != var4_ref_om.field_k) {
                  var4_ref_om = (om) (fg.field_c.a((byte) -125));
                  continue;
                }
                break;
              }
              if (var4_ref_om == null) {
                si.d(65280);
                return;
              }
              var4_ref_om.c(-2193);
              return;
            }
            fg.a((Throwable) null, (byte) -77, "A1: " + tm.b((byte) -124));
            si.d(65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "gg.F(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 != -1) {
          this.field_h = 77;
          if (this.field_j > jg.field_K) {
            return false;
          }
          if (0 < cl.field_d) {
            return true;
          }
          return false;
        }
        if (this.field_j > jg.field_K) {
          return false;
        }
        if (0 < cl.field_d) {
          return true;
        }
        return false;
    }

    private gg() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "The following settings need to be changed:  ";
        field_g = "Friends";
        field_z = "This entry doesn't match";
        field_k = "Press ESC for options";
        field_q = "Connection restored.";
        field_e = "To Customer Support";
    }
}
