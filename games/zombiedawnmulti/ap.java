/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends qb {
    static String field_u;
    static boolean field_s;
    static String field_r;
    static ja field_t;
    private ej field_q;

    private final void a(boolean param0, boolean param1) {
        try {
          k stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          IOException var3 = null;
          Exception var4 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_b.field_j = 0;
            stackIn_5_0 = this.field_b;
            stackIn_5_1 = 122;
            if (param0) {
              stackIn_6_2 = 2;
            } else {
              stackIn_6_2 = 3;
            }
            ((k) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_6_2);
            this.field_b.b(0L, param1);
            this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
            if (!param1) {
              this.a(false, false);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.c(93);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_n = this.field_n + 1;
            this.field_q = null;
            this.field_p = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ul param0, byte param1, fm param2) {
        int var6 = 0;
        int var7 = 0;
        int[] var17 = null;
        int var9 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3_int = p.field_e;
        rp.field_l = new cj(0L, (cj) null);
        int var4 = 97 / ((param1 - 46) / 63);
        if (param0 == null) {
          Throwable var11 = (Throwable) null;
          bd.a("QC1", (Throwable) null, false);
          return;
        }
        param0.field_j = false;
        param0.field_b = 0;
        ok.field_p = new ig(var3_int, param0, param0);
        bd.field_c = new an(var3_int, param0, param0, new dd());
        ob var5 = ha.b(false);
        if (var5 == null) {
          Throwable var12 = (Throwable) null;
          bd.a("QC2", (Throwable) null, false);
          return;
        }
        try {
          fb.a(var5, (byte) -19);
          fm var13 = (fm) null;
          tg.field_d = qd.a(1127256, (fm) null, 65793, 1513239, 8947848, 4020342, 65793, (byte) 123, 0, 2245737, 65793, 1513239, 5138823);
          bb.field_k = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 127, 16764006, 0, 0, 0, 0);
          kb.field_x = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 122, 16777215, 0, 0, 0, 0);
          var6 = oo.field_b;
          var7 = oo.field_l;
          var17 = oo.field_i;
          tb.field_v = new ja(10, 14);
          tb.field_v.a();
          for (var9 = 2; 7 > var9; var9++) {
            oo.g(var9, var9 + 1, 14 - (var9 << 1), 16777215);
          }
          oo.a(var17, var6, var7);
          tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
          rp.field_l.field_Cb = new th();
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ap.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        try {
          int stackIn_50_0 = 0;
          int stackIn_67_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          tn var2 = null;
          int var2_int = 0;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          tn var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          tn var2Lifetime1;
          int var2_intLifetime1;
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_q != null) {
            var2_long = bl.a((byte) 115);
            var4 = (int)(var2_long - this.field_f);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_f = var2_long;
            this.field_d = this.field_d + var4;
            if (this.field_d > 30000) {
              try {
                this.field_q.c(99);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (this.a(0) != 0) {
              return false;
            }
            if (0 == this.d(20)) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.b(-26844);
            var2 = (tn) (this.field_g.c((byte) 111));
            while (var2 != null) {
              this.field_b.field_j = 0;
              this.field_b.a(-112, 1);
              this.field_b.b(var2.field_l, true);
              this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
              this.field_j.a(29664, var2);
              var2 = (tn) (this.field_g.b((byte) 97));
            }
            var2Lifetime1 = (tn) (this.field_c.c((byte) 124));
            while (var2Lifetime1 != null) {
              this.field_b.field_j = 0;
              this.field_b.a(-20, 0);
              this.field_b.b(var2Lifetime1.field_l, true);
              this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
              this.field_l.a(29664, var2Lifetime1);
              var2Lifetime1 = (tn) (this.field_c.b((byte) 102));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_q.a(-79);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_d = 0;
                var4 = 0;
                if (null == this.field_m) {
                  var4 = 10;
                } else {
                  if (this.field_m.field_D == 0) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = this.field_m.field_y.field_m.length - this.field_m.field_B;
                  var6 = -this.field_m.field_D + 512;
                  if (var6 > -this.field_m.field_y.field_j + var5) {
                    var6 = -this.field_m.field_y.field_j + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_q.a(var6, this.field_m.field_y.field_j, this.field_m.field_y.field_m, 117);
                  if (0 != this.field_i) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j] = (byte)vg.a((int) this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j], (int) this.field_i);
                    }
                  }
                  this.field_m.field_y.field_j = this.field_m.field_y.field_j + var6;
                  this.field_m.field_D = this.field_m.field_D + var6;
                  if (this.field_m.field_y.field_j != var5) {
                    if (this.field_m.field_D == 512) {
                      this.field_m.field_D = 0;
                    }
                  } else {
                    this.field_m.a(-4564);
                    this.field_m.field_t = false;
                    this.field_m = null;
                  }
                } else {
                  var5 = -this.field_k.field_j + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_q.a(var5, this.field_k.field_j, this.field_k.field_m, 108);
                  if (this.field_i != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_k.field_m[var6 + this.field_k.field_j] = (byte)vg.a((int) this.field_k.field_m[var6 + this.field_k.field_j], (int) this.field_i);
                    }
                  }
                  this.field_k.field_j = this.field_k.field_j + var5;
                  if (var4 <= this.field_k.field_j) {
                    if (this.field_m != null) {
                      if (this.field_m.field_D != 0) {
                        throw new IOException();
                      }
                      if (this.field_k.field_m[0] == -1) {
                        this.field_m.field_D = 1;
                        this.field_k.field_j = 0;
                      } else {
                        this.field_m = null;
                      }
                    } else {
                      this.field_k.field_j = 0;
                      var6 = this.field_k.g(31365);
                      var7 = this.field_k.i(-1478490344);
                      var8 = this.field_k.g(31365);
                      var9 = this.field_k.i(-1478490344);
                      var10 = 127 & var8;
                      stackIn_50_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (tn) (this.field_j.c((byte) 96));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_l) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (tn) (this.field_j.b((byte) 123));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (tn) (this.field_l.c((byte) 110));
                        while (var14_ref != null) {
                          if (~var14_ref.field_l == ~var12) {
                            break;
                          }
                          var14_ref = (tn) (this.field_l.b((byte) 122));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_67_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_67_0;
                      this.field_m = var14_ref;
                      this.field_m.field_y = new k(var15 + (var9 + this.field_m.field_B));
                      this.field_m.field_y.a(125, var10);
                      this.field_m.field_y.b(42, var9);
                      this.field_m.field_D = 10;
                      this.field_k.field_j = 0;
                    }
                  }
                }
                continue;
              }
              break;
            }
            var2_intLifetime1 = -121 % ((44 - param0) / 45);
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.c(82);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_n = this.field_n + 1;
            this.field_p = -2;
            if (0 != this.a(0)) {
              return false;
            }
            if (0 == this.d(20)) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sl a(ul param0, ul param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sl stackIn_2_0 = null;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 4) {
            stackIn_2_0 = (sl) null;
            return stackIn_2_0;
          }
          var5_int = param0.a(param2, (byte) 123);
          var6 = param0.a(param4, var5_int, -1);
          stackIn_4_0 = pm.a(param1, var6, var5_int, param0, -29435);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ap.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_b.field_j = param0;
            this.field_b.a(124, 6);
            this.field_b.d(3, -8593);
            this.field_b.a(0, (byte) -55);
            this.field_q.a(0, param0 - 100, this.field_b.field_m.length, this.field_b.field_m);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.c(116);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_p = -2;
            this.field_q = null;
            this.field_n = this.field_n + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ap() {
    }

    final void a(byte param0) {
        try {
          int var2_int = 0 / ((param0 - 53) / 41);
          this.field_q.c(-101);
        } catch (Exception exception) {
        }
        this.field_n = this.field_n + 1;
        this.field_p = -1;
        this.field_q = null;
        this.field_i = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final void f(int param0) {
        if (param0 != 31) {
          this.a(false, true);
        }
        if (this.field_q != null) {
          this.field_q.c(88);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          tn var4_ref = null;
          IOException var4_ref2 = null;
          int var4_int = 0;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          tn var4_refLifetime1;
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            if (this.field_q != null) {
              try {
                this.field_q.c(-90);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (ej) (param1);
            this.g(0);
            this.a(param0, true);
            this.field_m = null;
            this.field_k.field_j = 0;
            while (true) {
              var4_ref = (tn) (this.field_j.a(11356));
              if (var4_ref != null) {
                this.field_g.a(29664, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (tn) (this.field_l.a(11356));
              if (var4_refLifetime1 != null) {
                this.field_c.a(29664, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (0 != this.field_i) {
              try {
                this.field_b.field_j = 0;
                this.field_b.a(126, 4);
                this.field_b.a(125, (int) this.field_i);
                this.field_b.b(-103, 0);
                this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.c(-53);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_q = null;
                this.field_n = this.field_n + 1;
                this.field_p = -2;
              }
            }
            var4_int = 12 % ((param2 - 63) / 33);
            this.field_d = 0;
            this.field_f = bl.a((byte) 110);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var4_ref3;
            stackIn_24_1 = new StringBuilder().append("ap.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        if (param0 != 16682) {
          field_s = false;
        }
        field_r = null;
        field_u = null;
        field_t = null;
    }

    static {
        field_s = false;
        field_u = "Spectate";
        field_r = "<%0> has not yet unlocked this option for use.";
    }
}
