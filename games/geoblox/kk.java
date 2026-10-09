/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk extends ji {
    static lh field_w;
    private ba field_u;
    static int field_t;
    static float field_x;
    static String field_v;
    static int[] field_s;

    public static void i(int param0) {
        field_s = null;
        if (param0 > -69) {
            return;
        }
        field_v = null;
        field_w = null;
    }

    final boolean a(byte param0) {
        try {
            int var2_int = 0;
            int stackIn_49_0 = 0;
            int stackIn_66_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            sd var2 = null;
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
            sd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            var16 = Geoblox.field_C;
            if (this.field_u != null) {
              var2_long = oa.a(-12520);
              var4 = (int)(-this.field_k + var2_long);
              if (var4 > 200) {
                var4 = 200;
              }
              this.field_k = var2_long;
              this.field_o = this.field_o + var4;
              if (this.field_o > 30000) {
                try {
                  this.field_u.b(param0 ^ -43);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.field_u = null;
              }
            }
            if (this.field_u == null) {
              if (this.a(-78) == 0 &&
                  0 == this.a(false)) {
                return true;
              }
              return false;
            }
            try {
              this.field_u.d(-108);
              var2 = (sd) ((Object) this.field_g.c((byte) 121));
              while (var2 != null) {
                this.field_m.field_f = 0;
                this.field_m.d((byte) -54, 1);
                this.field_m.a((byte) -127, var2.field_i);
                this.field_u.a(100, 0, this.field_m.field_j.length, this.field_m.field_j);
                this.field_e.a(-93, var2);
                var2 = (sd) ((Object) this.field_g.a(param0 ^ 41));
              }
              var2 = (sd) ((Object) this.field_p.c((byte) 121));
              if (param0 != 95) {
                this.e(-90);
              }
              while (var2 != null) {
                this.field_m.field_f = 0;
                this.field_m.d((byte) 8, 0);
                this.field_m.a((byte) -127, var2.field_i);
                this.field_u.a(100, 0, this.field_m.field_j.length, this.field_m.field_j);
                this.field_c.a(112, var2);
                var2 = (sd) ((Object) this.field_p.a(54));
              }
              for (var2_int = 0; var2_int < 100; var2_int++) {
                var3_int = this.field_u.a((byte) 82);
                if (var3_int < 0) {
                  throw new IOException();
                }
                if (var3_int == 0) {
                  return true;
                }
                this.field_o = 0;
                var4 = 0;
                if (this.field_f != null) {
                  if (this.field_f.field_D == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (0 >= var4) {
                  var5 = this.field_f.field_A.field_j.length - this.field_f.field_E;
                  var6 = 512 - this.field_f.field_D;
                  if (-this.field_f.field_A.field_f + var5 < var6) {
                    var6 = -this.field_f.field_A.field_f + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_u.a(this.field_f.field_A.field_j, (byte) -97, this.field_f.field_A.field_f, var6);
                  if (this.field_i != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var6 > var17) {
                      this.field_f.field_A.field_j[this.field_f.field_A.field_f + var17] = (byte)h.a((int) this.field_f.field_A.field_j[this.field_f.field_A.field_f + var17], (int) this.field_i);
                      var17++;
                    }
                  }
                  this.field_f.field_D = this.field_f.field_D + var6;
                  this.field_f.field_A.field_f = this.field_f.field_A.field_f + var6;
                  if (var5 == this.field_f.field_A.field_f) {
                    this.field_f.a((byte) 57);
                    this.field_f.field_u = false;
                    this.field_f = null;
                  } else {
                    if (this.field_f.field_D == 512) {
                      this.field_f.field_D = 0;
                    }
                  }
                } else {
                  var5 = -this.field_j.field_f + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_u.a(this.field_j.field_j, (byte) -97, this.field_j.field_f, var5);
                  if (this.field_i != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_j.field_j[this.field_j.field_f + var6] = (byte)h.a((int) this.field_j.field_j[this.field_j.field_f + var6], (int) this.field_i);
                    }
                  }
                  this.field_j.field_f = this.field_j.field_f + var5;
                  if (this.field_j.field_f >= var4) {
                    if (null == this.field_f) {
                      this.field_j.field_f = 0;
                      var6 = this.field_j.c((byte) 34);
                      var7 = this.field_j.a((byte) -90);
                      var8 = this.field_j.c((byte) 34);
                      var9 = this.field_j.a((byte) -61);
                      var10 = var8 & 127;
                      stackIn_49_0 = ((128 & var8) == 0) ? 0 : 1;
                      L18: {
                        boolean decompiledFrameCompleted0 = true;
                        var11 = stackIn_49_0;
                        var12 = (long)var7 + ((long)var6 << 32);
                        var14 = null;
                        if (var11 != 0) {
                          var14_ref = (sd) ((Object) this.field_c.c((byte) 121));
                          while (var14_ref != null) {
                            if (var12 == var14_ref.field_i) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                            var14_ref = (sd) ((Object) this.field_c.a(-30));
                          }
                          if (decompiledFrameCompleted0) {
                            break L18;
                          }
                        }
                        if (decompiledFrameCompleted0) {
                          var14_ref = (sd) ((Object) this.field_e.c((byte) 121));
                          while (var14_ref != null) {
                            if (~var12 == ~var14_ref.field_i) {
                              break;
                            }
                            var14_ref = (sd) ((Object) this.field_e.a(72));
                          }
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_f = var14_ref;
                      stackIn_66_0 = (0 != var10) ? 9 : 5;
                      var15 = stackIn_66_0;
                      this.field_f.field_A = new qc(var9 + var15 + this.field_f.field_E);
                      this.field_f.field_A.d((byte) -26, var10);
                      this.field_f.field_A.c((byte) 95, var9);
                      this.field_j.field_f = 0;
                      this.field_f.field_D = 10;
                    } else {
                      if (0 != this.field_f.field_D) {
                        throw new IOException();
                      }
                      if (-1 == this.field_j.field_j[0]) {
                        this.field_j.field_f = 0;
                        this.field_f.field_D = 1;
                      } else {
                        this.field_f = null;
                      }
                    }
                  }
                }
              }
              return true;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_u.b(-122);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_b = this.field_b + 1;
              this.field_q = -2;
              this.field_u = null;
              if (0 == this.a(param0 - 216) &&
                  this.a(false) == 0) {
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

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
              12 >= var3_int) {
            var4 = oe.a(param1, param2 ^ 122);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!gg.a((byte) -62, var4.charAt(0)) &&
                !gg.a((byte) -98, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (!gg.a((byte) -93, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                    !param0) {
                  return false;
                }
              }
              if (param2 != 118) {
                return false;
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("kk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    final static rh a(int param0, byte param1) {
        if (param1 != -62) {
            kk.i(118);
        }
        return am.a(param1 - 10, param0, false, 1, true, false);
    }

    public kk() {
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_28_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            sd var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = Geoblox.field_C;
            try {
              if (null != this.field_u) {
                try {
                  this.field_u.b(-120);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_u = null;
              }
              this.field_u = (ba) (param0);
              this.b((byte) -113);
              this.a(param1, param2);
              this.field_j.field_f = 0;
              this.field_f = null;
              while (true) {
                var4_ref = (sd) ((Object) this.field_e.a(true));
                if (var4_ref != null) {
                  this.field_g.a(-74, var4_ref);
                  continue;
                }
                break;
              }
              if (param1) {
                field_t = 110;
              }
              while (true) {
                var4_ref = (sd) ((Object) this.field_c.a(true));
                if (var4_ref != null) {
                  this.field_p.a(116, var4_ref);
                  continue;
                }
                break;
              }
              if (this.field_i != 0) {
                try {
                  this.field_m.field_f = 0;
                  this.field_m.d((byte) -62, 4);
                  this.field_m.d((byte) 122, (int) this.field_i);
                  this.field_m.c((byte) 95, 0);
                  this.field_u.a(100, 0, this.field_m.field_j.length, this.field_m.field_j);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var4_ref2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    this.field_u.b(-126);
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var5 = (Exception) (Object) decompiledCaughtException;
                  }
                  this.field_q = -2;
                  this.field_b = this.field_b + 1;
                  this.field_u = null;
                }
              }
              this.field_o = 0;
              this.field_k = oa.a(-12520);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_27_0 = var4_ref3;
              stackIn_27_1 = new StringBuilder().append("kk.C(");
              if (param0 == null) {
                stackIn_28_2 = "null";
              } else {
                stackIn_28_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        if (param0 > -50) {
            field_w = (lh) null;
        }
        if (this.field_u != null) {
            this.field_u.b(-123);
        }
    }

    private final void b(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            Exception var3 = null;
            if (this.field_u == null) {
              return;
            }
            try {
              this.field_m.field_f = 0;
              this.field_m.d((byte) 126, 6);
              this.field_m.b(-12, 3);
              this.field_m.e(0, 28695);
              this.field_u.a(100, 0, this.field_m.field_j.length, this.field_m.field_j);
              if (param0 > -56) {
                kk.a(-8, (byte) 62);
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_u.b(-121);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
              this.field_q = -2;
              this.field_b = this.field_b + 1;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void e(int param0) {
        try {
            this.field_u.b(param0 ^ -106);
        } catch (Exception exception) {
        }
        if (param0 != 20) {
            return;
        }
        this.field_b = this.field_b + 1;
        this.field_q = -1;
        this.field_u = null;
        this.field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void a(boolean param0, boolean param1) {
        try {
            qc stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            IOException var3 = null;
            Exception var4 = null;
            if (null == this.field_u) {
              return;
            }
            try {
              this.field_m.field_f = 0;
              stackIn_5_0 = this.field_m;
              stackIn_5_1 = 124;
              if (param1) {
                stackIn_6_2 = 2;
              } else {
                stackIn_6_2 = 3;
              }
              ((qc) (Object) stackIn_5_0).d((byte) stackIn_5_1, stackIn_6_2);
              this.field_m.a((byte) -127, 0L);
              this.field_u.a(100, 0, this.field_m.field_j.length, this.field_m.field_j);
              if (param0) {
                this.a(false, false);
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_u.b(-126);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
              this.field_q = -2;
              this.field_b = this.field_b + 1;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_w = new lh();
        field_v = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new int[]{1, 2, 5, 3, 3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 3, 10, 3};
    }
}
