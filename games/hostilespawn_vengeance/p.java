/*
 * Decompiled by CFR-JS 0.4.0.
 */
class p {
    oc field_j;
    static String[] field_g;
    static java.applet.Applet field_a;
    static bd field_d;
    static ic[] field_m;
    static String[] field_k;
    og field_l;
    boolean field_b;
    boolean field_f;
    int field_h;
    int field_i;
    double field_c;
    int field_e;
    boolean field_n;

    final void a(int param0) {
        if (param0 != 8573) {
          return;
        }
        if (0.0 > this.field_l.field_f) {
          this.field_j.field_e = this.field_j.field_e - 1;
          this.field_l.field_f = this.field_l.field_f + 1.0;
          if (this.field_l.field_f > 1.0) {
            this.field_j.field_e = this.field_j.field_e + 1;
            this.field_l.field_f = this.field_l.field_f - 1.0;
          }
          if (this.field_l.field_a < 0.0) {
            this.field_l.field_a = this.field_l.field_a + 1.0;
            this.field_j.field_g = this.field_j.field_g - 1;
            if (this.field_l.field_a > 1.0) {
              this.field_l.field_a = this.field_l.field_a - 1.0;
              this.field_j.field_g = this.field_j.field_g + 1;
            }
            return;
          }
          if (this.field_l.field_a > 1.0) {
            this.field_l.field_a = this.field_l.field_a - 1.0;
            this.field_j.field_g = this.field_j.field_g + 1;
          }
          return;
        }
        if (this.field_l.field_f > 1.0) {
          this.field_j.field_e = this.field_j.field_e + 1;
          this.field_l.field_f = this.field_l.field_f - 1.0;
        }
        if (!(this.field_l.field_a < 0.0)) {
          if (this.field_l.field_a > 1.0) {
            this.field_l.field_a = this.field_l.field_a - 1.0;
            this.field_j.field_g = this.field_j.field_g + 1;
          }
          return;
        }
        this.field_l.field_a = this.field_l.field_a + 1.0;
        this.field_j.field_g = this.field_j.field_g - 1;
        if (this.field_l.field_a > 1.0) {
          this.field_l.field_a = this.field_l.field_a - 1.0;
          this.field_j.field_g = this.field_j.field_g + 1;
        }
    }

    final boolean[] a(int param0, int param1, id param2) {
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        boolean[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_i != param1) {
            if (!this.field_b) {
              var4 = this.field_l.a(param0, this.field_c, this.field_j, false, param2);
            } else {
              var4 = this.field_l.a(this.field_j, this.field_c, 1, param0, param2);
            }
          } else {
            var4 = this.field_l.a(this.field_c, this.field_j, param0, param2, (byte) -71);
          }
          this.b((byte) 117);
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("p.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (param0 != 54) {
          id var3 = (id) null;
          this.a(-16, -122, (id) null);
          return false;
        }
        return false;
    }

    public static void d(int param0) {
        field_a = null;
        field_g = null;
        field_m = null;
        field_k = null;
        field_d = null;
        if (param0 != -4676) {
          field_a = (java.applet.Applet) null;
        }
    }

    final boolean a(double param0, double param1, int param2) {
        if (param2 != 29821) {
          return true;
        }
        int var6 = (int)((-param0 + ((double)this.field_j.field_e + this.field_l.field_f)) * 24.0);
        int var7 = (int)((-param1 + ((double)this.field_j.field_g + this.field_l.field_a)) * 24.0);
        if (var6 < -16) {
          return false;
        }
        if (16 < var6) {
          return false;
        }
        if (var7 < -16) {
          return false;
        }
        if (var7 <= 16) {
          return true;
        }
        return false;
    }

    final void b(byte param0) {
        if (this.field_l.field_f < 0.0) {
          this.field_j.field_e = this.field_j.field_e - 1;
          this.field_l.field_f = this.field_l.field_f + 1.0;
        }
        if (param0 == 117) {
          if (this.field_l.field_f > 1.0) {
            this.field_j.field_e = this.field_j.field_e + 1;
            this.field_l.field_f = this.field_l.field_f - 1.0;
          }
          if (this.field_l.field_a < 0.0) {
            this.field_l.field_a = this.field_l.field_a + 1.0;
            this.field_j.field_g = this.field_j.field_g - 1;
          }
          if (this.field_l.field_a > 1.0) {
            this.field_l.field_a = this.field_l.field_a - 1.0;
            this.field_j.field_g = this.field_j.field_g + 1;
          }
          return;
        }
        field_k = (String[]) null;
        if (this.field_l.field_f > 1.0) {
          this.field_j.field_e = this.field_j.field_e + 1;
          this.field_l.field_f = this.field_l.field_f - 1.0;
        }
        if (this.field_l.field_a < 0.0) {
          this.field_l.field_a = this.field_l.field_a + 1.0;
          this.field_j.field_g = this.field_j.field_g - 1;
        }
        if (this.field_l.field_a > 1.0) {
          this.field_l.field_a = this.field_l.field_a - 1.0;
          this.field_j.field_g = this.field_j.field_g + 1;
        }
    }

