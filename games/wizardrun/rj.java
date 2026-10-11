/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int field_c;
    int field_g;
    private boolean field_d;
    private int field_e;
    static String[] field_f;
    private int field_b;
    private int field_a;
    private int field_h;

    final void a(int param0, int param1, boolean param2, int param3) {
        if (param0 != -12785) {
          return;
        }
        this.field_d = param2 ? true : false;
        this.field_h = 0;
        if (this.field_d) {
          this.field_g = param1;
          return;
        }
        this.field_g = param3;
    }

    public static void c(int param0) {
        if (param0 < 20) {
          return;
        }
        field_f = null;
    }

    final static void a(String param0, String param1, boolean param2) {
        try {
          if (null != aa.field_lb) {
            aa.field_lb.l(-27697);
          }
          r.field_b = new qc(param1, param0, false, true, param2);
          td.field_f.c(r.field_b, -111);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "rj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var4Lifetime1;
        if (param0 >= this.field_c) {
          throw new IllegalArgumentException();
        }
        if (this.field_c <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_e = 0;
        this.field_b = 0;
        if (w.field_c == 0) {
          var4 = -3 % ((-4 - param1) / 32);
          if (this.field_h != 0 &&
            sh.field_c != 0) {
            if (0 >= this.field_a) {
              this.field_a = vc.field_G;
            }
            this.field_a = this.field_a - 1;
          }
          if (w.field_c == 0 &&
            sh.field_c == 0) {
            this.field_h = 0;
          }
          if (this.field_h != 0) {
            return;
          }
          if (!this.field_d &&
            !ih.field_a) {
            return;
          }
          if (param0 < 0) {
            if (!this.field_d) {
              return;
            }
            this.field_g = -1;
            return;
          }
          if (this.field_g != param0) {
          }
          this.field_g = param0;
          this.field_d = true;
          return;
        }
        this.field_b = w.field_c;
        this.field_a = hb.field_m;
        this.field_d = true;
        this.field_h = w.field_c;
        this.field_g = param2;
        var4Lifetime1 = -3 % ((-4 - param1) / 32);
        if (this.field_h == 0) {
          if (w.field_c == 0 &&
            sh.field_c == 0) {
            this.field_h = 0;
          }
          if (this.field_h != 0) {
            return;
          }
          if (!this.field_d &&
            !ih.field_a) {
            return;
          }
          if (param0 >= 0) {
            if (this.field_g != param0) {
              this.field_g = param0;
              this.field_d = true;
              return;
            }
            this.field_g = param0;
            this.field_d = true;
            return;
          }
          if (this.field_d) {
            this.field_g = -1;
          }
          return;
        }
        if (sh.field_c == 0) {
          if (w.field_c == 0 &&
            sh.field_c == 0) {
            this.field_h = 0;
          }
          if (this.field_h != 0) {
            return;
          }
          if (!this.field_d &&
            !ih.field_a) {
            return;
          }
          if (param0 >= 0) {
            if (this.field_g != param0) {
              this.field_g = param0;
              this.field_d = true;
              return;
            }
            this.field_g = param0;
            this.field_d = true;
            return;
          }
          if (this.field_d) {
            this.field_g = -1;
          }
          return;
        }
        if (0 >= this.field_a) {
          this.field_a = vc.field_G;
        }
        this.field_a = this.field_a - 1;
        if (w.field_c == 0 &&
          sh.field_c == 0) {
          this.field_h = 0;
        }
        if (this.field_h != 0) {
          return;
        }
        if (!this.field_d &&
          !ih.field_a) {
          return;
        }
        if (param0 < 0) {
          if (!this.field_d) {
            return;
          }
          this.field_g = -1;
          return;
        }
        if (this.field_g != param0) {
        }
        this.field_g = param0;
        this.field_d = true;
    }

    final boolean b(int param0) {
        if (param0 != -1) {
          this.a((byte) -122, 31);
          if (this.field_b != 0) {
            return true;
          }
          if (84 != this.field_e) {
            return this.field_e == 83 ? true : false;
          }
          return true;
        }
        if (this.field_b != 0) {
          return true;
        }
        if (84 == this.field_e) {
          return true;
        }
        if (this.field_e != 83) {
          return false;
        }
        return true;
    }

    final void a(int param0) {
        String var3;
        this.field_e = 0;
        this.field_b = 0;
        if (0 == this.field_h) {
          this.field_e = vk.field_r;
        }
        if (param0 <= 12) {
          var3 = (String) null;
          rj.a((String) null, (String) null, true);
          if (0 != this.field_h) {
            if (this.field_h == 0 &&
              vk.field_r == 99) {
              this.field_g = this.field_g + 1;
              this.field_d = false;
              if (this.field_c <= this.field_g) {
                this.field_g = 0;
              }
            }
            return;
          }
          if (vk.field_r != 98) {
            if (this.field_h == 0 &&
              vk.field_r == 99) {
              this.field_g = this.field_g + 1;
              this.field_d = false;
              if (this.field_c <= this.field_g) {
                this.field_g = 0;
              }
            }
            return;
          }
          if (this.field_g <= 0) {
            this.field_g = this.field_c;
          }
          this.field_d = false;
          this.field_g = this.field_g - 1;
          if (this.field_h != 0) {
            return;
          }
          if (vk.field_r != 99) {
            return;
          }
          this.field_g = this.field_g + 1;
          this.field_d = false;
          if (this.field_c > this.field_g) {
            return;
          }
          this.field_g = 0;
          return;
        }
        if (0 == this.field_h &&
          vk.field_r == 98) {
          if (this.field_g <= 0) {
            this.field_g = this.field_c;
          }
          this.field_d = false;
          this.field_g = this.field_g - 1;
        }
        if (this.field_h != 0) {
          return;
        }
        if (vk.field_r != 99) {
          return;
        }
        this.field_g = this.field_g + 1;
        this.field_d = false;
        if (this.field_c > this.field_g) {
          return;
        }
        this.field_g = 0;
    }

    final void a(byte param0, int param1) {
        int var3;
        int var3Lifetime1;
        this.field_e = 0;
        this.field_b = 0;
        if (0 == this.field_h &&
          vk.field_r == 96) {
          if (this.field_g > 0) {
            this.field_d = false;
            this.field_g = this.field_g - 1;
            if (this.field_h == 0) {
              this.field_e = vk.field_r;
            }
            var3 = -13 % ((param0 - 62) / 33);
            if (this.field_h == 0 &&
              vk.field_r == 97) {
              this.field_g = this.field_g + 1;
              this.field_d = false;
              if (this.field_c <= this.field_g) {
                this.field_g = 0;
              }
            }
            if (this.field_h != 0) {
              return;
            }
            if (vk.field_r != 98 &&
              vk.field_r != 99) {
              return;
            }
            if (this.field_g < 0) {
              this.field_g = param1;
            }
            this.field_d = false;
            return;
          }
          this.field_g = this.field_c;
          this.field_d = false;
          this.field_g = this.field_g - 1;
        }
        if (this.field_h == 0) {
          this.field_e = vk.field_r;
        }
        var3Lifetime1 = -13 % ((param0 - 62) / 33);
        if (this.field_h == 0 &&
          vk.field_r == 97) {
          this.field_g = this.field_g + 1;
          this.field_d = false;
          if (this.field_c <= this.field_g) {
            this.field_g = 0;
          }
        }
        if (this.field_h != 0) {
          return;
        }
        if (vk.field_r != 98 &&
          vk.field_r != 99) {
          return;
        }
        if (this.field_g < 0) {
          this.field_g = param1;
        }
        this.field_d = false;
    }

    rj(int param0) {
        this.field_g = 0;
        this.field_d = false;
        this.field_c = param0;
    }

    static {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
