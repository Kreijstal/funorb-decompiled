/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private int field_a;
    private boolean field_e;
    static int field_d;
    private int field_b;
    static jpa field_j;
    static String field_g;
    int field_i;
    int field_h;
    private int field_f;
    private int field_c;

    final boolean a(int param0) {
        if (param0 == 0) {
          return 102 == this.field_c ? true : false;
        }
        this.a(17, 31, 66);
        return 102 == this.field_c ? true : false;
    }

    final boolean a(byte param0) {
        if (param0 >= -126) {
          return true;
        }
        return this.field_f != 0 ? true : false;
    }

    final boolean e(int param0) {
        int var2 = 104 / ((param0 - 11) / 57);
        return 97 == this.field_c ? true : false;
    }

    final void b(int param0, int param1) {
        int var3 = -96 / ((param1 - 18) / 61);
        if (this.field_f == 0) {
          this.field_h = param0;
          this.field_e = false;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime2Lifetime1;
        if (this.field_i <= param2) {
          throw new IllegalArgumentException();
        }
        if (this.field_i <= param0) {
          throw new IllegalArgumentException();
        }
        this.field_c = 0;
        this.field_b = 0;
        if (hf.field_b != 0) {
          this.field_b = hf.field_b;
          this.field_h = param0;
          this.field_f = hf.field_b;
          this.field_e = true;
          this.field_a = gp.field_m;
          if (this.field_f != 0 &&
            ksa.field_p != 0) {
            if (0 >= this.field_a) {
              this.field_a = aua.field_b;
            }
            this.field_a = this.field_a - 1;
          }
          if (hf.field_b == 0 &&
            0 == ksa.field_p) {
            this.field_f = 0;
          }
          var4 = -69 % ((-29 - param1) / 63);
          if (0 != this.field_f) {
            return;
          }
          if (!this.field_e &&
            !qma.field_c) {
            return;
          }
          if (param2 < 0) {
            if (!this.field_e) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (param2 != this.field_h) {
          }
          this.field_e = true;
          this.field_h = param2;
          return;
        }
        if (this.field_f == 0) {
          if (hf.field_b == 0 &&
            0 == ksa.field_p) {
            this.field_f = 0;
          }
          var4Lifetime1 = -69 % ((-29 - param1) / 63);
          if (0 != this.field_f) {
            return;
          }
          if (!this.field_e &&
            !qma.field_c) {
            return;
          }
          if (param2 < 0) {
            if (!this.field_e) {
              return;
            }
            this.field_h = -1;
            return;
          }
          if (param2 != this.field_h) {
          }
          this.field_e = true;
          this.field_h = param2;
          return;
        }
        if (ksa.field_p == 0) {
          if (hf.field_b == 0) {
            if (0 != ksa.field_p) {
              var4Lifetime2 = -69 % ((-29 - param1) / 63);
              if (0 != this.field_f) {
                return;
              }
              if (!this.field_e &&
                !qma.field_c) {
                return;
              }
              if (param2 < 0) {
                if (!this.field_e) {
                  return;
                }
                this.field_h = -1;
                return;
              }
              if (param2 != this.field_h) {
              }
              this.field_e = true;
              this.field_h = param2;
              return;
            }
            this.field_f = 0;
          }
          var4Lifetime2Lifetime1 = -69 % ((-29 - param1) / 63);
          if (0 != this.field_f) {
            return;
          }
          if (this.field_e) {
            if (param2 >= 0) {
              if (param2 != this.field_h) {
              }
              this.field_e = true;
              this.field_h = param2;
              return;
            }
            if (this.field_e) {
              this.field_h = -1;
              return;
            }
          } else {
            if (qma.field_c) {
              if (param2 < 0) {
                if (!this.field_e) {
                  return;
                }
                this.field_h = -1;
                return;
              }
              if (param2 != this.field_h) {
              }
              this.field_e = true;
              this.field_h = param2;
              return;
            }
          }
          return;
        }
        if (0 < this.field_a) {
          this.field_a = this.field_a - 1;
          if (hf.field_b == 0 &&
            0 == ksa.field_p) {
            this.field_f = 0;
          }
          var4Lifetime3 = -69 % ((-29 - param1) / 63);
          if (0 == this.field_f) {
            if (!this.field_e &&
              !qma.field_c) {
              return;
            }
            if (param2 >= 0) {
              if (param2 != this.field_h) {
                this.field_e = true;
                this.field_h = param2;
                return;
              }
              this.field_e = true;
              this.field_h = param2;
              return;
            }
            if (this.field_e) {
              this.field_h = -1;
            }
          }
          return;
        }
        this.field_a = aua.field_b;
        this.field_a = this.field_a - 1;
        if (hf.field_b == 0) {
          if (0 != ksa.field_p) {
            var4Lifetime4 = -69 % ((-29 - param1) / 63);
            if (0 == this.field_f) {
              if (!this.field_e &&
                !qma.field_c) {
                return;
              }
              if (param2 >= 0) {
                if (param2 != this.field_h) {
                  this.field_e = true;
                  this.field_h = param2;
                  return;
                }
                this.field_e = true;
                this.field_h = param2;
                return;
              }
              if (this.field_e) {
                this.field_h = -1;
              }
            }
            return;
          }
          this.field_f = 0;
        }
        var4Lifetime5 = -69 % ((-29 - param1) / 63);
        if (0 == this.field_f) {
          if (this.field_e) {
            if (param2 >= 0) {
              if (param2 != this.field_h) {
              }
              this.field_e = true;
              this.field_h = param2;
              return;
            }
            if (this.field_e) {
              this.field_h = -1;
              return;
            }
          } else {
            if (qma.field_c) {
              if (param2 < 0) {
                if (this.field_e) {
                  this.field_h = -1;
                }
              } else {
                if (param2 != this.field_h) {
                }
                this.field_e = true;
                this.field_h = param2;
              }
              return;
            }
          }
        }
    }

    final boolean d(int param0) {
        if (param0 == 96) {
          return this.field_c == 96 ? true : false;
        }
        this.field_e = false;
        return this.field_c == 96 ? true : false;
    }

    final boolean f(int param0) {
        int var2 = -76 / ((-64 - param0) / 54);
        return this.field_c == 103 ? true : false;
    }

    final void b(byte param0) {
        this.field_b = 0;
        this.field_c = 0;
        if (0 == this.field_f) {
          this.field_c = fna.field_h;
        }
        if (param0 == -50) {
          return;
        }
        ko.b(29);
    }

    public static void b(int param0) {
        if (param0 != -100) {
          field_d = 50;
          field_g = null;
          field_j = null;
          return;
        }
        field_g = null;
        field_j = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_e = param0 ? true : false;
        this.field_f = 0;
        if (this.field_e) {
          this.field_h = param3;
          if (param1 != 29954) {
            this.field_c = 83;
            return;
          }
          return;
        }
        this.field_h = param2;
        if (param1 != 29954) {
          this.field_c = 83;
          return;
        }
    }

    final static void c(byte param0) {
        afa.field_c = qk.h(122);
        wu.field_a = new jta();
        if (param0 < 10) {
          ko.c((byte) -39);
          kea.b(-114);
          return;
        }
        kea.b(-114);
    }

    final void c(int param0) {
        this.field_b = 0;
        this.field_c = 0;
        if (this.field_f == 0) {
          this.field_c = fna.field_h;
        }
        if (param0 <= 3) {
          this.a(-50, 52);
        }
        if (this.field_f == 0 &&
          fna.field_h == 98) {
          if (0 >= this.field_h) {
            this.field_h = this.field_i;
          }
          this.field_h = this.field_h - 1;
          this.field_e = false;
        }
        if (0 == this.field_f &&
          fna.field_h == 99) {
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_i) {
            this.field_h = 0;
          }
          this.field_e = false;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.e(-107);
          if (this.field_b != 0) {
            return true;
          }
          if (this.field_c != 84) {
            return this.field_c == 83 ? true : false;
          }
          return true;
        }
        if (this.field_b != 0) {
          return true;
        }
        if (this.field_c == 84) {
          return true;
        }
        if (this.field_c != 83) {
          return false;
        }
        return true;
    }

    ko(int param0) {
        this.field_h = 0;
        this.field_e = false;
        this.field_i = param0;
    }

    final void a(int param0, int param1) {
        int var3;
        this.field_b = 0;
        var3 = 77 / ((param1 + 33) / 39);
        this.field_c = 0;
        if (this.field_f == 0) {
          this.field_c = fna.field_h;
        }
        if (this.field_f == 0 &&
          fna.field_h == 96) {
          if (this.field_h <= 0) {
            this.field_h = this.field_i;
          }
          this.field_e = false;
          this.field_h = this.field_h - 1;
        }
        if (0 == this.field_f &&
          fna.field_h == 97) {
          this.field_h = this.field_h + 1;
          this.field_e = false;
          if (this.field_h >= this.field_i) {
            this.field_h = 0;
          }
        }
        if (this.field_f != 0) {
          return;
        }
        if (fna.field_h != 98 &&
          fna.field_h != 99) {
          return;
        }
        if (this.field_h < 0) {
          this.field_h = param0;
        }
        this.field_e = false;
    }

    static {
        field_g = "Checking";
    }
}
