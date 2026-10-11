/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_n;
    private boolean field_g;
    private int field_j;
    private int field_a;
    private int field_d;
    private int field_b;
    private int field_h;
    private int field_l;
    private jb field_r;
    private int field_c;
    private float field_s;
    private int field_o;
    private int field_i;
    private int field_k;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_f;
    private int field_e;

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_c;
        if (param0 >= 83) {
          var3 = this.field_q;
          if (!this.a(48)) {
            this.field_g = false;
            return;
          }
          if (var3 > this.field_j) {
            var3 = this.field_j;
          } else {
            if (this.field_k > var3) {
              var3 = this.field_k;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          if (this.field_i < var2) {
            var2 = this.field_i;
          } else {
            if (var2 < this.field_l) {
              var2 = this.field_l;
              if (this.field_s > 0.0f) {
                var4 = (int)((float)var3 * this.field_s + 0.5f);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / this.field_s);
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                }
              }
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3, -23222);
              } else {
                if (var3 != mk.field_x) {
                  this.field_r.a(var2, var3, -23222);
                }
              }
              decompiledFrameRemainder2 = false;
            }
          }
          if (decompiledFrameRemainder2) {
            if (!(this.field_s > 0.0f)) {
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3, -23222);
              } else {
                if (var3 != mk.field_x) {
                  this.field_r.a(var2, var3, -23222);
                }
              }
            } else {
              var4Lifetime3 = (int)((float)var3 * this.field_s + 0.5f);
              boolean decompiledFrameRemainder1 = true;
              if (var4Lifetime3 > var2) {
                var3 = (int)((float)var2 / this.field_s);
              } else {
                if (var4Lifetime3 < var2) {
                  var2 = var4Lifetime3;
                  if (fk.field_E != var2) {
                    this.field_r.a(var2, var3, -23222);
                  } else {
                    if (var3 != mk.field_x) {
                      this.field_r.a(var2, var3, -23222);
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
              }
              if (decompiledFrameRemainder1) {
                if (fk.field_E == var2 &&
                  var3 == mk.field_x) {
                  if (0 >= this.field_c) {
                    return;
                  }
                  gl.field_D = (-fk.field_E + this.field_c) / 2;
                  return;
                }
                this.field_r.a(var2, var3, -23222);
              }
            }
          }
          if (0 < this.field_c) {
            gl.field_D = (-fk.field_E + this.field_c) / 2;
          }
          return;
        }
        field_n = (String) null;
        var3Lifetime1 = this.field_q;
        if (!this.a(48)) {
          this.field_g = false;
          return;
        }
        if (var3Lifetime1 > this.field_j) {
          var3Lifetime1 = this.field_j;
        } else {
          if (this.field_k > var3Lifetime1) {
            var3Lifetime1 = this.field_k;
          }
        }
        if (this.field_i < var2) {
          var2 = this.field_i;
        } else {
          if (var2 < this.field_l) {
            var2 = this.field_l;
            if (!(this.field_s > 0.0f)) {
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3Lifetime1, -23222);
              } else {
                if (var3Lifetime1 != mk.field_x) {
                  this.field_r.a(var2, var3Lifetime1, -23222);
                }
              }
              if (0 < this.field_c) {
                gl.field_D = (-fk.field_E + this.field_c) / 2;
              }
              return;
            }
            var4Lifetime1 = (int)((float)var3Lifetime1 * this.field_s + 0.5f);
            if (var4Lifetime1 > var2) {
              var3Lifetime1 = (int)((float)var2 / this.field_s);
            } else {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
            if (fk.field_E != var2) {
              this.field_r.a(var2, var3Lifetime1, -23222);
            } else {
              if (var3Lifetime1 != mk.field_x) {
                this.field_r.a(var2, var3Lifetime1, -23222);
              }
            }
            if (0 < this.field_c) {
              gl.field_D = (-fk.field_E + this.field_c) / 2;
            }
            return;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_s > 0.0f) {
          var4Lifetime2 = (int)((float)var3Lifetime1 * this.field_s + 0.5f);
          if (var4Lifetime2 > var2) {
            var3Lifetime1 = (int)((float)var2 / this.field_s);
          } else {
            if (var4Lifetime2 < var2) {
              var2 = var4Lifetime2;
              if (fk.field_E != var2) {
                this.field_r.a(var2, var3Lifetime1, -23222);
                if (0 < this.field_c) {
                  gl.field_D = (-fk.field_E + this.field_c) / 2;
                }
                return;
              }
              if (var3Lifetime1 != mk.field_x) {
                this.field_r.a(var2, var3Lifetime1, -23222);
              }
              decompiledFrameRemainder0 = false;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (fk.field_E != var2) {
            this.field_r.a(var2, var3Lifetime1, -23222);
          } else {
            if (var3Lifetime1 != mk.field_x) {
              this.field_r.a(var2, var3Lifetime1, -23222);
            }
          }
        }
        if (0 >= this.field_c) {
          return;
        }
        gl.field_D = (-fk.field_E + this.field_c) / 2;
        return;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 > 102) {
          this.field_q = param0;
          this.field_c = param1;
          return;
        }
        this.field_h = 4;
        this.field_q = param0;
        this.field_c = param1;
    }

    final boolean a(int param0) {
        if (param0 < 47) {
          return true;
        }
        if (this.field_h > qa.field_p) {
          return false;
        }
        if (wj.field_o > 0) {
          return true;
        }
        return false;
    }

    final dg d(byte param0) {
        dg var2 = null;
        dg var2Lifetime1;
        this.field_p = fk.field_E;
        this.field_e = mk.field_x;
        this.field_r.a(this.field_a, this.field_o, -23222);
        if (param0 == -18) {
          mg.field_c = false;
          var2 = ql.a(0, 0, lk.field_b, 0, this.field_a, this.field_o);
          if (var2 == null) {
            this.c((byte) -125);
          }
          return var2;
        }
        this.a((byte) -73);
        mg.field_c = false;
        var2Lifetime1 = ql.a(0, 0, lk.field_b, 0, this.field_a, this.field_o);
        if (var2Lifetime1 == null) {
          this.c((byte) -125);
        }
        return var2Lifetime1;
    }

    final void b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (ub.field_c != null) {
          return;
        }
        if (param0 >= wj.field_o) {
          this.field_g = false;
          if (this.field_g) {
            fieldTemp$1 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_m = this.field_b;
            if (qa.field_p < this.field_h) {
              this.field_g = false;
            } else {
              this.a((byte) 107);
            }
            return;
          }
        } else {
          if (this.field_g) {
            fieldTemp$0 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_m = this.field_b;
            if (qa.field_p < this.field_h) {
              this.field_g = false;
            } else {
              this.a((byte) 107);
            }
            return;
          }
        }
        if (this.field_c > fk.field_E) {
          gl.field_D = (-fk.field_E + this.field_c) / 2;
        } else {
          if (this.field_c > 0) {
            gl.field_D = 0;
          }
        }
        if (this.field_d == fk.field_E &&
          mk.field_x == this.field_f) {
          return;
        }
        this.field_r.a(this.field_d, this.field_f, -23222);
    }

    final void c(byte param0) {
        int var2 = -90 / ((param0 + 63) / 61);
        this.field_r.a(this.field_p, this.field_e, -23222);
    }

    final static void a(byte param0, java.applet.Applet param1, boolean param2, String param3) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (fe.field_k.startsWith("win") &&
              ca.a(param3, param0 + 2117267372)) {
              return;
            }
            try {
              if (param0 != 68) {
                field_n = (String) null;
              }
              param1.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              d.a((Throwable) null, param0 - 180, "MGR1: " + param3);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var4_ref;
            stackIn_13_1 = new StringBuilder().append("ea.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static mi a(byte[] param0, int param1) {
        mi var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        mi stackIn_5_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (mi) (stackIn_2_0);
          }
          if (param1 != 0) {
            stackIn_5_0 = (mi) null;
            return stackIn_5_0;
          }
          var2 = new mi(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, re.field_K);
          wd.d(-109);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("ea.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = -83 / ((-62 - param0) / 63);
        field_n = null;
    }

    private ea() throws Throwable {
        throw new Error();
    }

    static {
    }
}
