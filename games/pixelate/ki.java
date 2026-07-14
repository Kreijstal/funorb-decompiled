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
        ((ki) this).field_g = ((ki) this).field_i - -(int)((double)((ki) this).field_o * Math.sin(((ki) this).field_l));
        if (param0 > -97) {
          field_d = 71;
          ((ki) this).field_h = ((ki) this).field_p + (int)((double)((ki) this).field_o * Math.cos(((ki) this).field_l));
          return;
        } else {
          ((ki) this).field_h = ((ki) this).field_p + (int)((double)((ki) this).field_o * Math.cos(((ki) this).field_l));
          return;
        }
    }

    final static void a(int param0) {
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
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 >= 14) {
          var10 = vi.field_o;
          var2 = var10.f(255);
          if (var2 == 0) {
            var9 = (um) (Object) bq.field_a.c(1504642273);
            if (var9 != null) {
              L0: {
                var4 = var10.f(255);
                if (var4 != 0) {
                  var12 = new byte[var4];
                  var11 = var12;
                  var8 = var11;
                  var5 = var8;
                  var10.a(var12, 0, -89, var4);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              var10.field_m = var10.field_m + 4;
              if (!var10.d((byte) 124)) {
                na.a(true);
                return;
              } else {
                var9.field_p = true;
                var9.field_n = var5;
                var9.c(2779);
                return;
              }
            } else {
              na.a(true);
              return;
            }
          } else {
            if (1 == var2) {
              var3 = var10.k(0);
              var4_ref_og = (og) (Object) wk.field_g.c(1504642273);
              L1: while (true) {
                if (var4_ref_og == null) {
                  if (var4_ref_og != null) {
                    var4_ref_og.c(2779);
                    return;
                  } else {
                    na.a(true);
                    return;
                  }
                } else {
                  if (var4_ref_og.field_m != var3) {
                    var4_ref_og = (og) (Object) wk.field_g.f(1504642273);
                    continue L1;
                  } else {
                    if (var4_ref_og != null) {
                      var4_ref_og.c(2779);
                      return;
                    } else {
                      na.a(true);
                      return;
                    }
                  }
                }
              }
            } else {
              jo.a(1, "A1: " + jm.b(-26), (Throwable) null);
              na.a(true);
              return;
            }
          }
        } else {
          field_a = null;
          var10 = vi.field_o;
          var2 = var10.f(255);
          if (var2 == 0) {
            var9 = (um) (Object) bq.field_a.c(1504642273);
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
                return;
              } else {
                var9.field_p = true;
                var9.field_n = var5;
                var9.c(2779);
                return;
              }
            } else {
              na.a(true);
              return;
            }
          } else {
            if (1 == var2) {
              var3 = var10.k(0);
              var4_ref_og = (og) (Object) wk.field_g.c(1504642273);
              L3: while (true) {
                if (var4_ref_og != null) {
                  if (var4_ref_og.field_m != var3) {
                    var4_ref_og = (og) (Object) wk.field_g.f(1504642273);
                    continue L3;
                  } else {
                    if (var4_ref_og == null) {
                      na.a(true);
                      return;
                    } else {
                      var4_ref_og.c(2779);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_og == null) {
                    na.a(true);
                    return;
                  } else {
                    var4_ref_og.c(2779);
                    return;
                  }
                }
              }
            } else {
              jo.a(1, "A1: " + jm.b(-26), (Throwable) null);
              na.a(true);
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
          var4 = 2 + ((-((ki) this).field_n + 4096) * 4 >> 1453569708);
          var5 = var4 * (((ki) this).field_i - param2);
          ((ki) this).field_i = param2;
          var6 = (double)var5 / 300.0;
          ((ki) this).field_p = param0;
          if (0.0 > ((ki) this).field_l) {
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
          ((ki) this).field_q = ((ki) this).field_q + var8;
          if (0.0 > ((ki) this).field_q) {
            L1: {
              ((ki) this).field_q = ((ki) this).field_q + 0.0006;
              ((ki) this).field_l = ((ki) this).field_l + (var6 + ((ki) this).field_q);
              if (0.1 < ((ki) this).field_q) {
                ((ki) this).field_q = 0.1;
                break L1;
              } else {
                break L1;
              }
            }
            if (3.141592653589793 < ((ki) this).field_l) {
              L2: {
                ((ki) this).field_l = ((ki) this).field_l - 6.283185307179586;
                if (((ki) this).field_q < -0.1) {
                  ((ki) this).field_q = -0.1;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 <= ((ki) this).field_l) {
                L3: {
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L4: {
                  ((ki) this).field_l = ((ki) this).field_l + 6.283185307179586;
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
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
              ((ki) this).field_q = ((ki) this).field_q - 0.0006;
              ((ki) this).field_l = ((ki) this).field_l + (var6 + ((ki) this).field_q);
              if (0.1 < ((ki) this).field_q) {
                ((ki) this).field_q = 0.1;
                break L5;
              } else {
                break L5;
              }
            }
            if (3.141592653589793 < ((ki) this).field_l) {
              L6: {
                ((ki) this).field_l = ((ki) this).field_l - 6.283185307179586;
                if (((ki) this).field_q < -0.1) {
                  ((ki) this).field_q = -0.1;
                  break L6;
                } else {
                  break L6;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 > ((ki) this).field_l) {
                L7: {
                  ((ki) this).field_l = ((ki) this).field_l + 6.283185307179586;
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L8: {
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
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
          ((ki) this).field_o = -95;
          ((ki) this).field_q = ((ki) this).field_q + var8;
          if (0.0 > ((ki) this).field_q) {
            L9: {
              ((ki) this).field_q = ((ki) this).field_q + 0.0006;
              ((ki) this).field_l = ((ki) this).field_l + (var6 + ((ki) this).field_q);
              if (0.1 < ((ki) this).field_q) {
                ((ki) this).field_q = 0.1;
                break L9;
              } else {
                break L9;
              }
            }
            if (3.141592653589793 < ((ki) this).field_l) {
              L10: {
                ((ki) this).field_l = ((ki) this).field_l - 6.283185307179586;
                if (((ki) this).field_q < -0.1) {
                  ((ki) this).field_q = -0.1;
                  break L10;
                } else {
                  break L10;
                }
              }
              this.a((byte) -104);
              return;
            } else {
              if (-3.141592653589793 > ((ki) this).field_l) {
                L11: {
                  ((ki) this).field_l = ((ki) this).field_l + 6.283185307179586;
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L12: {
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
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
              ((ki) this).field_q = ((ki) this).field_q - 0.0006;
              ((ki) this).field_l = ((ki) this).field_l + (var6 + ((ki) this).field_q);
              if (0.1 < ((ki) this).field_q) {
                ((ki) this).field_q = 0.1;
                break L13;
              } else {
                break L13;
              }
            }
            if (3.141592653589793 >= ((ki) this).field_l) {
              if (-3.141592653589793 <= ((ki) this).field_l) {
                L14: {
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                this.a((byte) -104);
                return;
              } else {
                L15: {
                  ((ki) this).field_l = ((ki) this).field_l + 6.283185307179586;
                  if (((ki) this).field_q < -0.1) {
                    ((ki) this).field_q = -0.1;
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
                ((ki) this).field_l = ((ki) this).field_l - 6.283185307179586;
                if (((ki) this).field_q < -0.1) {
                  ((ki) this).field_q = -0.1;
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
          ((ki) this).b(19);
          var2 = (int)(((ki) this).field_l * 32768.0 / 3.141592653589793);
          hb.field_hb.b(672, 160, ((ki) this).field_g << 1872364164, ((ki) this).field_h << 130198596, var2, ((ki) this).field_n);
          return;
        } else {
          var2 = (int)(((ki) this).field_l * 32768.0 / 3.141592653589793);
          hb.field_hb.b(672, 160, ((ki) this).field_g << 1872364164, ((ki) this).field_h << 130198596, var2, ((ki) this).field_n);
          return;
        }
    }

    final void a(boolean param0) {
        t.b(((ki) this).field_i, ((ki) this).field_p, ((ki) this).field_g, ((ki) this).field_h, 6710784);
        if (param0) {
          field_a = null;
          t.b(((ki) this).field_i + 1, ((ki) this).field_p, 1 + ((ki) this).field_g, ((ki) this).field_h, 3355392);
          t.b(((ki) this).field_i + -1, ((ki) this).field_p, -1 + ((ki) this).field_g, ((ki) this).field_h, 3355392);
          return;
        } else {
          t.b(((ki) this).field_i + 1, ((ki) this).field_p, 1 + ((ki) this).field_g, ((ki) this).field_h, 3355392);
          t.b(((ki) this).field_i + -1, ((ki) this).field_p, -1 + ((ki) this).field_g, ((ki) this).field_h, 3355392);
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
        ((ki) this).field_o = param2;
        ((ki) this).field_n = param3;
        ((ki) this).field_p = param1;
        ((ki) this).field_l = -1.5707963267948966;
        ((ki) this).field_i = param0;
        this.a((byte) -112);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_m = "Puzzle";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
        field_d = -1;
        field_b = "Full";
        field_c = "This password contains your email address, and would be easy to guess";
        field_j = 0;
    }
}
