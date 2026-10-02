/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_i;
    private long field_c;
    private int field_d;
    private long field_e;
    private pa field_a;
    private long field_k;
    private long field_g;
    private byte[] field_j;
    private byte[] field_h;
    private long field_b;
    private long field_f;

    private final void b(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Geoblox.field_C;
        if (this.field_c != -1L) {
          if (~this.field_b != ~this.field_c) {
            this.field_a.a(this.field_c, true);
            this.field_b = this.field_c;
          }
          this.field_a.a(this.field_j, 0, 90, this.field_d);
          this.field_b = this.field_b + (long)this.field_d;
          if (~this.field_b < ~this.field_e) {
            this.field_e = this.field_b;
          }
          L3: {
            var2 = -1L;
            var4 = -1L;
            if (this.field_c >= this.field_g) {
              if (~((long)this.field_i + this.field_g) < ~this.field_c) {
                var2 = this.field_c;
                break L3;
              }
            }
            if (this.field_c <= this.field_g) {
              if (~this.field_g > ~(this.field_c + (long)this.field_d)) {
                var2 = this.field_g;
              }
            }
          }
          L5: {
            if (~this.field_g > ~(this.field_c + (long)this.field_d)) {
              if (this.field_g + (long)this.field_i >= (long)this.field_d + this.field_c) {
                var4 = (long)this.field_d + this.field_c;
                break L5;
              }
            }
            if (~((long)this.field_i + this.field_g) < ~this.field_c) {
              if (~(this.field_c + (long)this.field_d) <= ~((long)this.field_i + this.field_g)) {
                var4 = this.field_g + (long)this.field_i;
              }
            }
          }
          if (var2 > -1L) {
            if (var4 > var2) {
              var6 = (int)(var4 - var2);
              sf.a(this.field_j, (int)(-this.field_c + var2), this.field_h, (int)(-this.field_g + var2), var6);
            }
          }
          this.field_d = 0;
          this.field_c = -1L;
        }
        if (param0 <= 60) {
          this.field_e = 28L;
        }
    }

    final void b(int param0) throws IOException {
        this.b((byte) 91);
        this.field_a.a((byte) -5);
        if (param0 != 27034) {
            this.a((byte) 92);
        }
    }

    final long a(byte param0) {
        if (param0 != 46) {
            this.field_h = (byte[]) null;
        }
        return this.field_k;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        var14 = Geoblox.field_C;
        try {
          try {
            if (param1 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
            }
            {
              if (-1L != this.field_c) {
                if (this.field_f >= this.field_c) {
                  if ((long)this.field_d + this.field_c >= (long)param1 + this.field_f) {
                    sf.a(this.field_j, (int)(-this.field_c + this.field_f), param0, param2, param1);
                    this.field_f = this.field_f + (long)param1;
                    return;
                  }
                }
              }
              var5_long = this.field_f;
              var7 = param2;
              var8 = param1;
              if (param3 != 9868) {
                sk.a(-115);
              }
              if (~this.field_f <= ~this.field_g) {
                if (~((long)this.field_i + this.field_g) < ~this.field_f) {
                  var9_int = (int)((long)this.field_i - this.field_f + this.field_g);
                  if (param1 < var9_int) {
                    var9_int = param1;
                  }
                  sf.a(this.field_h, (int)(-this.field_g + this.field_f), param0, param2, var9_int);
                  param1 = param1 - var9_int;
                  this.field_f = this.field_f + (long)var9_int;
                  param2 = param2 + var9_int;
                }
              }
              L5: {
                if (this.field_h.length < param1) {
                  this.field_a.a(this.field_f, true);
                  this.field_b = this.field_f;
                  L7: while (param1 > 0) {
                    var9_int = this.field_a.a(param1, param0, param2, false);
                    if (-1 == var9_int) {
                      break L5;
                    }
                    this.field_f = this.field_f + (long)var9_int;
                    this.field_b = this.field_b + (long)var9_int;
                    param1 = param1 - var9_int;
                    param2 = param2 + var9_int;
                  }
                  break L5;
                }
                if (param1 > 0) {
                  this.a(true);
                  var9_int = param1;
                  if (this.field_i < var9_int) {
                    var9_int = this.field_i;
                  }
                  sf.a(this.field_h, 0, param0, param2, var9_int);
                  param1 = param1 - var9_int;
                  param2 = param2 + var9_int;
                  this.field_f = this.field_f + (long)var9_int;
                }
              }
              if (-1L != this.field_c) {
                L9: {
                  if (~this.field_c < ~this.field_f) {
                    stackIn_32_0 = -1;
                    stackIn_32_1 = ~param1;
                    if (stackIn_32_0 > stackIn_32_1) {
                      var9_int = param2 + (int)(-this.field_f + this.field_c);
                      if (param2 + param1 < var9_int) {
                        var9_int = param2 + param1;
                      }
                      L11: while (var9_int > param2) {
                        param1--;
                        incrementValue$0 = param2;
                        param2++;
                        param0[incrementValue$0] = (byte) 0;
                        this.field_f = this.field_f + 1L;
                      }
                      break L9;
                    }
                  }
                }
                L12: {
                  var9 = -1L;
                  if (~this.field_c <= ~var5_long) {
                    if (~this.field_c > ~((long)var8 + var5_long)) {
                      var9 = this.field_c;
                      break L12;
                    }
                  }
                  if (~this.field_c >= ~var5_long) {
                    if (var5_long < this.field_c + (long)this.field_d) {
                      var9 = var5_long;
                    }
                  }
                }
                L14: {
                  var11 = -1L;
                  if (~var5_long > ~((long)this.field_d + this.field_c)) {
                    if ((long)var8 + var5_long >= (long)this.field_d + this.field_c) {
                      var11 = this.field_c + (long)this.field_d;
                      break L14;
                    }
                  }
                  if (this.field_c < var5_long + (long)var8) {
                    if (~(var5_long + (long)var8) >= ~(this.field_c + (long)this.field_d)) {
                      var11 = (long)var8 + var5_long;
                    }
                  }
                }
                if (var9 > -1L) {
                  if (var9 < var11) {
                    var13 = (int)(-var9 + var11);
                    sf.a(this.field_j, (int)(var9 - this.field_c), param0, var7 + (int)(-var5_long + var9), var13);
                    if (var11 > this.field_f) {
                      param1 = (int)((long)param1 - (var11 - this.field_f));
                      this.field_f = var11;
                    }
                  }
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
          if (param1 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = (RuntimeException) (var5_ref);

          stackIn_64_1 = new StringBuilder().append("sk.B(");

          if (param0 == null) {
            stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
            stackIn_65_2 = "null";
          } else {
            stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
            stackIn_65_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        pa stackIn_19_0 = null;
        long stackIn_19_1 = 0L;
        pa stackIn_20_0 = null;
        long stackIn_20_1 = 0L;
        boolean stackIn_20_2 = false;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          try {
            if (~this.field_k > ~((long)param0 + this.field_f)) {
              this.field_k = (long)param0 + this.field_f;
            }
            if (-1L != this.field_c) {
              if (~this.field_c >= ~this.field_f) {
                if (~this.field_f < ~(this.field_c + (long)this.field_d)) {
                  this.b((byte) 99);
                }
              } else {
                this.b((byte) 99);
              }
            }
            if (-1L != this.field_c) {
              if ((long)param0 + this.field_f > (long)this.field_j.length + this.field_c) {
                var5_int = (int)((long)this.field_j.length + this.field_c - this.field_f);
                sf.a(param2, param1, this.field_j, (int)(-this.field_c + this.field_f), var5_int);
                this.field_f = this.field_f + (long)var5_int;
                param1 = param1 + var5_int;
                param0 = param0 - var5_int;
                this.field_d = this.field_j.length;
                this.b((byte) 127);
              }
            }
            if (param3) {
              return;
            }
            if (param0 <= this.field_j.length) {
              if (param0 <= 0) {
                return;
              }
              if (this.field_c == -1L) {
                this.field_c = this.field_f;
              }
              sf.a(param2, param1, this.field_j, (int)(-this.field_c + this.field_f), param0);
              this.field_f = this.field_f + (long)param0;
              if (~(long)this.field_d > ~(-this.field_c + this.field_f)) {
                this.field_d = (int)(this.field_f - this.field_c);
              }
              return;
            }
            if (this.field_f != this.field_b) {
              stackIn_19_0 = this.field_a;

              stackIn_19_1 = this.field_f;

              if (param3) {
                stackIn_20_0 = (pa) ((Object) stackIn_19_0);
                stackIn_20_1 = stackIn_19_1;
                stackIn_20_2 = false;
              } else {
                stackIn_20_0 = (pa) ((Object) stackIn_19_0);
                stackIn_20_1 = stackIn_19_1;
                stackIn_20_2 = true;
              }
              ((pa) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2);
              this.field_b = this.field_f;
            }
            this.field_a.a(param2, param1, 90, param0);
            this.field_b = this.field_b + (long)param0;
            if (~this.field_b < ~this.field_e) {
              this.field_e = this.field_b;
            }
            L6: {
              var5_long = -1L;
              var7 = -1L;
              if (~this.field_g >= ~this.field_f) {
                if (~this.field_f > ~(this.field_g + (long)this.field_i)) {
                  var5_long = this.field_f;
                  break L6;
                }
              }
              if (~this.field_g <= ~this.field_f) {
                if (~this.field_g > ~(this.field_f + (long)param0)) {
                  var5_long = this.field_g;
                }
              }
            }
            L8: {
              if (~this.field_g > ~((long)param0 + this.field_f)) {
                if (~((long)this.field_i + this.field_g) <= ~(this.field_f + (long)param0)) {
                  var7 = this.field_f + (long)param0;
                  break L8;
                }
              }
              if (this.field_f < this.field_g + (long)this.field_i) {
                if (~(this.field_g + (long)this.field_i) >= ~(this.field_f + (long)param0)) {
                  var7 = (long)this.field_i + this.field_g;
                }
              }
            }
            if (var5_long > -1L) {
              if (~var5_long > ~var7) {
                var9 = (int)(-var5_long + var7);
                sf.a(param2, (int)(var5_long + ((long)param1 - this.field_f)), this.field_h, (int)(var5_long - this.field_g), var9);
              }
            }
            this.field_f = this.field_f + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_54_0 = (RuntimeException) (var5_ref);

          stackIn_54_1 = new StringBuilder().append("sk.C(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
            stackIn_55_2 = "null";
          } else {
            stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            this.a(param1, param1.length, 0, 9868);
            int var3_int = -83 / ((param0 + 9) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = Geoblox.field_C;
        if (!param0) {
          return;
        }
        this.field_i = 0;
        if (~this.field_b != ~this.field_f) {
          this.field_a.a(this.field_f, true);
          this.field_b = this.field_f;
        }
        this.field_g = this.field_f;
        L1: while (this.field_i < this.field_h.length) {
          var2 = -this.field_i + this.field_h.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_a.a(var2, this.field_h, this.field_i, false);
          if (var3 != -1) {
            this.field_i = this.field_i + var3;
            this.field_b = this.field_b + (long)var3;
            continue L1;
          }
          break;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        int var4 = -65 / ((-57 - param0) / 37);
        this.field_f = param1;
    }

    final static boolean a(int param0) {
        RuntimeException decompiledCaughtException = null;
        ja var1 = null;
        RuntimeException var1_ref = null;
        float var2 = 0.0f;
        ja var3 = null;
        wd var4 = null;
        int var5 = 0;
        ja var6 = null;
        int var7 = 0;
        ja var8 = null;
        ja var9 = null;
        int var10 = 0;
        ja var11 = null;
        wd var12 = null;
        var10 = Geoblox.field_C;
        try {
          if (param0 != -1) {
            sk.a(3);
          }
          if (el.field_o.field_H) {
            return false;
          }
          bk.field_a.e();
          if (!ld.a(-61)) {
            sh.field_y.a(255);
            return false;
          }
          {
            el.field_o.d((byte) 116);
            sh.field_y.a(255);
            var11 = (ja) ((Object) a.field_d.a(false));
            var1 = var11;
            var2 = (-320.0f + var11.field_o) * (-320.0f + var11.field_o) + (var11.field_v - 240.0f) * (var11.field_v - 240.0f);
            var3 = (ja) ((Object) a.field_d.a(false));
            L1: while (var3 != null) {
              if (var2 < (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (-240.0f + var3.field_v) * (-240.0f + var3.field_v)) {
                var2 = (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (var3.field_v - 240.0f) * (-240.0f + var3.field_v);
                var1 = var3;
              }
              var3 = (ja) ((Object) a.field_d.b(0));
            }
            var12 = new wd();
            var4 = new wd();
            var5 = 0;
            var12.a(var1, false);
            L2: while (true) {
              var6 = (ja) ((Object) var12.a(true));
              if (var6 == null) {
                return true;
              }
              {
                var6.field_z = 6;
                var6.field_r = var5;
                var5 += 50;
                var4.a(var6, false);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6.field_L) {
                    continue L2;
                  }
                  {
                    var8 = var6.field_n[var7];
                    var9 = (ja) ((Object) var4.c((byte) 121));
                    L4: while (true) {
                      L5: {
                        if (var9 == null) {
                          var9 = (ja) ((Object) var12.c((byte) 121));
                          L6: while (var9 != null) {
                            if (var9 == var8) {
                              break L5;
                            }
                            var9 = (ja) ((Object) var12.a(69));
                          }
                          var12.a(-82, var8);
                          break L5;
                        }
                        if (var9 != var8) {
                          var9 = (ja) ((Object) var4.a(param0 ^ 24));
                          continue L4;
                        }
                      }
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "sk.D(" + param0 + ')');
        }
    }

    sk(pa param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = 0;
        this.field_c = -1L;
        this.field_g = -1L;
        try {
            this.field_a = param0;
            dupTemp$0 = param0.a(1);
            this.field_e = dupTemp$0;
            this.field_k = dupTemp$0;
            this.field_j = new byte[param2];
            this.field_h = new byte[param1];
            this.field_f = 0L;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
