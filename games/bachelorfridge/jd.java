/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    boolean field_b;
    private int field_h;
    private int field_f;
    private int field_a;
    static String[] field_d;
    private boolean field_c;
    int field_g;
    private int field_i;
    int field_e;

    final boolean b(byte param0) {
        if (param0 == -73) {
          return 97 == this.field_h ? true : false;
        }
        this.a(false, -83, -3, 33);
        return 97 == this.field_h ? true : false;
    }

    final static void a(boolean param0, byte param1) {
        if (lfa.field_q <= 0) {
          if (ld.field_p > 0) {
            if (w.field_e) {
              dg.g(0, 0, dg.field_i, i.field_a.field_M);
              qw.field_b.a(param0, 7802);
            }
            if (param1 < 67) {
              field_d = (String[]) null;
            }
            return;
          }
          if (dja.field_m <= 0) {
            if (param1 < 67) {
              field_d = (String[]) null;
            }
            return;
          }
          if (w.field_e) {
            dg.g(0, 0, dg.field_i, i.field_a.field_M);
            qw.field_b.a(param0, 7802);
          }
        } else {
          if (!eda.field_j) {
            if (ld.field_p > 0) {
              if (w.field_e) {
                dg.g(0, 0, dg.field_i, i.field_a.field_M);
                qw.field_b.a(param0, 7802);
              }
            } else {
              if (dja.field_m > 0 &&
                w.field_e) {
                dg.g(0, 0, dg.field_i, i.field_a.field_M);
                qw.field_b.a(param0, 7802);
              }
            }
          } else {
            dg.g(0, 0, dg.field_i, i.field_a.field_M);
            sb.field_n.a(param0, 7802);
            if (ld.field_p > 0) {
              if (w.field_e) {
                dg.g(0, 0, dg.field_i, i.field_a.field_M);
                qw.field_b.a(param0, 7802);
              }
            } else {
              if (dja.field_m > 0) {
                if (w.field_e) {
                  dg.g(0, 0, dg.field_i, i.field_a.field_M);
                  qw.field_b.a(param0, 7802);
                }
                if (param1 < 67) {
                  field_d = (String[]) null;
                }
                return;
              }
            }
          }
        }
        if (param1 >= 67) {
          return;
        }
        field_d = (String[]) null;
    }

    final void b(int param0, int param1) {
        if (this.field_f == 0) {
          this.field_g = param1;
          this.field_c = false;
          this.field_b = true;
          if (param0 <= 84) {
            this.field_i = -59;
            return;
          }
          return;
        }
        if (param0 > 84) {
          return;
        }
        this.field_i = -59;
    }

    final boolean b(int param0) {
        if (param0 == 0) {
          return 0 != this.field_f ? true : false;
        }
        this.c(-72);
        return 0 != this.field_f ? true : false;
    }

    final void a(int param0, int param1) {
        this.field_b = false;
        this.field_h = 0;
        this.field_a = 0;
        if (0 == this.field_f) {
          if (96 != gf.field_k) {
            if (this.field_f == 0) {
              this.field_h = gf.field_k;
            }
            if (this.field_f != 0) {
              if (this.field_f == 0 && (gf.field_k == 98 ||
                gf.field_k == 99)) {
                this.field_b = true;
                if (this.field_g >= 0) {
                  this.field_c = false;
                } else {
                  this.field_g = param0;
                  this.field_c = false;
                }
              }
            } else {
              if (gf.field_k == 97) {
                this.field_g = this.field_g + 1;
                if (this.field_g >= this.field_e) {
                  this.field_g = 0;
                }
                this.field_b = true;
                this.field_c = false;
              }
              if (this.field_f == 0 &&
                (gf.field_k == 98 ||
                gf.field_k == 99)) {
                this.field_b = true;
                if (this.field_g >= 0) {
                  this.field_c = false;
                } else {
                  this.field_g = param0;
                  this.field_c = false;
                }
              }
            }
            if (param1 >= -116) {
              this.a(true, -61, 69, -124);
            }
            return;
          }
          if (0 >= this.field_g) {
            this.field_g = this.field_e;
          }
          this.field_c = false;
          this.field_b = true;
          this.field_g = this.field_g - 1;
        }
        if (this.field_f == 0) {
          this.field_h = gf.field_k;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_f == 0) {
          if ((gf.field_k != 97) &&
            (decompiledFrameRemainder0 = (this.field_f == 0)) &&
            (decompiledFrameRemainder0 = (gf.field_k == 98 ||
            gf.field_k == 99))) {
            this.field_b = true;
            if (this.field_g < 0) {
              this.field_g = param0;
            }
            this.field_c = false;
            if (param1 >= -116) {
              this.a(true, -61, 69, -124);
            }
            return;
          }
          if (decompiledFrameRemainder0) {
            this.field_g = this.field_g + 1;
            if (this.field_g >= this.field_e) {
              this.field_g = 0;
            }
            this.field_b = true;
            this.field_c = false;
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_f == 0 &&
          (gf.field_k == 98 ||
          gf.field_k == 99))) {
          this.field_b = true;
          if (this.field_g < 0) {
            this.field_g = param0;
          }
          this.field_c = false;
        }
        if (param1 < -116) {
          return;
        }
        this.a(true, -61, 69, -124);
    }

    final boolean d(int param0) {
        if (param0 == -9907) {
          return 102 == this.field_h ? true : false;
        }
        this.field_b = false;
        return 102 == this.field_h ? true : false;
    }

    public static void a(byte param0) {
        if (param0 != 89) {
          return;
        }
        field_d = null;
    }

    final void a(boolean param0) {
        this.field_b = false;
        this.field_a = 0;
        if (param0) {
          this.field_h = 0;
          if (this.field_f == 0) {
            this.field_h = gf.field_k;
          }
          return;
        }
        this.field_f = 60;
        this.field_h = 0;
        if (this.field_f == 0) {
          this.field_h = gf.field_k;
        }
    }

    final boolean a(int param0) {
        if (param0 == -1) {
          return this.field_h == 103 ? true : false;
        }
        this.field_a = -17;
        return this.field_h == 103 ? true : false;
    }

    final void b(boolean param0) {
        this.field_a = 0;
        this.field_b = false;
        this.field_h = 0;
        if (0 == this.field_f) {
          this.field_h = gf.field_k;
          if (this.field_f != 0) {
            if (!param0) {
              this.b(true);
            }
          } else {
            if (98 == gf.field_k) {
              if (this.field_g <= 0) {
                this.field_g = this.field_e;
              }
              this.field_c = false;
              this.field_b = true;
              this.field_g = this.field_g - 1;
            }
            if (!param0) {
              this.b(true);
            }
          }
        } else {
          if (this.field_f == 0 &&
            98 == gf.field_k) {
            if (this.field_g <= 0) {
              this.field_g = this.field_e;
            }
            this.field_c = false;
            this.field_b = true;
            this.field_g = this.field_g - 1;
          }
          if (!param0) {
            this.b(true);
          }
        }
        if (0 != this.field_f) {
          return;
        }
        if (gf.field_k != 99) {
          return;
        }
        this.field_g = this.field_g + 1;
        if (this.field_e <= this.field_g) {
          this.field_g = 0;
        }
        this.field_b = true;
        this.field_c = false;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          return true;
        }
        if (this.field_a != 0) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_c = param0 ? true : false;
        if (param1 < 43) {
          return;
        }
        this.field_f = 0;
        if (this.field_c) {
          this.field_g = param2;
          return;
        }
        this.field_g = param3;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_e <= param2) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_e) {
          throw new IllegalArgumentException();
        }
        if (param1 >= -114) {
          return;
        }
        this.field_a = 0;
        this.field_b = false;
        this.field_h = 0;
        if (lf.field_c != 0) {
          this.field_g = param0;
          this.field_c = true;
          this.field_a = lf.field_c;
          this.field_f = lf.field_c;
          this.field_i = nb.field_r;
        }
        if (this.field_f == 0) {
          if (lf.field_c == 0) {
            if (fia.field_t != 0) {
              if (this.field_f == 0) {
                if (!this.field_c &&
                  !dda.field_f) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_c) {
                    this.field_g = -1;
                  }
                } else {
                  if (param2 != this.field_g) {
                    this.field_b = true;
                  }
                  this.field_g = param2;
                  this.field_c = true;
                }
              }
              return;
            }
            this.field_f = 0;
          }
          if (this.field_f != 0) {
            return;
          }
          if (this.field_c) {
            if (param2 < 0) {
              if (!this.field_c) {
                return;
              }
              this.field_g = -1;
              return;
            }
            if (param2 != this.field_g) {
              this.field_b = true;
            }
            this.field_g = param2;
            this.field_c = true;
            return;
          }
          if (!dda.field_f) {
            return;
          }
          if (param2 < 0) {
            if (this.field_c) {
              this.field_g = -1;
            }
          } else {
            if (param2 != this.field_g) {
              this.field_b = true;
            }
            this.field_g = param2;
            this.field_c = true;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (fia.field_t == 0) {
          if (lf.field_c == 0) {
            if (fia.field_t != 0) {
              if (this.field_f == 0) {
                if (!this.field_c &&
                  !dda.field_f) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_c) {
                    this.field_g = -1;
                  }
                } else {
                  if (param2 != this.field_g) {
                    this.field_b = true;
                  }
                  this.field_g = param2;
                  this.field_c = true;
                }
              }
              return;
            }
            this.field_f = 0;
          }
        } else {
          if (this.field_i <= 0) {
            this.field_i = kw.field_f;
          }
          this.field_i = this.field_i - 1;
          if (lf.field_c == 0) {
            if (fia.field_t != 0) {
              if (this.field_f != 0) {
                return;
              }
              decompiledFrameRemainder0 = !(this.field_c);
              if (decompiledFrameRemainder0) {
                if (!dda.field_f) {
                  return;
                }
                if (param2 < 0) {
                  if (this.field_c) {
                    this.field_g = -1;
                  }
                } else {
                  if (param2 != this.field_g) {
                    this.field_b = true;
                  }
                  this.field_g = param2;
                  this.field_c = true;
                }
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              this.field_f = 0;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_f != 0) {
            return;
          }
          if (!this.field_c &&
            !dda.field_f) {
            return;
          }
        }
        if (param2 < 0) {
          if (!this.field_c) {
            return;
          }
          this.field_g = -1;
          return;
        }
        if (param2 != this.field_g) {
          this.field_b = true;
        }
        this.field_g = param2;
        this.field_c = true;
    }

    final boolean c(int param0) {
        int var2 = -34 % ((param0 - 70) / 41);
        return this.field_h == 96 ? true : false;
    }

    jd(int param0) {
        this.field_c = false;
        this.field_g = 0;
        this.field_e = param0;
    }

    static {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
