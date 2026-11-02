/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vfa {
    private int field_r;
    private int field_c;
    private int field_h;
    private int field_m;
    private int field_s;
    private int field_f;
    private int field_o;
    private int field_n;
    int field_q;
    static IntrusiveDeque field_p;
    private int field_t;
    private float field_j;
    int field_i;
    private int field_l;
    private int field_g;
    private nka field_a;
    int field_e;
    static phb[] field_d;
    private int field_k;
    boolean field_b;

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = VoidHunters.field_G;
        var2 = this.field_f;
        var3 = this.field_h;
        if (!this.a(20)) {
          this.field_b = false;
          return;
        }
        if (var3 <= this.field_n) {
          if (this.field_l > var3) {
            var3 = this.field_l;
          }
        } else {
          var3 = this.field_n;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_o < var2) {
          var2 = this.field_o;
        } else {
          if (var2 >= this.field_g) {
            if (param0 != -17698) {
              this.field_n = -54;
              if (0.0f < this.field_j) {
                var4 = (int)(0.5f + (float)var3 * this.field_j);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / this.field_j);
                } else {
                  if (var2 > var4) {
                    var2 = var4;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(!(0.0f < this.field_j)))) {
              var4Lifetime2 = (int)(0.5f + (float)var3 * this.field_j);
              if (var2 < var4Lifetime2) {
                var3 = (int)((float)var2 / this.field_j);
              } else {
                if (var2 > var4Lifetime2) {
                  var2 = var4Lifetime2;
                }
              }
              if (var2 != GetDebrisSurvives.field_p) {
                this.field_a.a(99, var2, var3);
              } else {
                if (SetPointDefenceLaserReload.field_p != var3) {
                  this.field_a.a(99, var2, var3);
                }
              }
              if (0 < this.field_f) {
                GetCountermeasuresPulseRadius.field_o = (this.field_f - GetDebrisSurvives.field_p) / 2;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            var2 = this.field_g;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param0 != -17698) {
            this.field_n = -54;
          }
          if (0.0f < this.field_j) {
            var4Lifetime1 = (int)(0.5f + (float)var3 * this.field_j);
            if (var2 < var4Lifetime1) {
              var3 = (int)((float)var2 / this.field_j);
            } else {
              if (var2 > var4Lifetime1) {
                var2 = var4Lifetime1;
              }
            }
          }
        }
        if (var2 != GetDebrisSurvives.field_p) {
          this.field_a.a(99, var2, var3);
        } else {
          if (SetPointDefenceLaserReload.field_p != var3) {
            this.field_a.a(99, var2, var3);
          }
        }
        if (0 < this.field_f) {
          GetCountermeasuresPulseRadius.field_o = (this.field_f - GetDebrisSurvives.field_p) / 2;
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_q = param2;
        if (param1 != 480) {
          this.field_s = -38;
          this.field_e = param0;
          return;
        }
        this.field_e = param0;
    }

    final ufb a(byte param0) {
        ufb var2 = null;
        ufb var2Lifetime1;
        this.field_s = GetDebrisSurvives.field_p;
        this.field_r = SetPointDefenceLaserReload.field_p;
        if (param0 < 112) {
          vfa.a(false, -4);
          this.field_a.a(65, this.field_q, this.field_e);
          GetDebrisSurvives.field_q = false;
          var2 = ob.a(0, SetTorpedoProjectiles.field_o, this.field_q, this.field_e, 0, 0);
          if (var2 == null) {
            this.c(-29674);
            return var2;
          }
          return var2;
        }
        this.field_a.a(65, this.field_q, this.field_e);
        GetDebrisSurvives.field_q = false;
        var2Lifetime1 = ob.a(0, SetTorpedoProjectiles.field_o, this.field_q, this.field_e, 0, 0);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.c(-29674);
        return var2Lifetime1;
    }

    final boolean a(int param0) {
        if (param0 < 0) {
          return false;
        }
        if (this.field_i > Nebula.field_b) {
          return false;
        }
        if (GetDebrisCarryOver.field_o <= 0) {
          return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 != -17) {
          this.field_i = 13;
          if (GetDebrisCarryOver.field_o <= 0) {
            return false;
          }
          if (this.field_i > Nebula.field_b) {
            return true;
          }
          return false;
        }
        if (GetDebrisCarryOver.field_o <= 0) {
          return false;
        }
        if (this.field_i > Nebula.field_b) {
          return true;
        }
        return false;
    }

    final void c(int param0, int param1, int param2) {
        this.field_f = param1;
        int var4 = 89 / ((param0 - 14) / 39);
        this.field_h = param2;
    }

    public static void c(byte param0) {
        field_d = null;
        field_p = null;
        if (param0 != 120) {
          field_p = (IntrusiveDeque) null;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        boolean stackIn_13_0 = false;
        if (param2 != 0) {
          this.field_b = true;
          if (this.field_g > param1) {
            return false;
          }
          if (param1 > this.field_o) {
            return false;
          }
          if (this.field_l > param0) {
            return false;
          }
          if (this.field_n < param0) {
            return false;
          }
          if (this.field_j == 0.0f) {
            return true;
          }
          stackIn_13_0 = (Math.round(this.field_j * (float)param0) == param1);
          return stackIn_13_0;
        }
        if (this.field_g > param1) {
          return false;
        }
        if (param1 > this.field_o) {
          return false;
        }
        if (this.field_l > param0) {
          return false;
        }
        if (this.field_n < param0) {
          return false;
        }
        if (this.field_j == 0.0f) {
          return true;
        }
        if (Math.round(this.field_j * (float)param0) == param1) {
          return true;
        }
        return false;
    }

    final void d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (null != psb.field_b) {
          return;
        }
        if (0 < GetDebrisCarryOver.field_o) {
          if (this.field_b) {
            fieldTemp$1 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            if (0 < fieldTemp$1) {
              return;
            }
            this.field_k = this.field_m;
            if (param0 != 3908) {
              field_d = (phb[]) null;
            }
            if (Nebula.field_b < this.field_i) {
              this.field_b = false;
            } else {
              this.b(-17698);
            }
            return;
          }
          if (this.field_f > GetDebrisSurvives.field_p) {
            GetCountermeasuresPulseRadius.field_o = (this.field_f - GetDebrisSurvives.field_p) / 2;
          } else {
            if (this.field_f <= 0) {
              if (this.field_c == GetDebrisSurvives.field_p &&
                this.field_t == SetPointDefenceLaserReload.field_p) {
                return;
              }
              this.field_a.a(98, this.field_c, this.field_t);
              return;
            }
            GetCountermeasuresPulseRadius.field_o = 0;
          }
          if (this.field_c != GetDebrisSurvives.field_p) {
            this.field_a.a(98, this.field_c, this.field_t);
          } else {
            if (this.field_t != SetPointDefenceLaserReload.field_p) {
              this.field_a.a(98, this.field_c, this.field_t);
            }
          }
          return;
        }
        this.field_b = false;
        if (this.field_b) {
          fieldTemp$0 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_k = this.field_m;
          if (param0 != 3908) {
            field_d = (phb[]) null;
          }
          if (Nebula.field_b >= this.field_i) {
            this.b(-17698);
          } else {
            this.field_b = false;
          }
          return;
        }
        if (this.field_f > GetDebrisSurvives.field_p) {
          GetCountermeasuresPulseRadius.field_o = (this.field_f - GetDebrisSurvives.field_p) / 2;
        } else {
          if (this.field_f > 0) {
            GetCountermeasuresPulseRadius.field_o = 0;
            if (this.field_c != GetDebrisSurvives.field_p) {
              this.field_a.a(98, this.field_c, this.field_t);
            } else {
              if (this.field_t != SetPointDefenceLaserReload.field_p) {
                this.field_a.a(98, this.field_c, this.field_t);
              }
            }
            return;
          }
        }
        if (this.field_c == GetDebrisSurvives.field_p &&
          this.field_t == SetPointDefenceLaserReload.field_p) {
          return;
        }
        this.field_a.a(98, this.field_c, this.field_t);
    }

    vfa(nka param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final static void a(boolean param0, int param1) {
        if (!SetReloadBarWidth.f((byte) -91)) {
          return;
        }
        if (param0) {
          dma.e(0, 0, dma.field_g, dma.field_j, 0, 192);
        }
        if (param1 == 20637) {
          qn.field_h.a(0, 0, 0);
          return;
        }
        field_d = (phb[]) null;
        qn.field_h.a(0, 0, 0);
    }

    private vfa(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, nka param8) {
        try {
          this.field_j = 0.0f;
          this.field_a = param8;
          this.field_c = param4;
          this.field_b = false;
          this.field_l = param1;
          this.field_m = param7;
          this.field_i = param6;
          this.field_e = 480;
          this.field_t = param5;
          this.field_g = param0;
          this.field_o = param2;
          this.field_n = param3;
          this.field_q = 640;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vfa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 == -29674) {
          this.field_a.a(114, this.field_s, this.field_r);
          return;
        }
        this.field_e = -17;
        this.field_a.a(114, this.field_s, this.field_r);
    }

    static {
        field_p = new IntrusiveDeque();
    }
}
