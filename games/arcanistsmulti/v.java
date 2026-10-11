/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_v;
    private int field_q;
    private int field_o;
    private qi field_a;
    private float field_b;
    private int field_u;
    private int field_f;
    private int field_s;
    static boolean field_t;
    int field_c;
    private int field_j;
    boolean field_l;
    static int[] field_p;
    static String field_n;
    int field_m;
    private int field_d;
    static int[] field_g;
    private int field_k;
    private int field_h;
    private int field_e;
    private int field_i;
    private int field_r;

    final uk a(int param0) {
        this.field_j = o.field_r;
        this.field_r = co.field_c;
        this.field_a.a(this.field_m, this.field_c, 120);
        jm.field_j = false;
        uk var2 = ol.a(0, 0, false, fi.field_d, this.field_c, this.field_m);
        if (param0 > 116) {
          if (var2 == null) {
            this.a(true);
          }
          return var2;
        }
        this.field_b = -0.11936065554618835f;
        if (var2 == null) {
          this.a(true);
        }
        return var2;
    }

    final static kc b(byte param0) {
        if (param0 <= 112) {
          v.a((byte) -59, true, false, -83, -46);
          return uc.b(115);
        }
        return uc.b(115);
    }

    final boolean a(int param0, int param1, int param2) {
        boolean stackIn_13_0 = false;
        if (param2 != -17969) {
          this.a((byte) 7, -10, -36);
          if (param0 < this.field_f) {
            return false;
          }
          if (param0 > this.field_k) {
            return false;
          }
          if (this.field_v > param1) {
            return false;
          }
          if (param1 > this.field_h) {
            return false;
          }
          if (this.field_b == 0.0f) {
            return true;
          }
          stackIn_13_0 = (Math.round((float)param1 * this.field_b) == param0);
          return stackIn_13_0;
        }
        if (param0 < this.field_f) {
          return false;
        }
        if (param0 > this.field_k) {
          return false;
        }
        if (this.field_v > param1) {
          return false;
        }
        if (param1 > this.field_h) {
          return false;
        }
        if (this.field_b == 0.0f) {
          return true;
        }
        if (Math.round((float)param1 * this.field_b) == param0) {
          return true;
        }
        return false;
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime1Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = this.field_d;
        if (param0 > 82) {
          var3 = this.field_u;
          if (!this.d((byte) 127)) {
            this.field_l = false;
            return;
          }
          if (this.field_k < var2) {
            var2 = this.field_k;
          } else {
            if (var2 < this.field_f) {
              var2 = this.field_f;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          if (var3 <= this.field_h) {
            if (var3 >= this.field_v) {
              if (0.0f < this.field_b) {
                var4 = (int)((float)var3 * this.field_b + 0.5f);
                if (var4 <= var2) {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_b);
                }
              }
              decompiledFrameRemainder3 = false;
            }
            else {
              var3 = this.field_v;
            }
          } else {
            var3 = this.field_h;
          }
          if ((decompiledFrameRemainder3) &&
            (0.0f < this.field_b)) {
            var4Lifetime2 = (int)((float)var3 * this.field_b + 0.5f);
            if (var4Lifetime2 > var2) {
              var3 = (int)((float)var2 / this.field_b);
            } else {
              if (var4Lifetime2 < var2) {
                var2 = var4Lifetime2;
              }
            }
          }
          if (o.field_r != var2) {
            this.field_a.a(var2, var3, 121);
          } else {
            if (co.field_c != var3) {
              this.field_a.a(var2, var3, 121);
            }
          }
          if (this.field_d > 0) {
            ta.field_e = (-o.field_r + this.field_d) / 2;
          }
          return;
        }
        this.b(-127, -102, 24);
        var3Lifetime1 = this.field_u;
        if (!this.d((byte) 127)) {
          this.field_l = false;
          return;
        }
        boolean decompiledFrameRemainder2 = true;
        if (this.field_k < var2) {
          var2 = this.field_k;
        } else {
          if (var2 >= this.field_f) {
            boolean decompiledFrameRemainder1 = true;
            if (var3Lifetime1 <= this.field_h) {
              if (var3Lifetime1 >= this.field_v) {
                if (0.0f < this.field_b) {
                  var4Lifetime1 = (int)((float)var3Lifetime1 * this.field_b + 0.5f);
                  if (var4Lifetime1 <= var2) {
                    if (var4Lifetime1 < var2) {
                      var2 = var4Lifetime1;
                    }
                  } else {
                    var3Lifetime1 = (int)((float)var2 / this.field_b);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                var3Lifetime1 = this.field_v;
              }
            } else {
              var3Lifetime1 = this.field_h;
            }
            if ((decompiledFrameRemainder1) &&
              (0.0f < this.field_b)) {
              var4Lifetime1Lifetime2 = (int)((float)var3Lifetime1 * this.field_b + 0.5f);
              if (var4Lifetime1Lifetime2 > var2) {
                var3Lifetime1 = (int)((float)var2 / this.field_b);
              } else {
                if (var4Lifetime1Lifetime2 < var2) {
                  var2 = var4Lifetime1Lifetime2;
                }
              }
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            var2 = this.field_f;
          }
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          if (var3Lifetime1 <= this.field_h) {
            if (var3Lifetime1 >= this.field_v) {
              if (0.0f < this.field_b) {
                var4Lifetime1Lifetime1 = (int)((float)var3Lifetime1 * this.field_b + 0.5f);
                if (var4Lifetime1Lifetime1 <= var2) {
                  if (var4Lifetime1Lifetime1 < var2) {
                    var2 = var4Lifetime1Lifetime1;
                  }
                } else {
                  var3Lifetime1 = (int)((float)var2 / this.field_b);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var3Lifetime1 = this.field_v;
            }
          } else {
            var3Lifetime1 = this.field_h;
          }
          if ((decompiledFrameRemainder0) &&
            (0.0f < this.field_b)) {
            var4Lifetime1Lifetime1Lifetime1 = (int)((float)var3Lifetime1 * this.field_b + 0.5f);
            if (var4Lifetime1Lifetime1Lifetime1 > var2) {
              var3Lifetime1 = (int)((float)var2 / this.field_b);
            } else {
              if (var4Lifetime1Lifetime1Lifetime1 < var2) {
                var2 = var4Lifetime1Lifetime1Lifetime1;
              }
            }
          }
        }
        if (o.field_r != var2) {
          this.field_a.a(var2, var3Lifetime1, 121);
        } else {
          if (co.field_c != var3Lifetime1) {
            this.field_a.a(var2, var3Lifetime1, 121);
          }
        }
        if (this.field_d > 0) {
          ta.field_e = (-o.field_r + this.field_d) / 2;
        }
        return;
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 > -23) {
          return;
        }
        this.field_m = param1;
        this.field_c = param0;
    }

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          return;
        }
        this.field_d = param1;
        this.field_u = param0;
    }

    final boolean d(byte param0) {
        int var2 = 40 % ((32 - param0) / 43);
        if (this.field_q > wl.field_K) {
          return false;
        }
        if (ah.field_c > 0) {
          return true;
        }
        return false;
    }

    final static eg a(byte param0, boolean param1, boolean param2, int param3, int param4) {
        if (param0 == -93) {
          return me.a(param3, param2, param0 + 2097245, param1, param4, false);
        }
        v.a((byte) -92, false, true, 53, 6);
        return me.a(param3, param2, param0 + 2097245, param1, param4, false);
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.a(-12, -65, (byte) -64);
          if (ah.field_c <= 0) {
            return false;
          }
          if (wl.field_K < this.field_q) {
            return true;
          }
          return false;
        }
        if (ah.field_c <= 0) {
          return false;
        }
        if (wl.field_K < this.field_q) {
          return true;
        }
        return false;
    }

    final void b(int param0, int param1, int param2) {
        if (param1 == 8110) {
          this.field_f = param2;
          this.field_v = param0;
          return;
        }
        this.b(38, -64, 88);
        this.field_f = param2;
        this.field_v = param0;
    }

    final void a(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_a.a(this.field_j, this.field_r, 9);
    }

    v(qi param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (param0 != 93) {
          v.b(1);
          if (ka.field_m != null) {
            return;
          }
          if (ah.field_c <= 0) {
            this.field_l = false;
          }
          if (this.field_l) {
            fieldTemp$1 = this.field_s - 1;
            this.field_s = this.field_s - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_s = this.field_i;
            if (this.field_q > wl.field_K) {
              this.field_l = false;
            } else {
              this.c((byte) 89);
            }
            return;
          }
          if (this.field_d > o.field_r) {
            ta.field_e = (-o.field_r + this.field_d) / 2;
          } else {
            if (this.field_d <= 0) {
              if (this.field_o == o.field_r &&
                this.field_e == co.field_c) {
                return;
              }
              this.field_a.a(this.field_o, this.field_e, param0 ^ -4);
              return;
            }
            ta.field_e = 0;
          }
        } else {
          if (ka.field_m != null) {
            return;
          }
          if (ah.field_c <= 0) {
            this.field_l = false;
          }
          if (this.field_l) {
            fieldTemp$0 = this.field_s - 1;
            this.field_s = this.field_s - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_s = this.field_i;
            if (this.field_q > wl.field_K) {
              this.field_l = false;
            } else {
              this.c((byte) 89);
            }
            return;
          }
          if (this.field_d > o.field_r) {
            ta.field_e = (-o.field_r + this.field_d) / 2;
          } else {
            if (this.field_d > 0) {
              ta.field_e = 0;
            }
          }
        }
        if (this.field_o == o.field_r &&
          this.field_e == co.field_c) {
          return;
        }
        this.field_a.a(this.field_o, this.field_e, param0 ^ -4);
    }

    public static void b(int param0) {
        if (param0 == -18033) {
          field_g = null;
          field_n = null;
          field_p = null;
          return;
        }
        field_n = (String) null;
        field_g = null;
        field_n = null;
        field_p = null;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_h = param1;
        this.field_k = param2;
        if (param0 > -14) {
          this.c((byte) -10);
        }
    }

    private v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, qi param8) {
        try {
          this.field_c = 480;
          this.field_h = param3;
          this.field_v = param1;
          this.field_l = false;
          this.field_m = 640;
          this.field_q = param6;
          this.field_f = param0;
          this.field_e = param5;
          this.field_b = 0.0f;
          this.field_o = param4;
          this.field_a = param8;
          this.field_k = param2;
          this.field_i = param7;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "v.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "The invitation has been withdrawn.";
        field_p = new int[128];
        field_g = new int[8192];
        field_t = true;
    }
}