    void a(int param0, double param1, int param2) {
        double var5;
        int var7;
        var7 = HostileSpawn.field_I ? 1 : 0;
        if (!(param1 < 0.0)) {
          if (param1 >= 256.0) {
            param1 = param1 - 256.0;
          }
        } else {
          param1 = param1 + 256.0;
        }
        if (param0 != 225) {
          return;
        }
        var5 = param1 - this.field_c;
        boolean decompiledFrameRemainder0 = true;
        if (!(var5 >= 128.0)) {
          if (!(-128.0 > var5)) {
            if (!(var5 <= (double)param2)) {
              if (!(var5 < 0.0)) {
                this.field_c = this.field_c + (double)param2;
              } else {
                this.field_c = this.field_c - (double)param2;
              }
              if (256.0 <= this.field_c) {
                this.field_c = this.field_c - 256.0;
              } else {
                if (0.0 > this.field_c) {
                  this.field_c = this.field_c + 256.0;
                }
              }
              return;
            }
            if (var5 >= (double)(-param2)) {
              this.field_c = param1;
            } else {
              if (!(var5 < 0.0)) {
                this.field_c = this.field_c + (double)param2;
              } else {
                this.field_c = this.field_c - (double)param2;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var5 = var5 + 256.0;
          }
        } else {
          var5 = var5 - 256.0;
        }
        if (decompiledFrameRemainder0) {
          if (!(var5 <= (double)param2)) {
            if (!(var5 < 0.0)) {
              this.field_c = this.field_c + (double)param2;
            } else {
              this.field_c = this.field_c - (double)param2;
            }
          } else {
            if (var5 >= (double)(-param2)) {
              this.field_c = param1;
            } else {
              if (!(var5 < 0.0)) {
                this.field_c = this.field_c + (double)param2;
              } else {
                this.field_c = this.field_c - (double)param2;
              }
            }
          }
        }
        if (256.0 <= this.field_c) {
          this.field_c = this.field_c - 256.0;
          return;
        }
        if (!(0.0 > this.field_c)) {
          return;
        }
        this.field_c = this.field_c + 256.0;
        return;
    }

    final boolean b(int param0) {
        if (param0 == 6) {
          return 6 == this.field_i ? true : false;
        }
        this.a((byte) 27);
        return 6 == this.field_i ? true : false;
    }

    final int c(int param0) {
        if (this.field_i == 36) {
          return 0;
        }
        if (this.field_i == 37) {
          return 0;
        }
        if (this.field_i == 41) {
          return 0;
        }
        if (this.field_i == 91) {
          return 0;
        }
        if (198 > this.field_i) {
          if (223 == this.field_i) {
            return 0;
          }
          if (this.field_i == 252) {
            return 0;
          }
          if (this.field_i == 35) {
            return 0;
          }
          if (this.field_i >= 283 &&
            this.field_i < 308) {
            return 0;
          }
          if (this.field_i == 150) {
            return 0;
          }
          if (this.field_i >= 323 &&
            331 >= this.field_i) {
            return 0;
          }
          if (param0 != 0) {
            return -50;
          }
          if (335 > this.field_i) {
            return 1;
          }
          if (338 >= this.field_i) {
            return 0;
          }
          return 1;
        }
        if (this.field_i <= 202) {
          return 0;
        }
        if (223 == this.field_i) {
          return 0;
        }
        if (this.field_i == 252) {
          return 0;
        }
        if (this.field_i == 35) {
          return 0;
        }
        if (this.field_i >= 283 &&
          this.field_i < 308) {
          return 0;
        }
        if (this.field_i == 150) {
          return 0;
        }
        if (this.field_i >= 323 &&
          331 >= this.field_i) {
          return 0;
        }
        if (param0 != 0) {
          return -50;
        }
        if (335 > this.field_i) {
          return 1;
        }
        if (338 < this.field_i) {
          return 1;
        }
        return 0;
    }

    p() {
        this.field_j = new oc();
        this.field_l = new og();
        this.field_h = 0;
        this.field_i = 0;
        this.field_e = 0;
        this.field_c = 0.0;
    }

    static {
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_m = new ic[2];
    }
}
