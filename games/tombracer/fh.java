/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements fo {
    int field_f;
    int field_i;
    private boolean field_c;
    int field_p;
    private boolean field_j;
    private boolean field_h;
    private boolean field_n;
    private boolean field_e;
    private int field_b;
    int field_d;
    int field_a;
    private boolean field_m;
    int field_l;
    private boolean field_k;
    int field_o;
    lma field_g;
    private boolean field_q;

    final static void b(int param0, int param1) {
        kh var2 = ql.field_k;
        var2.k(param0, -2988);
        var2.i(1, param1 + 22243);
        if (param1 == -22243) {
          var2.i(0, 0);
          return;
        }
    }

    public final void a(int param0, iq param1) {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.b((byte) -113);
          var4 = this.c((byte) 115);
          var5 = this.e((byte) -108);
          gqa.a(dfa.a(this.field_o, 2048, 87), -83584144, var4, var3_int, this.field_g.a(this, (byte) 76), var5);
          if (!nk.c(-115)) {
            return;
          }
          if (param0 < 103) {
            return;
          }
          var6 = gca.field_g[21];
          var7 = gca.field_g[23];
          var8 = gca.field_g[22];
          var9 = 0;
          if (this.field_g.o((byte) 111)) {
            var9 = var9 + 4 * this.field_b % 32;
          }
          if (this.field_m) {
            if (!this.field_k) {
              if (!this.field_h) {
                gqa.a(512, -83584144, var4 + 2097152, var3_int, var6, var9);
              }
            } else {
              gqa.a(1024, -83584144, 2097152 + var4, var3_int, var8, var9);
            }
          }
          if (this.field_c) {
            if (this.field_j) {
              gqa.a(512, -83584144, var4, var3_int + 2097152, var8, var9);
            } else {
              if (!this.field_k) {
                gqa.a(0, -83584144, var4, var3_int + 2097152, var6, var9);
              }
            }
          }
          if (this.field_e &&
            !this.field_q) {
            if (!this.field_h) {
              gqa.a(1024, -83584144, var4, var3_int - 2097152, var6, var9);
            } else {
              gqa.a(-512, -83584144, var4, -2097152 + var3_int, var8, var9);
            }
          }
          if (this.field_n &&
            !this.field_j) {
            if (this.field_q) {
              gqa.a(0, -83584144, -2097152 + var4, var3_int, var8, var9);
            } else {
              gqa.a(-512, -83584144, var4 - 2097152, var3_int, var6, var9);
            }
          }
          if (this.field_m &&
            this.field_c) {
            gqa.a(0, -83584144, 2097152 + var4, var3_int + 2097152, var7, var9);
          }
          if (this.field_m &&
            this.field_e) {
            gqa.a(512, -83584144, var4 + 2097152, -2097152 + var3_int, var7, var9);
          }
          if (this.field_n &&
            this.field_c) {
            gqa.a(-512, -83584144, -2097152 + var4, var3_int + 2097152, var7, var9);
          }
          if (this.field_n) {
            if (!this.field_e) {
              return;
            }
            gqa.a(1024, -83584144, var4 - 2097152, -2097152 + var3_int, var7, var9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_51_0 = var3;
          stackIn_51_1 = new StringBuilder().append("fh.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        this.field_n = false;
        this.field_e = false;
        this.field_c = false;
        this.field_m = false;
        if (0 == this.field_a) {
          var6 = this.field_i;
          if (0 == var6) {
            this.field_n = true;
          } else {
            if (2 != var6) {
              if (var6 != 4) {
                if (var6 == 6) {
                  this.field_e = true;
                }
              } else {
                this.field_m = true;
              }
            } else {
              this.field_c = true;
            }
          }
        } else {
          if (1 == this.field_a) {
            var6 = this.field_i;
            if (0 != var6) {
              if (var6 == 2) {
                this.field_e = true;
                this.field_c = true;
              }
            } else {
              this.field_m = true;
              this.field_n = true;
            }
          } else {
            if (2 == this.field_a) {
              var6 = this.field_i;
              if (var6 != 0) {
                if (var6 == 2) {
                  this.field_n = true;
                  this.field_m = true;
                  this.field_c = true;
                } else {
                  if (var6 == 4) {
                    this.field_e = true;
                    this.field_m = true;
                    this.field_c = true;
                  } else {
                    if (6 == var6) {
                      this.field_e = true;
                      this.field_n = true;
                      this.field_m = true;
                    }
                  }
                }
              } else {
                this.field_c = true;
                this.field_e = true;
                this.field_n = true;
              }
            } else {
              if (this.field_a == 3) {
                this.field_m = true;
                this.field_c = true;
                this.field_n = true;
                this.field_e = true;
              } else {
                if (this.field_a == 4) {
                  var6 = this.field_i;
                  if (1 != var6) {
                    if (3 != var6) {
                      if (7 == var6) {
                        this.field_n = true;
                        this.field_e = true;
                      } else {
                        if (5 == var6) {
                          this.field_e = true;
                          this.field_m = true;
                        }
                      }
                    } else {
                      this.field_m = true;
                      this.field_c = true;
                    }
                  } else {
                    this.field_n = true;
                    this.field_c = true;
                  }
                }
              }
            }
          }
        }
        if (!param0) {
          boolean decompiledFrameRemainder2 = true;
          if (!param4) {
            if (param3) {
              if (!this.field_m &&
                !this.field_c) {
                if (param1 != 24) {
                  return;
                }
                if (param2 && (this.field_n ||
                  this.field_c)) {
                  this.field_j = true;
                }
                decompiledFrameRemainder2 = false;
              }
              else {
                this.field_k = true;
              }
            }
            if (decompiledFrameRemainder2) {
              if (param1 != 24) {
                return;
              }
              if ((param2) &&
                (decompiledFrameRemainder2 = (this.field_n ||
                this.field_c))) {
                this.field_j = true;
              }
              if (decompiledFrameRemainder2) {
                if (0 == this.field_g.i(-77)) {
                  return;
                }
                if (this.field_a != 6) {
                  return;
                }
                this.field_o = 0;
                return;
              }
            }
          }
          if (decompiledFrameRemainder2) {
            if (this.field_m) {
              this.field_h = true;
              if (param3 && (this.field_m ||
                this.field_c)) {
                this.field_k = true;
              }
              if (param1 != 24) {
                return;
              }
              if (param2 && (this.field_n ||
                this.field_c)) {
                this.field_j = true;
              }
            } else {
              if (!this.field_e) {
                if (param3) {
                  if (this.field_m) {
                    this.field_k = true;
                  } else {
                    if (this.field_c) {
                      this.field_k = true;
                    }
                  }
                }
                if (param1 != 24) {
                  return;
                }
                if (param2) {
                  if (this.field_n) {
                    this.field_j = true;
                  } else {
                    if (this.field_c) {
                      this.field_j = true;
                    }
                  }
                }
              } else {
                this.field_h = true;
                if (param3 && (this.field_m ||
                  this.field_c)) {
                  this.field_k = true;
                }
                if (param1 != 24) {
                  return;
                }
                if (param2 && (this.field_n ||
                  this.field_c)) {
                  this.field_j = true;
                }
              }
            }
          }
          if (0 != this.field_g.i(-77) &&
            this.field_a == 6) {
            this.field_o = 0;
          }
          return;
        }
        if (!this.field_n &&
          !this.field_e) {
          boolean decompiledFrameRemainder1 = true;
          if (!param4) {
            if (param3) {
              if (!this.field_m &&
                !this.field_c) {
                if (param1 != 24) {
                  return;
                }
                if (param2 && (this.field_n ||
                  this.field_c)) {
                  this.field_j = true;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                this.field_k = true;
              }
            }
            if (decompiledFrameRemainder1) {
              if (param1 != 24) {
                return;
              }
              if ((param2) &&
                (decompiledFrameRemainder1 = (this.field_n ||
                this.field_c))) {
                this.field_j = true;
              }
              if (decompiledFrameRemainder1) {
                if (0 != this.field_g.i(-77)) {
                  if (this.field_a != 6) {
                    return;
                  }
                  this.field_o = 0;
                }
                return;
              }
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.field_m) {
              this.field_h = true;
              if (param3 && (this.field_m ||
                this.field_c)) {
                this.field_k = true;
              }
              if (param1 != 24) {
                return;
              }
              if (param2 && (this.field_n ||
                this.field_c)) {
                this.field_j = true;
              }
            } else {
              if (!this.field_e) {
                if (param3 && (this.field_m ||
                  this.field_c)) {
                  this.field_k = true;
                }
                if (param1 != 24) {
                  return;
                }
                if (param2 && (this.field_n ||
                  this.field_c)) {
                  this.field_j = true;
                }
              } else {
                this.field_h = true;
                if (param3 && (this.field_m ||
                  this.field_c)) {
                  this.field_k = true;
                }
                if (param1 != 24) {
                  return;
                }
                if (param2 && (this.field_n ||
                  this.field_c)) {
                  this.field_j = true;
                }
              }
            }
          }
          if (0 != this.field_g.i(-77) &&
            this.field_a == 6) {
            this.field_o = 0;
          }
          return;
        }
        this.field_q = true;
        if (!param4) {
          boolean decompiledFrameRemainder0 = true;
          if (param3) {
            if (!this.field_m &&
              !this.field_c) {
              if (param1 != 24) {
                return;
              }
              if (param2 &&
                (this.field_n ||
                this.field_c)) {
                this.field_j = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_k = true;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param1 != 24) {
              return;
            }
            if (param2 &&
              (this.field_n ||
              this.field_c)) {
              this.field_j = true;
            }
          }
        } else {
          if (this.field_m) {
            this.field_h = true;
            if (param3 && (this.field_m ||
              this.field_c)) {
              this.field_k = true;
            }
            if (param1 != 24) {
              return;
            }
            if (param2 && (this.field_n ||
              this.field_c)) {
              this.field_j = true;
            }
            if (0 != this.field_g.i(-77) &&
              this.field_a == 6) {
              this.field_o = 0;
            }
            return;
          }
          if (!this.field_e) {
            if (param3 && (this.field_m ||
              this.field_c)) {
              this.field_k = true;
            }
            if (param1 != 24) {
              return;
            }
            if (param2 && (this.field_n ||
              this.field_c)) {
              this.field_j = true;
            }
            if (0 != this.field_g.i(-77) &&
              this.field_a == 6) {
              this.field_o = 0;
            }
            return;
          }
          this.field_h = true;
          if (param3) {
            if (!this.field_m &&
              !this.field_c) {
              if (param1 != 24) {
                return;
              }
              if (param2 && (this.field_n ||
                this.field_c)) {
                this.field_j = true;
              }
              if (0 != this.field_g.i(-77) &&
                this.field_a == 6) {
                this.field_o = 0;
              }
              return;
            }
            this.field_k = true;
          }
          if (param1 != 24) {
            return;
          }
          if (param2) {
            if (!this.field_n &&
              !this.field_c) {
              if (0 != this.field_g.i(-77) &&
                this.field_a == 6) {
                this.field_o = 0;
              }
              return;
            }
            this.field_j = true;
          }
        }
        if (0 != this.field_g.i(-77)) {
          if (this.field_a != 6) {
            return;
          }
          this.field_o = 0;
        }
    }

    public final int b(byte param0) {
        int var2 = -104 % ((param0 + 23) / 53);
        return this.field_g.b((byte) -76) + this.field_l;
    }

    public final int c(byte param0) {
        if (param0 >= 91) {
          return this.field_g.c((byte) 126) + this.field_f;
        }
        this.field_m = true;
        return this.field_g.c((byte) 126) + this.field_f;
    }

    final void a(int param0) {
        int var2 = this.field_e ? 1 : 0;
        this.field_e = this.field_c;
        this.field_c = var2 != 0 ? true : false;
        if (param0 == 0) {
          return;
        }
        this.b((byte) -30);
    }

    public final int e(byte param0) {
        if (param0 < -86) {
          return this.field_g.e((byte) -115);
        }
        java.awt.Canvas var3 = (java.awt.Canvas) null;
        fh.a(true, (java.awt.Canvas) null, -71);
        return this.field_g.e((byte) -115);
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.a(-19);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (cga.field_f < 10) {
            var3_int = 0;
            if (bsa.field_k) {
              bsa.field_k = false;
              var3_int = 1;
            }
            et.a((byte) 108, tn.a(-10918), bta.field_i, dla.a(7), var3_int != 0);
          } else {
            if (!qk.i(250)) {
              bea.a();
              gga.b(320, 240, (byte) 113);
              fga.a(0, false, 0, param1);
            } else {
              if (0 != gda.field_c) {
                dba.a(param1, (byte) 94);
              } else {
                qja.a(false, param0, param2 ^ -128);
                fga.a(0, false, 0, param1);
              }
            }
          }
          if (param2 != 0) {
            fh.b(107, 37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          this.field_h = true;
          return this.field_g.d((byte) 48);
        }
        return this.field_g.d((byte) 48);
    }

    fh() {
        int fieldTemp$0 = ita.field_g;
        ita.field_g = ita.field_g + 1;
        this.field_b = fieldTemp$0;
    }

    static {
    }
}
