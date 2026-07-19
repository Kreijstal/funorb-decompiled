/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static int field_e;
    private double field_l;
    static String field_a;
    private int field_n;
    static ak field_k;
    int field_h;
    private int field_p;
    int field_g;
    private double field_q;
    static String field_m;
    static String field_b;
    static int field_f;
    static int field_d;
    static int field_j;
    static String field_c;
    private int field_o;
    private int field_i;

    private final void a(byte param0) {
        this.field_g = this.field_i - -(int)((double)this.field_o * Math.sin(this.field_l));
        if (param0 > -97) {
          field_d = 71;
          this.field_h = this.field_p + (int)((double)this.field_o * Math.cos(this.field_l));
          return;
        } else {
          this.field_h = this.field_p + (int)((double)this.field_o * Math.cos(this.field_l));
          return;
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        og var4_ref_og = null;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        um var9 = null;
        pc var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 14) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var10 = vi.field_o;
            var2 = var10.f(255);
            if (var2 == 0) {
              var9 = (um) ((Object) bq.field_a.c(1504642273));
              if (var9 != null) {
                L2: {
                  var4 = var10.f(255);
                  if (var4 != 0) {
                    var12 = new byte[var4];
                    var11 = var12;
                    var8 = var11;
                    var5 = var8;
                    var10.a(var12, 0, -89, var4);
                    break L2;
                  } else {
                    var5 = null;
                    break L2;
                  }
                }
                var10.field_m = var10.field_m + 4;
                if (!var10.d((byte) 124)) {
                  na.a(true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var9.field_p = true;
                  var9.field_n = var5;
                  var9.c(2779);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                na.a(true);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if (1 == var2) {
                var3 = var10.k(0);
                var4_ref_og = (og) ((Object) wk.field_g.c(1504642273));
                L3: while (true) {
                  L4: {
                    if (var4_ref_og == null) {
                      break L4;
                    } else {
                      if (var4_ref_og.field_m != var3) {
                        var4_ref_og = (og) ((Object) wk.field_g.f(1504642273));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_ref_og != null) {
                    var4_ref_og.c(2779);
                    return;
                  } else {
                    na.a(true);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                jo.a(1, "A1: " + jm.b(-26), (Throwable) null);
                na.a(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ki.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        double stackIn_3_0 = 0.0;
        double stackOut_2_0 = 0.0;
        double stackOut_1_0 = 0.0;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var4 = 2 + ((-this.field_n + 4096) * 4 >> 1453569708);
          var5 = var4 * (this.field_i - param2);
          this.field_i = param2;
          var6 = (double)var5 / 300.0;
          this.field_p = param0;
          if (0.0 > this.field_l) {
            stackOut_2_0 = 0.001;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -0.001;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        if (param1 == 48) {
          this.field_q = this.field_q + var8;
          if (0.0 > this.field_q) {
            L1: {
              this.field_q = this.field_q + 0.0006;
              this.field_l = this.field_l + (var6 + this.field_q);
              if (0.1 < this.field_q) {
                this.field_q = 0.1;
                break L1;
              } else {
                break L1;
              }
            }
            if (3.141592653589793 < this.field_l) {
              L2: {
                this.field_l = this.field_l - 6.283185307179586;
                if (this.field_q < -0.1) {
                  this.field_q = -0.1;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 <= this.field_l) {
                L3: {
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L4: {
                  this.field_l = this.field_l + 6.283185307179586;
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.a((byte) -104);
                return;
              }
            }
          } else {
            L5: {
              this.field_q = this.field_q - 0.0006;
              this.field_l = this.field_l + (var6 + this.field_q);
              if (0.1 < this.field_q) {
                this.field_q = 0.1;
                break L5;
              } else {
                break L5;
              }
            }
            if (3.141592653589793 < this.field_l) {
              L6: {
                this.field_l = this.field_l - 6.283185307179586;
                if (this.field_q < -0.1) {
                  this.field_q = -0.1;
                  break L6;
                } else {
                  break L6;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 > this.field_l) {
                L7: {
                  this.field_l = this.field_l + 6.283185307179586;
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L8: {
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.a((byte) -104);
                return;
              }
            }
          }
        } else {
          this.field_o = -95;
          this.field_q = this.field_q + var8;
          if (0.0 > this.field_q) {
            L9: {
              this.field_q = this.field_q + 0.0006;
              this.field_l = this.field_l + (var6 + this.field_q);
              if (0.1 < this.field_q) {
                this.field_q = 0.1;
                break L9;
              } else {
                break L9;
              }
            }
            if (3.141592653589793 < this.field_l) {
              L10: {
                this.field_l = this.field_l - 6.283185307179586;
                if (this.field_q < -0.1) {
                  this.field_q = -0.1;
                  break L10;
                } else {
                  break L10;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 > this.field_l) {
                L11: {
                  this.field_l = this.field_l + 6.283185307179586;
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L12: {
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                this.a((byte) -104);
                return;
              }
            }
          } else {
            L13: {
              this.field_q = this.field_q - 0.0006;
              this.field_l = this.field_l + (var6 + this.field_q);
              if (0.1 < this.field_q) {
                this.field_q = 0.1;
                break L13;
              } else {
                break L13;
              }
            }
            if (3.141592653589793 >= this.field_l) {
              if (-3.141592653589793 <= this.field_l) {
                L14: {
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L15: {
                  this.field_l = this.field_l + 6.283185307179586;
                  if (this.field_q < -0.1) {
                    this.field_q = -0.1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                this.a((byte) -104);
                return;
              }
            } else {
              L16: {
                this.field_l = this.field_l - 6.283185307179586;
                if (this.field_q < -0.1) {
                  this.field_q = -0.1;
                  break L16;
                } else {
                  break L16;
                }
              }
              this.a((byte) -104);
              return;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        if (param0 != 3887) {
          this.b(19);
          var2 = (int)(this.field_l * 32768.0 / 3.141592653589793);
          hb.field_hb.b(672, 160, this.field_g << 1872364164, this.field_h << 130198596, var2, this.field_n);
          return;
        } else {
          var2 = (int)(this.field_l * 32768.0 / 3.141592653589793);
          hb.field_hb.b(672, 160, this.field_g << 1872364164, this.field_h << 130198596, var2, this.field_n);
          return;
        }
    }

    final void a(boolean param0) {
        t.b(this.field_i, this.field_p, this.field_g, this.field_h, 6710784);
        if (param0) {
          field_a = (String) null;
          t.b(this.field_i + 1, this.field_p, 1 + this.field_g, this.field_h, 3355392);
          t.b(this.field_i + -1, this.field_p, -1 + this.field_g, this.field_h, 3355392);
          return;
        } else {
          t.b(this.field_i + 1, this.field_p, 1 + this.field_g, this.field_h, 3355392);
          t.b(this.field_i + -1, this.field_p, -1 + this.field_g, this.field_h, 3355392);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 25335) {
            return;
        }
        field_a = null;
        field_b = null;
        field_k = null;
        field_c = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 != -1) {
          ki.c(-60);
          gq.a(param1 + 1, param3, param0, Integer.toString(param2));
          return;
        } else {
          gq.a(param1 + 1, param3, param0, Integer.toString(param2));
          return;
        }
    }

    ki(int param0, int param1, int param2, int param3) {
        this.field_o = param2;
        this.field_n = param3;
        this.field_p = param1;
        this.field_l = -1.5707963267948966;
        this.field_i = param0;
        this.a((byte) -112);
    }

    static {
        field_f = 0;
        field_m = "Puzzle";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
        field_d = -1;
        field_b = "Full";
        field_c = "This password contains your email address, and would be easy to guess";
        field_j = 0;
    }
}
