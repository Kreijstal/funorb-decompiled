/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_a;
    private int field_h;
    private int field_v;
    private int field_c;
    static String createPasswordConfirmationText;
    private int field_p;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_j;
    private int field_f;
    private int field_g;
    private float field_i;
    static java.awt.Color field_q;
    private int field_o;
    static String field_e;
    private db field_u;
    private int field_s;
    static String field_n;
    private boolean field_t;
    static gk field_l;
    static long field_r;

    public static void a(boolean param0) {
        field_n = null;
        createPasswordConfirmationText = null;
        field_l = null;
        if (param0) {
            field_q = null;
            field_e = null;
            return;
        }
        byte[] var2 = (byte[]) null;
        v.a((byte[]) null, -18);
        field_q = null;
        field_e = null;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_d = param2;
        if (param0 < 125) {
            this.a((byte) 31);
            this.field_p = param1;
            return;
        }
        this.field_p = param1;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        qc var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            var9 = new qc(param0);
            var3 = var9.c((byte) 34);
            var4 = var9.a((byte) -97);
            if (var4 >= 0) {
              if (uj.field_b != 0) {
                if (var4 > uj.field_b) {
                  break L0;
                }
              }
              if (param1 == ~var3) {
                var12 = new byte[var4];
                var10 = var12;
                var5_ref_byte__ = var10;
                var9.b(29915, var4, var12, 0);
                stackIn_7_0 = (byte[]) (var5_ref_byte__);
                return stackIn_7_0;
              }
              L2: {
                var5 = var9.a((byte) -49);
                if (var5 >= 0) {
                  if (uj.field_b != 0) {
                    if (uj.field_b < var5) {
                      break L2;
                    }
                  }
                  var13 = new byte[var5];
                  var11 = var13;
                  var6 = var11;
                  if (var3 == 1) {
                    tb.a(var13, var5, param0, var4, 9);
                  } else {
                    var7 = sc.field_b;
                    synchronized (var7) {
                      sc.field_b.a(param1 + 0, var9, var13);
                    }
                  }
                  stackIn_21_0 = (byte[]) (var6);
                  return stackIn_21_0;
                }
              }
              throw new RuntimeException();
            }
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = (RuntimeException) (var2);

          stackIn_24_1 = new StringBuilder().append("v.C(");

          if (param0 == null) {
            stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
            stackIn_25_2 = "null";
          } else {
            stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_u.a(-2964, this.field_g, this.field_b);
        if (param0 > -5) {
            this.b(false);
        }
    }

    final void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        if (null != vl.field_n) {
          return;
        }
        if (param0 < -108) {
          if (og.field_n <= 0) {
            this.field_t = false;
            if (this.field_t) {
              fieldTemp$1 = this.field_c - 1;
              this.field_c = this.field_c - 1;
              if (0 < fieldTemp$1) {
                return;
              }
              this.field_c = this.field_s;
              if (this.field_k > li.field_c) {
                this.field_t = false;
              } else {
                this.b(true);
              }
              return;
            }
            if (this.field_d <= kh.field_d) {
              if (this.field_d > 0) {
                qa.field_b = 0;
              }
            } else {
              qa.field_b = (-kh.field_d + this.field_d) / 2;
            }
          } else {
            if (this.field_t) {
              fieldTemp$0 = this.field_c - 1;
              this.field_c = this.field_c - 1;
              if (0 < fieldTemp$0) {
                return;
              }
              this.field_c = this.field_s;
              if (this.field_k > li.field_c) {
                this.field_t = false;
              } else {
                this.b(true);
              }
              return;
            }
            if (this.field_d > kh.field_d) {
              qa.field_b = (-kh.field_d + this.field_d) / 2;
            } else {
              if (this.field_d > 0) {
                qa.field_b = 0;
              }
            }
          }
          if (kh.field_d == this.field_a) {
            if (ok.field_c == this.field_h) {
              return;
            }
          }
          this.field_u.a(-2964, this.field_a, this.field_h);
          return;
        }
        this.field_a = -79;
        if (og.field_n > 0) {
          if (this.field_t) {
            fieldTemp$3 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$3) {
              return;
            }
            this.field_c = this.field_s;
            if (this.field_k > li.field_c) {
              this.field_t = false;
            } else {
              this.b(true);
            }
            return;
          }
          if (this.field_d <= kh.field_d) {
            if (this.field_d > 0) {
              qa.field_b = 0;
            }
          } else {
            qa.field_b = (-kh.field_d + this.field_d) / 2;
          }
        } else {
          this.field_t = false;
          if (this.field_t) {
            fieldTemp$2 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (0 < fieldTemp$2) {
              return;
            }
            this.field_c = this.field_s;
            if (this.field_k > li.field_c) {
              this.field_t = false;
            } else {
              this.b(true);
            }
            return;
          }
          if (this.field_d > kh.field_d) {
            qa.field_b = (-kh.field_d + this.field_d) / 2;
          } else {
            if (this.field_d > 0) {
              qa.field_b = 0;
            }
          }
        }
        if (kh.field_d != this.field_a) {
          this.field_u.a(-2964, this.field_a, this.field_h);
        } else {
          if (ok.field_c != this.field_h) {
            this.field_u.a(-2964, this.field_a, this.field_h);
          }
        }
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Geoblox.field_C;
        var2 = this.field_d;
        var3 = this.field_p;
        if (!this.a(-123)) {
          this.field_t = false;
          return;
        }
        if (this.field_j >= var2) {
          if (var2 < this.field_f) {
            var2 = this.field_f;
          }
        } else {
          var2 = this.field_j;
        }
        if (var3 > this.field_v) {
          var3 = this.field_v;
          if (!(0.0f < this.field_i)) {
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
            } else {
              if (var3 != ok.field_c) {
                this.field_u.a(-2964, var2, var3);
              }
            }
            if (this.field_d > 0) {
              qa.field_b = (-kh.field_d + this.field_d) / 2;
            }
            return;
          }
          var4 = (int)(0.5f + (float)var3 * this.field_i);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_i);
          } else {
            if (var4 >= var2) {
              if (!param0) {
                return;
              }
              if (kh.field_d != var2) {
                this.field_u.a(-2964, var2, var3);
              } else {
                if (var3 != ok.field_c) {
                  this.field_u.a(-2964, var2, var3);
                }
              }
              if (this.field_d > 0) {
                qa.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
            var2 = var4;
          }
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
          } else {
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
            }
          }
          if (this.field_d <= 0) {
            return;
          }
          qa.field_b = (-kh.field_d + this.field_d) / 2;
          return;
        }
        if (var3 < this.field_o) {
          var3 = this.field_o;
        }
        if (!(0.0f < this.field_i)) {
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
          } else {
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
            }
          }
          if (this.field_d <= 0) {
            return;
          }
          qa.field_b = (-kh.field_d + this.field_d) / 2;
          return;
        }
        {
          var4 = (int)(0.5f + (float)var3 * this.field_i);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_i);
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
              if (this.field_d <= 0) {
                return;
              }
              qa.field_b = (-kh.field_d + this.field_d) / 2;
              return;
            }
            if (var3 == ok.field_c) {
              if (this.field_d <= 0) {
                return;
              }
              qa.field_b = (-kh.field_d + this.field_d) / 2;
              return;
            }
            this.field_u.a(-2964, var2, var3);
            if (this.field_d <= 0) {
              return;
            }
            qa.field_b = (-kh.field_d + this.field_d) / 2;
            return;
          }
          if (var4 < var2) {
            var2 = var4;
            if (!param0) {
              return;
            }
            if (kh.field_d != var2) {
              this.field_u.a(-2964, var2, var3);
              if (this.field_d > 0) {
                qa.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
            if (var3 != ok.field_c) {
              this.field_u.a(-2964, var2, var3);
              if (this.field_d > 0) {
                qa.field_b = (-kh.field_d + this.field_d) / 2;
              }
              return;
            }
            if (this.field_d <= 0) {
              return;
            }
            qa.field_b = (-kh.field_d + this.field_d) / 2;
            return;
          }
          if (!param0) {
            return;
          }
          if (kh.field_d != var2) {
            this.field_u.a(-2964, var2, var3);
            if (this.field_d <= 0) {
              return;
            }
            qa.field_b = (-kh.field_d + this.field_d) / 2;
            return;
          }
          if (var3 == ok.field_c) {
            if (this.field_d <= 0) {
              return;
            }
            qa.field_b = (-kh.field_d + this.field_d) / 2;
            return;
          }
          this.field_u.a(-2964, var2, var3);
          if (this.field_d <= 0) {
            return;
          }
          qa.field_b = (-kh.field_d + this.field_d) / 2;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 > -91) {
            createPasswordConfirmationText = (String) null;
            if (li.field_c < this.field_k) {
                return false;
            }
            if (og.field_n > 0) {
                return true;
            }
            return false;
        }
        if (li.field_c < this.field_k) {
            return false;
        }
        if (og.field_n > 0) {
            return true;
        }
        return false;
    }

    private v() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 12) {
            field_e = (String) null;
          }
          stackIn_5_0 = !(jg.a((byte) -62, param0) == null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var2);

          stackIn_8_1 = new StringBuilder().append("v.B(");

          if (param0 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        createPasswordConfirmationText = "Confirm Password: ";
        field_e = null;
        field_n = "To skip this tutorial, press <img=3> at any point.";
        field_q = new java.awt.Color(10040319);
        field_l = new gk();
    }
}
