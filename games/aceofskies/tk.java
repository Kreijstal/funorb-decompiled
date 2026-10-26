/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk {
    private int field_j;
    private long field_p;
    private boolean field_m;
    int[] field_e;
    private static int field_d;
    static int field_f;
    static boolean field_r;
    private PcmStream field_n;
    private static pn field_s;
    private long field_q;
    private int field_o;
    private int field_t;
    private boolean field_c;
    private int field_h;
    private int field_k;
    private PcmStream[] field_u;
    private int field_a;
    private int field_g;
    private long field_l;
    private int field_i;
    private PcmStream[] field_b;

    int g() throws Exception {
        return this.field_h;
    }

    private final void a(int[] param0, int param1) {
        int var7_int;
        int var8_int;
        int var3 = param1;
        if (field_r) {
          var3 = var3 << 1;
        }
        au.a(param0, 0, var3);
        this.field_o = this.field_o - param1;
        if (this.field_n != null &&
          this.field_o <= 0) {
          this.field_o = this.field_o + (field_f >> 4);
          tk.b(this.field_n);
          this.a(this.field_n, this.field_n.c());
          int var4 = 0;
          int var5 = 255;
          int var6 = 7;
          scanLoop1: while (true) {
            if (var5 != 0) {
              if (var6 >= 0) {
                var7_int = var6;
                var8_int = 0;
              } else {
                var7_int = var6 & 3;
                var8_int = -(var6 >> 2);
              }
              int var9 = var5 >>> var7_int & 286331153;
              while (var9 != 0) {
                if ((var9 & 1) != 0) {
                  var5 = var5 & ~(1 << var7_int);
                  Object var10 = null;
                  PcmStream var11 = this.field_b[var7_int];
                  PcmStream var14 = var11;
                  PcmStream var14Lifetime1 = var11;
                  while (var11 != null) {
                    gs var12 = var11.field_f;
                    if (var12 != null &&
                      var12.field_e > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_e;
                      continue;
                    }
                    var11.field_g = true;
                    int var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_e = var12.field_e + var13;
                    }
                    if (var4 >= this.field_j) {
                      break scanLoop1;
                    }
                    PcmStream var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      int var15_int = var11.field_h;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    PcmStream var15 = var11.field_e;
                    var11.field_e = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_e = var15;
                    } else {
                      this.field_b[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_u[var7_int] = (PcmStream) (var10);
                    }
                    var11 = var15;
                  }
                }
                var7_int += 4;
                var8_int++;
                var9 = var9 >>> 4;
              }
              var6--;
              continue;
            }
            break;
          }
          for (int var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            Object var7 = this.field_b[var6Lifetime1];
            PcmStream[] var8 = this.field_b;
            int var9Lifetime1 = var6Lifetime1;
            this.field_u[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              Object var10Lifetime1 = ((PcmStream) (var7)).field_e;
              ((PcmStream) (var7)).field_e = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if (this.field_n != null) {
          this.field_n.b(param0, 0, param1);
        }
        this.field_p = kh.a(-99);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_m) {
            return;
          }
          long var1 = kh.a(-128);
          try {
            if (var1 > this.field_p + 6000L) {
              this.field_p = var1 - 6000L;
            }
            while (var1 > this.field_p + 5000L) {
              this.b(256);
              this.field_p = this.field_p + (long)(256000 / field_f);
              var1 = kh.a(-69);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_p = var1;
          }
          if (this.field_e == null) {
            return;
          }
          try {
            if (this.field_q != 0L) {
              if (var1 < this.field_q) {
                return;
              }
              this.a(this.field_h);
              this.field_q = 0L;
              this.field_c = true;
            }
            int var3_int = this.g();
            if (this.field_a - var3_int > this.field_t) {
              this.field_t = this.field_a - var3_int;
            }
            int var4 = this.field_i + this.field_k;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_h) {
              this.field_h = this.field_h + 1024;
              if (this.field_h > 16384) {
                this.field_h = 16384;
              }
              this.f();
              this.a(this.field_h);
              var3_int = 0;
              this.field_c = true;
              if (var4 + 256 > this.field_h) {
                var4 = this.field_h - 256;
                this.field_k = var4 - this.field_i;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_e, 256);
              this.c();
              var3_int += 256;
            }
            if (var1 > this.field_l) {
              if (this.field_c) {
                this.field_c = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_g == 0) {
                  this.f();
                  this.field_q = var1 + 2000L;
                  return;
                }
                this.field_k = Math.min(this.field_g, this.field_t);
                this.field_g = this.field_t;
              }
              this.field_t = 0;
              this.field_l = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.f();
            this.field_q = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void c() throws Exception {
    }

    private final void b(int param0) {
        this.field_o = this.field_o - param0;
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if (this.field_n != null) {
          this.field_n.a(param0);
          return;
        }
    }

    void a(int param0) throws Exception {
    }

    private final static void b(PcmStream param0) {
        param0.field_g = false;
        if (param0.field_f != null) {
          param0.field_f.field_e = 0;
        }
        PcmStream var1 = param0.b();
        while (var1 != null) {
          tk.b(var1);
          var1 = param0.a();
        }
    }

    private final void a(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_u[var3];
        if (var4 == null) {
          this.field_b[var3] = param0;
        } else {
          var4.field_e = param0;
        }
        this.field_u[var3] = param0;
        param0.field_h = param1;
    }

    final synchronized void d() {
        if (field_s != null) {
          int var1 = 1;
          for (int var2 = 0; var2 < 2; var2++) {
            if (field_s.field_c[var2] == this) {
              field_s.field_c[var2] = null;
            }
            if (field_s.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_s.field_a = true;
            while (field_s.field_e) {
              IntrusiveNode.a(50L, false);
            }
            field_s = null;
          }
        }
        this.f();
        this.field_e = null;
        this.field_m = true;
    }

    public static void a() {
        field_s = null;
    }

    void b() throws Exception {
    }

    final synchronized void e() {
        try {
          this.field_c = true;
          try {
            this.b();
          } catch (Exception exception) {
            this.f();
            this.field_q = kh.a(-86) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_f = param0;
        field_r = param1 ? true : false;
        field_d = param2;
    }

    final synchronized void a(PcmStream param0) {
        this.field_n = param0;
    }

    final static tk a(rk param0, java.awt.Component param1, int param2, int param3) {
        try {
          int stackIn_11_2 = 0;
          if (field_f == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              ug var5 = new ug();
              ug var4 = var5;
              ug stackIn_10_0 = var4;
              int stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((tk) ((Object) stackIn_10_0)).field_e = new int[stackIn_10_1 * stackIn_11_2];
              ((tk) ((Object) var4)).field_i = param3;
              ((tk) ((Object) var4)).a(param1);
              ((tk) ((Object) var4)).field_h = (param3 & -1024) + 1024;
              if (((tk) ((Object) var4)).field_h > 16384) {
                ((tk) ((Object) var4)).field_h = 16384;
              }
              ((tk) ((Object) var4)).a(((tk) ((Object) var4)).field_h);
              if (field_d > 0 &&
                field_s == null) {
                field_s = new pn();
                field_s.field_f = param0;
                param0.a(field_d, 1048576, (Runnable) ((Object) field_s));
              }
              if (field_s != null) {
                if (field_s.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_s.field_c[param2] = (tk) ((Object) var5);
              }
              ug stackIn_21_0 = var4;
              return (tk) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var4_ref = decompiledCaughtException;
              return new tk();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void f() {
    }

    tk() {
        this.field_j = 32;
        this.field_m = false;
        this.field_p = kh.a(-86);
        this.field_t = 0;
        this.field_c = true;
        this.field_u = new PcmStream[8];
        this.field_g = 0;
        this.field_q = 0L;
        this.field_o = 0;
        this.field_l = 0L;
        this.field_a = 0;
        this.field_b = new PcmStream[8];
    }
}
