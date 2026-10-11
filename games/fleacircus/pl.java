/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_h;
    static int[] field_l;
    int field_k;
    private int field_j;
    static boolean field_c;
    private int field_b;
    private boolean field_d;
    static int field_g;
    static dd field_e;
    static int field_f;
    private int field_a;
    static String field_i;
    int field_m;

    final void a(int param0, boolean param1) {
        this.field_b = 0;
        this.field_j = 0;
        if (0 != this.field_a) {
          if (!param1) {
            this.a(-102, (byte) 70);
            if (this.field_a == 0 &&
              ji.field_a == 96) {
              if (this.field_k <= 0) {
                this.field_k = this.field_m;
              }
              this.field_d = false;
              this.field_k = this.field_k - 1;
            }
            if (this.field_a == 0 &&
              97 == ji.field_a) {
              this.field_k = this.field_k + 1;
              if (this.field_m <= this.field_k) {
                this.field_k = 0;
              }
              this.field_d = false;
            }
            if (0 == this.field_a) {
              if (ji.field_a != 98 &&
                ji.field_a != 99) {
                return;
              }
              this.field_d = false;
              if (this.field_k < 0) {
                this.field_k = param0;
              }
            }
            return;
          }
          if (this.field_a == 0) {
            if (ji.field_a != 96) {
              if (this.field_a == 0 &&
                97 == ji.field_a) {
                this.field_k = this.field_k + 1;
                if (this.field_m <= this.field_k) {
                  this.field_k = 0;
                }
                this.field_d = false;
              }
              if (0 == this.field_a) {
                if (ji.field_a != 98 &&
                  ji.field_a != 99) {
                  return;
                }
                this.field_d = false;
                if (this.field_k < 0) {
                  this.field_k = param0;
                }
              }
              return;
            }
            if (this.field_k <= 0) {
              this.field_k = this.field_m;
            }
            this.field_d = false;
            this.field_k = this.field_k - 1;
          }
          if (this.field_a == 0 &&
            97 == ji.field_a) {
            this.field_k = this.field_k + 1;
            if (this.field_m > this.field_k) {
              this.field_d = false;
              if (0 == this.field_a) {
                if (ji.field_a != 98 &&
                  ji.field_a != 99) {
                  return;
                }
                this.field_d = false;
                if (this.field_k < 0) {
                  this.field_k = param0;
                }
              }
              return;
            }
            this.field_k = 0;
            this.field_d = false;
            if (0 == this.field_a) {
              if (ji.field_a != 98 &&
                ji.field_a != 99) {
                return;
              }
              this.field_d = false;
              if (this.field_k < 0) {
                this.field_k = param0;
              }
            }
            return;
          }
        } else {
          this.field_j = ji.field_a;
          if (!param1) {
            this.a(-102, (byte) 70);
            if (this.field_a != 0) {
              if (this.field_a == 0 &&
                97 == ji.field_a) {
                this.field_k = this.field_k + 1;
                if (this.field_m <= this.field_k) {
                  this.field_k = 0;
                }
                this.field_d = false;
              }
              if (0 == this.field_a) {
                if (ji.field_a != 98 &&
                  ji.field_a != 99) {
                  return;
                }
                this.field_d = false;
                if (this.field_k < 0) {
                  this.field_k = param0;
                }
              }
              return;
            }
            if (ji.field_a == 96) {
              if (this.field_k <= 0) {
                this.field_k = this.field_m;
              }
              this.field_d = false;
              this.field_k = this.field_k - 1;
            }
            if (this.field_a == 0 &&
              97 == ji.field_a) {
              this.field_k = this.field_k + 1;
              if (this.field_m <= this.field_k) {
                this.field_k = 0;
              }
              this.field_d = false;
            }
            if (0 == this.field_a) {
              if (ji.field_a != 98 &&
                ji.field_a != 99) {
                return;
              }
              this.field_d = false;
              if (this.field_k < 0) {
                this.field_k = param0;
              }
            }
            return;
          }
          if (this.field_a == 0) {
            if (ji.field_a != 96) {
              if (this.field_a == 0 &&
                97 == ji.field_a) {
                this.field_k = this.field_k + 1;
                if (this.field_m <= this.field_k) {
                  this.field_k = 0;
                }
                this.field_d = false;
              }
              if (0 != this.field_a) {
                return;
              }
              if (ji.field_a != 98 &&
                ji.field_a != 99) {
                return;
              }
              this.field_d = false;
              if (this.field_k >= 0) {
                return;
              }
              this.field_k = param0;
              return;
            }
            if (this.field_k <= 0) {
              this.field_k = this.field_m;
            }
            this.field_d = false;
            this.field_k = this.field_k - 1;
          }
          if (this.field_a == 0 &&
            97 == ji.field_a) {
            this.field_k = this.field_k + 1;
            if (this.field_m <= this.field_k) {
              this.field_k = 0;
            }
            this.field_d = false;
            if (0 != this.field_a) {
              return;
            }
            if (ji.field_a != 98 &&
              ji.field_a != 99) {
              return;
            }
            this.field_d = false;
            if (this.field_k >= 0) {
              return;
            }
            this.field_k = param0;
            return;
          }
        }
        if (0 != this.field_a) {
          return;
        }
        if (ji.field_a != 98 &&
          ji.field_a != 99) {
          return;
        }
        this.field_d = false;
        if (this.field_k >= 0) {
          return;
        }
        this.field_k = param0;
    }

    final void b(int param0, int param1, int param2) {
        if (this.field_m <= param2) {
          throw new IllegalArgumentException();
        }
        if (this.field_m <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_j = 0;
        this.field_b = 0;
        if (jk.field_r == 0) {
          if (this.field_a != 0 &&
            kc.field_f != 0) {
            if (this.field_h <= 0) {
              this.field_h = qa.field_k;
            }
            this.field_h = this.field_h - 1;
          }
          if (jk.field_r == 0) {
            if (0 != kc.field_f) {
              if (this.field_a == 0 && (this.field_d ||
                field_c)) {
                if (0 > param2) {
                  if (this.field_d) {
                    this.field_k = -1;
                  }
                } else {
                  if (param2 != this.field_k) {
                    this.field_d = true;
                    this.field_k = param2;
                  } else {
                    this.field_d = true;
                    this.field_k = param2;
                  }
                }
              }
              if (param0 < 55) {
                this.h(94);
              }
              return;
            }
            this.field_a = 0;
          }
          if (this.field_a == 0) {
            if (!this.field_d &&
              !field_c) {
              if (param0 < 55) {
                this.h(94);
              }
              return;
            }
            if (0 <= param2) {
              if (param2 != this.field_k) {
              }
              this.field_d = true;
              this.field_k = param2;
              if (param0 < 55) {
                this.h(94);
              }
              return;
            }
            if (!this.field_d) {
              if (param0 < 55) {
                this.h(94);
              }
              return;
            }
            this.field_k = -1;
          }
        } else {
          this.field_h = kb.field_p;
          this.field_a = jk.field_r;
          this.field_b = jk.field_r;
          this.field_k = param1;
          this.field_d = true;
          if (this.field_a == 0) {
            boolean decompiledFrameRemainder2 = true;
            if (jk.field_r == 0) {
              if (0 != kc.field_f) {
                if (this.field_a == 0 && (this.field_d ||
                  field_c)) {
                  if (0 > param2) {
                    if (this.field_d) {
                      this.field_k = -1;
                    }
                  } else {
                    if (param2 != this.field_k) {
                      this.field_d = true;
                      this.field_k = param2;
                    } else {
                      this.field_d = true;
                      this.field_k = param2;
                    }
                  }
                }
                decompiledFrameRemainder2 = false;
              }
              else {
                this.field_a = 0;
              }
            }
            if (decompiledFrameRemainder2) {
              if (this.field_a != 0) {
                if (param0 >= 55) {
                  return;
                }
                this.h(94);
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              if (this.field_d) {
                if (0 <= param2) {
                  if (param2 != this.field_k) {
                  }
                  this.field_d = true;
                  this.field_k = param2;
                  decompiledFrameRemainder1 = false;
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (this.field_d))) {
                  this.field_k = -1;
                  if (param0 >= 55) {
                    return;
                  }
                  this.h(94);
                  return;
                }
              }
              if (decompiledFrameRemainder1) {
                boolean decompiledFrameRemainder0 = true;
                if (field_c) {
                  if ((0 > param2) &&
                    (decompiledFrameRemainder0 = (this.field_d))) {
                    this.field_k = -1;
                    if (param0 >= 55) {
                      return;
                    }
                    this.h(94);
                    return;
                  }
                  if (decompiledFrameRemainder0) {
                    if (param2 != this.field_k) {
                    }
                    this.field_d = true;
                    this.field_k = param2;
                  }
                }
              }
            }
            if (param0 < 55) {
              this.h(94);
            }
            return;
          }
          if (kc.field_f != 0) {
            if (this.field_h <= 0) {
              this.field_h = qa.field_k;
            }
            this.field_h = this.field_h - 1;
          }
          if (jk.field_r == 0) {
            if (0 != kc.field_f) {
              if (this.field_a == 0 && (this.field_d ||
                field_c)) {
                if (0 > param2) {
                  if (!this.field_d) {
                    if (param0 < 55) {
                      this.h(94);
                    }
                    return;
                  }
                  this.field_k = -1;
                } else {
                  if (param2 != this.field_k) {
                    this.field_d = true;
                    this.field_k = param2;
                  } else {
                    this.field_d = true;
                    this.field_k = param2;
                  }
                }
              }
              if (param0 >= 55) {
                return;
              }
              this.h(94);
              return;
            }
            this.field_a = 0;
          }
          if (this.field_a == 0) {
            if (this.field_d) {
              if (0 > param2) {
                if (this.field_d) {
                  this.field_k = -1;
                }
              } else {
                if (param2 != this.field_k) {
                }
                this.field_d = true;
                this.field_k = param2;
              }
            } else {
              if (field_c) {
                if (0 > param2) {
                  if (this.field_d) {
                    this.field_k = -1;
                  }
                } else {
                  if (param2 != this.field_k) {
                  }
                  this.field_d = true;
                  this.field_k = param2;
                }
              }
            }
          }
        }
        if (param0 >= 55) {
          return;
        }
        this.h(94);
    }

    final void a(int param0, byte param1) {
        if (this.field_a == 0) {
          this.field_k = param0;
          this.field_d = false;
        }
        if (param1 < -78) {
          return;
        }
        this.a(61, true);
    }

    public static void f(int param0) {
        field_l = null;
        field_e = null;
        field_i = null;
        if (param0 != 0) {
          pl.d(-80);
        }
    }

    final void h(int param0) {
        this.field_j = param0;
        this.field_b = 0;
        if (this.field_a == 0) {
          this.field_j = ji.field_a;
        }
        if (this.field_a == 0 &&
          ji.field_a == 98) {
          if (this.field_k <= 0) {
            this.field_k = this.field_m;
          }
          this.field_d = false;
          this.field_k = this.field_k - 1;
        }
        if (this.field_a != 0) {
          return;
        }
        if (ji.field_a != 99) {
          return;
        }
        this.field_k = this.field_k + 1;
        if (this.field_k >= this.field_m) {
          this.field_k = 0;
        }
        this.field_d = false;
    }

    final boolean b(int param0) {
        int var2 = -120 % ((45 - param0) / 57);
        if (this.field_b != 0) {
          return true;
        }
        if (this.field_j == 84) {
          return true;
        }
        if (this.field_j != 83) {
          return false;
        }
        return true;
    }

    final boolean g(int param0) {
        int var2 = 27 / ((17 - param0) / 62);
        return this.field_j == 102 ? true : false;
    }

    final static boolean a(rh param0, rh param1, rh param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.b((byte) -121) &&
            param0.a("commonui", -95)) {
            if (!param1.b((byte) -126)) {
              return false;
            }
            if (!param1.a("commonui", -109)) {
              return false;
            }
            if (!param3) {
              pl.f(-93);
            }
            if (param2.b((byte) -125) &&
              param2.a("button.gif", -101)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pl.R(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0) {
        this.field_b = 0;
        this.field_j = 0;
        if (param0 > -2) {
          field_c = false;
        }
        if (0 == this.field_a) {
          this.field_j = ji.field_a;
        }
        if (0 == this.field_a &&
          ji.field_a == 96) {
          if (this.field_k <= 0) {
            this.field_k = this.field_m;
          }
          this.field_k = this.field_k - 1;
          this.field_d = false;
        }
        if (this.field_a != 0) {
          return;
        }
        if (ji.field_a != 97) {
          return;
        }
        this.field_k = this.field_k + 1;
        if (this.field_m <= this.field_k) {
          this.field_k = 0;
        }
        this.field_d = false;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_a != 0 ? true : false;
    }

    final boolean a(int param0) {
        if (param0 == -23670) {
          return this.field_j == 97 ? true : false;
        }
        this.a(23, 68, true, 121);
        return this.field_j == 97 ? true : false;
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9816) {
            pl.a(83, 14, 100);
          }
          stackIn_3_0 = jc.a(10, 110, true, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pl.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (param0 != -29) {
          return true;
        }
        return this.field_j == 103 ? true : false;
    }

    final static void d(int param0) {
        if (param0 < 60) {
          field_i = (String) null;
        }
    }

    final boolean e(int param0) {
        if (param0 == 96) {
          return this.field_j == 96 ? true : false;
        }
        this.field_a = 48;
        return this.field_j == 96 ? true : false;
    }

    final static void a(int param0, int param1, int param2) {
        param0 = param0 * 16;
        param2 = param2 * 16;
        gb.a(si.field_R);
        int var3 = ni.field_j * 2 % 16;
        gb.a(var3 + param2, param0 - 4, 16 + (param2 + var3), 16 + param0);
        gb.h(var3 + param2, 4 + param0, 8, 13421632);
        gb.b(si.field_R);
        if (param1 <= -63) {
          return;
        }
        pl.f(47);
    }

    final void i(int param0) {
        this.field_b = 0;
        if (param0 == -13093) {
          this.field_j = 0;
          if (this.field_a == 0) {
            this.field_j = ji.field_a;
          }
          return;
        }
        this.h(-126);
        this.field_j = 0;
        if (this.field_a == 0) {
          this.field_j = ji.field_a;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_a = 0;
        this.field_d = param2 ? true : false;
        if (!this.field_d) {
          this.field_k = param1;
          if (param3 >= -58) {
            this.b(-3);
            return;
          }
          return;
        }
        this.field_k = param0;
        if (param3 >= -58) {
          this.b(-3);
          return;
        }
    }

    pl(int param0) {
        this.field_k = 0;
        this.field_d = false;
        this.field_m = param0;
    }

    static {
        field_c = false;
        field_i = "<%0>Water:<%1> fleas can't swim, so make sure they stay out of any water.";
        field_l = new int[]{41, 30};
        field_f = 0;
    }
}
