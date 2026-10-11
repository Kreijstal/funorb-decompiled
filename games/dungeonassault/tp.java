/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tp extends bb {
    static String field_z;
    static ef field_B;
    static String[] field_A;
    private rk field_D;
    static String field_u;
    static String[] field_C;
    static String field_w;
    static ad field_y;
    static String field_v;
    static String field_x;

    public static void h(int param0) {
        field_C = null;
        field_y = null;
        field_u = null;
        field_z = null;
        field_B = null;
        field_x = null;
        field_w = null;
        field_A = null;
        if (param0 < 0) {
          field_B = (ef) null;
        }
        field_v = null;
    }

    final void f(int param0) {
        try {
          this.field_D.c(-6624);
        } catch (Exception exception) {
        }
        this.field_c = -1;
        this.field_D = null;
        int var2 = 57 % ((-81 - param0) / 36);
        this.field_h = this.field_h + 1;
        this.field_j = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final static boolean c(byte param0) {
        if (param0 >= -10) {
          return true;
        }
        return in.field_E;
    }

    final void a(int param0) {
        if (null != this.field_D) {
          this.field_D.c(-6624);
        }
        if (param0 != -1016) {
          field_u = (String) null;
        }
    }

    final boolean b(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_63_0 = 0;
          int stackIn_80_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          em var2 = null;
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
          em var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          em var2Lifetime1;
          var16 = DungeonAssault.field_K;
          if (null != this.field_D) {
            var2_long = kd.c(-2456);
            var4 = (int)(-this.field_n + var2_long);
            this.field_n = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_a = this.field_a + var4;
            if (this.field_a > 30000) {
              try {
                this.field_D.c(-6624);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_D = null;
            }
          }
          if (null == this.field_D) {
            if (this.c(20) == 0 &&
              0 == this.e(20)) {
              return true;
            }
            return false;
          }
          try {
            if (param0 <= 6) {
              return true;
            }
            this.field_D.b(-89);
            var2 = (em) (this.field_g.c(13395));
            while (var2 != null) {
              this.field_o.field_o = 0;
              this.field_o.a(6, 1);
              this.field_o.a(var2.field_o, 836);
              this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
              this.field_p.a(var2, -32711);
              var2 = (em) (this.field_g.a((byte) 111));
            }
            var2Lifetime1 = (em) (this.field_d.c(13395));
            while (var2Lifetime1 != null) {
              this.field_o.field_o = 0;
              this.field_o.a(6, 0);
              this.field_o.a(var2Lifetime1.field_o, 836);
              this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
              this.field_s.a(var2Lifetime1, -32711);
              var2Lifetime1 = (em) (this.field_d.a((byte) 102));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_D.a(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_a = 0;
                var4 = 0;
                if (null != this.field_i) {
                  if (this.field_i.field_G == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 > 0) {
                  var5 = var4 - this.field_m.field_o;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_D.a(this.field_m.field_m, false, var5, this.field_m.field_o);
                  if (this.field_j != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_m.field_m[var6 + this.field_m.field_o] = (byte)md.b((int) this.field_m.field_m[var6 + this.field_m.field_o], (int) this.field_j);
                    }
                  }
                  this.field_m.field_o = this.field_m.field_o + var5;
                  if (var4 <= this.field_m.field_o) {
                    if (this.field_i != null) {
                      if (this.field_i.field_G != 0) {
                        throw new IOException();
                      }
                      if (-1 == this.field_m.field_m[0]) {
                        this.field_m.field_o = 0;
                        this.field_i.field_G = 1;
                      } else {
                        this.field_i = null;
                      }
                    } else {
                      this.field_m.field_o = 0;
                      var6 = this.field_m.c(true);
                      var7 = this.field_m.h(-87);
                      var8 = this.field_m.c(true);
                      var9 = this.field_m.h(-100);
                      var10 = var8 & 127;
                      stackIn_63_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_63_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (em) (this.field_p.c(13395));
                        while (var14_ref != null) {
                          if (~var14_ref.field_o == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (em) (this.field_p.a((byte) 117));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (em) (this.field_s.c(13395));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_o) {
                            break;
                          }
                          var14_ref = (em) (this.field_s.a((byte) 66));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_80_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_80_0;
                      this.field_i = var14_ref;
                      this.field_i.field_D = new ec(this.field_i.field_E + var15 + var9);
                      this.field_i.field_D.a(6, var10);
                      this.field_i.field_D.a((byte) 63, var9);
                      this.field_i.field_G = 10;
                      this.field_m.field_o = 0;
                    }
                  }
                } else {
                  var5 = this.field_i.field_D.field_m.length - this.field_i.field_E;
                  var6 = 512 - this.field_i.field_G;
                  if (var6 > var5 - this.field_i.field_D.field_o) {
                    var6 = -this.field_i.field_D.field_o + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_D.a(this.field_i.field_D.field_m, false, var6, this.field_i.field_D.field_o);
                  if (this.field_j != 0) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_i.field_D.field_m[this.field_i.field_D.field_o + var7] = (byte)md.b((int) this.field_i.field_D.field_m[this.field_i.field_D.field_o + var7], (int) this.field_j);
                    }
                  }
                  this.field_i.field_G = this.field_i.field_G + var6;
                  this.field_i.field_D.field_o = this.field_i.field_D.field_o + var6;
                  if (this.field_i.field_D.field_o != var5) {
                    if (this.field_i.field_G == 512) {
                      this.field_i.field_G = 0;
                    }
                  } else {
                    this.field_i.b((byte) -2);
                    this.field_i.field_v = false;
                    this.field_i = null;
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_D.c(-6624);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_c = -2;
            this.field_h = this.field_h + 1;
            this.field_D = null;
            if (this.c(20) != 0) {
              return false;
            }
            if (0 == this.e(20)) {
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

    private final void g(int param0) {
        try {
          String var4 = null;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          Exception var3 = null;
          if (null == this.field_D) {
            return;
          }
          try {
            this.field_o.field_o = 0;
            this.field_o.a(6, 6);
            this.field_o.b((byte) -106, 3);
            this.field_o.i(0, -95);
            this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
            if (param0 != -30001) {
              var4 = (String) null;
              tp.a((nh) null, (String) null, (String) null, -28);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_D.c(-6624);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_c = -2;
            this.field_D = null;
            this.field_h = this.field_h + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, float param1, String param2) {
        try {
          lj.field_e = param2;
          if (param0 != 10) {
            tp.h(-5);
          }
          lc.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tp.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          em var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          em var4_refLifetime1;
          var6 = DungeonAssault.field_K;
          try {
            if (null != this.field_D) {
              try {
                this.field_D.c(param2 ^ -6570);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_D = null;
            }
            this.field_D = (rk) (param0);
            this.g(-30001);
            this.a(param1, 5391);
            if (param2 != 118) {
              field_x = (String) null;
            }
            this.field_i = null;
            this.field_m.field_o = 0;
            while (true) {
              var4_ref = (em) (this.field_p.a(-8));
              if (var4_ref != null) {
                this.field_g.a(var4_ref, -32711);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (em) (this.field_s.a(121));
              if (var4_refLifetime1 != null) {
                this.field_d.a(var4_refLifetime1, -32711);
                continue;
              }
              break;
            }
            if (this.field_j != 0) {
              try {
                this.field_o.field_o = 0;
                this.field_o.a(6, 4);
                this.field_o.a(6, (int) this.field_j);
                this.field_o.a((byte) 63, 0);
                this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_D.c(-6624);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_D = null;
                this.field_c = -2;
                this.field_h = this.field_h + 1;
              }
            }
            this.field_a = 0;
            this.field_n = kd.c(-2456);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("tp.C(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        try {
          IOException iOException = null;
          ec stackIn_4_0 = null;
          int stackIn_4_1 = 0;
          int stackIn_5_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_D == null) {
            return;
          }
          try {
            this.field_o.field_o = 0;
            stackIn_4_0 = this.field_o;
            stackIn_4_1 = 6;
            if (param0) {
              stackIn_5_2 = 2;
            } else {
              stackIn_5_2 = 3;
            }
            ((ec) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2);
            this.field_o.a(0L, 836);
            this.field_D.b(this.field_o.field_m, false, 0, this.field_o.field_m.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_D.c(param1 - 12015);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_D = null;
            this.field_c = -2;
          }
          if (param1 != 5391) {
            field_x = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tp() {
    }

    final static eh a(nh param0, String param1, String param2, int param3) {
        int var7 = 0;
        eh stackIn_6_0 = null;
        eh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ec var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        eh var11 = null;
        eh var13 = null;
        byte[] var16 = null;
        var10 = DungeonAssault.field_K;
        try {
          var11 = new eh();
          var13 = var11;
          var13.field_i = param1;
          var13.field_b = param2;
          var13.field_d = param0;
          var16 = param0.a("config", param2 + "/" + param1, (byte) -128);
          var6 = new ec(var16);
          var13.field_c = (var16.length - 4) / 2;
          var13.field_j = new int[var13.field_c];
          var13.field_l = null;
          var13.field_f = 0;
          var13.field_k = new int[var13.field_c];
          var13.field_g = var6.k(0);
          var13.field_m = var6.k(0);
          for (var7 = 0; var13.field_c > var7; var7++) {
            var8 = var6.c(true);
            var9 = 10 * var6.c(true);
            var11.field_k[var7] = var8;
            var11.field_j[var7] = var9;
            var13.field_f = var13.field_f + var9;
          }
          if (param3 == -1998) {
            stackIn_8_0 = var13;
            return stackIn_8_0;
          }
          stackIn_6_0 = (eh) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("tp.Q(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_z = "Orb of Majesty";
        field_A = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
        field_u = "DUNGEON ASSAULT";
        field_C = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
        field_B = new ef();
        field_w = "Sort rooms by <%0>";
        field_y = new ad(2, 4, 4, 0);
        field_x = "This password contains your email address, and would be easy to guess";
    }
}
