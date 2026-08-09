/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn {
    private int field_m;
    private byte[] field_d;
    private long field_i;
    private ee field_j;
    static String field_n;
    private long field_f;
    static int field_p;
    static bd field_o;
    private int field_a;
    private long field_g;
    private long field_k;
    static bd field_l;
    private byte[] field_e;
    private long field_h;
    static int[] field_b;
    private long field_c;

    final long d(int param0) {
        int var2 = 76 % ((param0 - 55) / 48);
        return this.field_f;
    }

    final static String b(int param0) {
        int var1 = -119 % ((25 - param0) / 59);
        String var2 = "";
        if (null != ib.field_e) {
            var2 = ib.field_e.k(80);
        }
        if (!(var2.length() != 0)) {
            var2 = aj.b(-30519);
        }
        if (0 == var2.length()) {
            var2 = vg.field_g;
        }
        return var2;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_f < this.field_h - -(long)param0) {
                    this.field_f = (long)param0 + this.field_h;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param3 >= 32) {
                  L3: {
                    if (0L == (this.field_i ^ -1L)) {
                      break L3;
                    } else {
                      L4: {
                        if (this.field_h < this.field_i) {
                          break L4;
                        } else {
                          if ((this.field_i - -(long)this.field_m ^ -1L) > (this.field_h ^ -1L)) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.e(-1);
                      break L3;
                    }
                  }
                  L5: {
                    if ((this.field_i ^ -1L) == 0L) {
                      break L5;
                    } else {
                      if (((long)param0 + this.field_h ^ -1L) >= (this.field_i + (long)this.field_e.length ^ -1L)) {
                        break L5;
                      } else {
                        var5_int = (int)(-this.field_h + (this.field_i + (long)this.field_e.length));
                        kf.a(param2, param1, this.field_e, (int)(this.field_h - this.field_i), var5_int);
                        param1 = param1 + var5_int;
                        this.field_h = this.field_h + (long)var5_int;
                        param0 = param0 - var5_int;
                        this.field_m = this.field_e.length;
                        this.e(-1);
                        break L5;
                      }
                    }
                  }
                  if (param0 <= this.field_e.length) {
                    if (-1 <= (param0 ^ -1)) {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    } else {
                      L6: {
                        if (0L != (this.field_i ^ -1L)) {
                          break L6;
                        } else {
                          this.field_i = this.field_h;
                          break L6;
                        }
                      }
                      L7: {
                        kf.a(param2, param1, this.field_e, (int)(this.field_h + -this.field_i), param0);
                        this.field_h = this.field_h + (long)param0;
                        if (((long)this.field_m ^ -1L) > (this.field_h - this.field_i ^ -1L)) {
                          this.field_m = (int)(this.field_h - this.field_i);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    }
                  } else {
                    L8: {
                      if (this.field_k == this.field_h) {
                        break L8;
                      } else {
                        this.field_j.a(-18127, this.field_h);
                        this.field_k = this.field_h;
                        break L8;
                      }
                    }
                    L9: {
                      this.field_j.a(0, param2, param1, param0);
                      this.field_k = this.field_k + (long)param0;
                      if ((this.field_g ^ -1L) > (this.field_k ^ -1L)) {
                        this.field_g = this.field_k;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      L11: {
                        var5_long = -1L;
                        if (this.field_c > this.field_h) {
                          break L11;
                        } else {
                          if (this.field_c - -(long)this.field_a <= this.field_h) {
                            break L11;
                          } else {
                            var5_long = this.field_h;
                            break L10;
                          }
                        }
                      }
                      if ((this.field_h ^ -1L) < (this.field_c ^ -1L)) {
                        break L10;
                      } else {
                        if ((this.field_c ^ -1L) <= ((long)param0 + this.field_h ^ -1L)) {
                          break L10;
                        } else {
                          var5_long = this.field_c;
                          break L10;
                        }
                      }
                    }
                    L12: {
                      L13: {
                        var7 = -1L;
                        if ((this.field_c ^ -1L) <= ((long)param0 + this.field_h ^ -1L)) {
                          break L13;
                        } else {
                          if (((long)this.field_a + this.field_c ^ -1L) > (this.field_h - -(long)param0 ^ -1L)) {
                            break L13;
                          } else {
                            var7 = (long)param0 + this.field_h;
                            break L12;
                          }
                        }
                      }
                      if ((this.field_h ^ -1L) <= (this.field_c - -(long)this.field_a ^ -1L)) {
                        break L12;
                      } else {
                        if ((this.field_h - -(long)param0 ^ -1L) > ((long)this.field_a + this.field_c ^ -1L)) {
                          break L12;
                        } else {
                          var7 = (long)this.field_a + this.field_c;
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (-1L >= var5_long) {
                        break L14;
                      } else {
                        if (var7 > var5_long) {
                          var9 = (int)(-var5_long + var7);
                          kf.a(param2, (int)(-this.field_h + ((long)param1 + var5_long)), this.field_d, (int)(var5_long + -this.field_c), var9);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    this.field_h = this.field_h + (long)param0;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5_ref);

            stackIn_50_1 = new StringBuilder().append("bn.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void f(int param0) throws IOException {
        this.e(-1);
        this.field_j.c(-1);
        if (param0 != 0) {
            bn.a(true);
        }
    }

    private final void e(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_i != (long)param0) {
            L1: {
              if ((this.field_i ^ -1L) != (this.field_k ^ -1L)) {
                this.field_j.a(-18127, this.field_i);
                this.field_k = this.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_j.a(0, this.field_e, 0, this.field_m);
              this.field_k = this.field_k + (long)this.field_m;
              if (this.field_g >= this.field_k) {
                break L2;
              } else {
                this.field_g = this.field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_c ^ -1L) < (this.field_i ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_i < this.field_c + (long)this.field_a) {
                    var2 = this.field_i;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (this.field_c < this.field_i) {
                break L3;
              } else {
                if ((long)this.field_m + this.field_i > this.field_c) {
                  var2 = this.field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((this.field_c ^ -1L) <= (this.field_i + (long)this.field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((this.field_c + (long)this.field_a ^ -1L) > (this.field_i - -(long)this.field_m ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)this.field_m + this.field_i;
                    break L5;
                  }
                }
              }
              if (this.field_i >= (long)this.field_a + this.field_c) {
                break L5;
              } else {
                if (this.field_i - -(long)this.field_m >= this.field_c + (long)this.field_a) {
                  var4 = (long)this.field_a + this.field_c;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  kf.a(this.field_e, (int)(-this.field_i + var2), this.field_d, (int)(-this.field_c + var2), var6);
                  break L7;
                }
              }
            }
            this.field_m = 0;
            this.field_i = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 >= -65) {
            return;
        }
        try {
            this.a(param0, (byte) -75, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bn.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        this.field_a = 0;
        if (param0 != 13740) {
            this.field_c = -22L;
        }
        if (this.field_h != this.field_k) {
            this.field_j.a(param0 + -31867, this.field_h);
            this.field_k = this.field_h;
        }
        this.field_c = this.field_h;
        while (this.field_a < this.field_d.length) {
            var2 = this.field_d.length + -this.field_a;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = this.field_j.a(this.field_d, false, var2, this.field_a);
            if ((var3 ^ -1) == 0) {
                break;
            }
            this.field_a = this.field_a + var3;
            this.field_k = this.field_k + (long)var3;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_l = null;
        field_n = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, p param2, int param3) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var4_int = 0;
        int var7 = 0;
        int var10 = 0;
        int var6 = 0;
        int var5 = 0;
        int var8 = 0;
        int var11 = 0;
        int var9 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = HostileSpawn.field_I ? 1 : 0;
        try {
            if (!param0) {
                field_n = (String) null;
            }
            var12 = uj.field_p.field_e + 32;
            var13 = uj.field_p.field_g + 12;
            var14 = -var12 + am.field_e;
            var15 = jg.field_l + -var13;
            var4_int = var14 << 444801026;
            var7 = param1 << 303437250;
            var10 = 1;
            var6 = param3 << -1506850590;
            var5 = var15 << 301346338;
            var8 = 8;
            var11 = 1;
            var9 = 16;
            var16 = (32 + -param2.field_e) * 200 / 32;
            var17 = (int)((double)var8 / 1.0);
            var18 = (int)((double)var9 / 1.2);
            var19 = 62.83185307179586 + param2.field_c;
            var21 = 12.0;
            var23 = 3.141592653589793 * var19 / 128.0;
            var25 = (int)(Math.sin(var23) * -var21);
            var26 = (int)(-var21 * Math.cos(var23));
            for (var27 = 0; var27 < 255; var27++) {
                var28 = 3 * (var27 + -128);
                if (!((var28 ^ -1) >= -256)) {
                    var28 = 255;
                }
                if (!(-1 >= (var28 ^ -1))) {
                    var28 = 0;
                }
                cn.field_e[var27] = 256 * var27 - -var28;
            }
            km.a((byte) var10, var26 + var7, var5 + var26, ni.field_c, var9, var25 + var6, (byte) var11, 85, var4_int - -var25, var16, var8);
            bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4_int - -var25, var5 - -var26, var7 - -var26, var18, var16, var6 - -var25, 9233);
            km.a((byte) var10, -var26 + var7, var5 + -var26, ni.field_c, var9, var6 - var25, (byte) var11, 117, -var25 + var4_int, var16, var8);
            bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4_int + -var25, -var26 + var5, -var26 + var7, var18, var16, -var25 + var6, 9233);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bn.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != -1) {
            field_n = (String) null;
        }
        if (p.field_a != null) {
            return p.field_a;
        }
        return (java.applet.Applet) ((Object) te.field_E);
    }

    final static void a(int param0, oj param1) {
        try {
            if (param0 != 3) {
                p var3 = (p) null;
                bn.a(false, -123, (p) null, 64);
            }
            ue.a(param1.field_M, false);
            param1.field_M = 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bn.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 < 83) {
            p var5 = (p) null;
            bn.a(false, 118, (p) null, 42);
        }
        this.field_h = param0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
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
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param3 + param2 > param0.length) {
                  throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
                } else {
                  L2: {
                    if ((this.field_i ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if (this.field_h < this.field_i) {
                        break L2;
                      } else {
                        if ((long)param3 + this.field_h > this.field_i + (long)this.field_m) {
                          break L2;
                        } else {
                          kf.a(this.field_e, (int)(-this.field_i + this.field_h), param0, param2, param3);
                          this.field_h = this.field_h + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_h;
                    var7 = param2;
                    var8 = param3;
                    if ((this.field_c ^ -1L) < (this.field_h ^ -1L)) {
                      break L3;
                    } else {
                      if ((this.field_c + (long)this.field_a ^ -1L) >= (this.field_h ^ -1L)) {
                        break L3;
                      } else {
                        L4: {
                          var9_int = (int)(-this.field_h + this.field_c + (long)this.field_a);
                          if (param3 >= var9_int) {
                            break L4;
                          } else {
                            var9_int = param3;
                            break L4;
                          }
                        }
                        kf.a(this.field_d, (int)(this.field_h - this.field_c), param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param3 = param3 - var9_int;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param3 <= this.field_d.length) {
                      if (param3 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          this.a(13740);
                          var9_int = param3;
                          if (this.field_a >= var9_int) {
                            break L6;
                          } else {
                            var9_int = this.field_a;
                            break L6;
                          }
                        }
                        kf.a(this.field_d, 0, param0, param2, var9_int);
                        param3 = param3 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        break L5;
                      }
                    } else {
                      this.field_j.a(-18127, this.field_h);
                      this.field_k = this.field_h;
                      L7: while (true) {
                        if (param3 <= 0) {
                          break L5;
                        } else {
                          var9_int = this.field_j.a(param0, false, param3, param2);
                          if ((var9_int ^ -1) == 0) {
                            break L5;
                          } else {
                            this.field_k = this.field_k + (long)var9_int;
                            this.field_h = this.field_h + (long)var9_int;
                            param2 = param2 + var9_int;
                            param3 = param3 - var9_int;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (-1L == this.field_i) {
                      break L8;
                    } else {
                      L9: {
                        if (this.field_h >= this.field_i) {
                          break L9;
                        } else {
                          if (param3 > 0) {
                            L10: {
                              var9_int = (int)(-this.field_h + this.field_i) + param2;
                              if (var9_int > param2 - -param3) {
                                var9_int = param3 + param2;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (param2 >= var9_int) {
                                break L9;
                              } else {
                                incrementValue$0 = param2;
                                param2++;
                                param0[incrementValue$0] = (byte) 0;
                                param3--;
                                this.field_h = this.field_h + 1L;
                                continue L11;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var9 = -1L;
                          if (this.field_i < var5_long) {
                            break L13;
                          } else {
                            if (this.field_i < var5_long + (long)var8) {
                              var9 = this.field_i;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((this.field_i ^ -1L) < (var5_long ^ -1L)) {
                          break L12;
                        } else {
                          if ((var5_long ^ -1L) > (this.field_i - -(long)this.field_m ^ -1L)) {
                            var9 = var5_long;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          var11 = -1L;
                          if (var5_long >= (long)this.field_m + this.field_i) {
                            break L15;
                          } else {
                            if ((this.field_i + (long)this.field_m ^ -1L) >= (var5_long - -(long)var8 ^ -1L)) {
                              var11 = (long)this.field_m + this.field_i;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if ((this.field_i ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                          break L14;
                        } else {
                          if (this.field_i + (long)this.field_m >= var5_long - -(long)var8) {
                            var11 = var5_long + (long)var8;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (0L <= (var9 ^ -1L)) {
                        break L8;
                      } else {
                        if (var11 > var9) {
                          var13 = (int)(var11 + -var9);
                          kf.a(this.field_e, (int)(var9 + -this.field_i), param0, var7 - -(int)(-var5_long + var9), var13);
                          if ((this.field_h ^ -1L) <= (var11 ^ -1L)) {
                            break L8;
                          } else {
                            param3 = (int)((long)param3 - (-this.field_h + var11));
                            this.field_h = var11;
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L16: {
                    if (param1 < -17) {
                      break L16;
                    } else {
                      bn.a(false);
                      break L16;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (-1 > (param3 ^ -1)) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var5_ref);

            stackIn_63_1 = new StringBuilder().append("bn.K(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L17;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L17;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    bn(ee param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = 0;
        this.field_i = -1L;
        this.field_c = -1L;
        try {
            this.field_j = param0;
            dupTemp$0 = param0.a(-1);
            this.field_g = dupTemp$0;
            this.field_f = dupTemp$0;
            this.field_e = new byte[param2];
            this.field_d = new byte[param1];
            this.field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_n = "This rocket launcher will help me get past blast doors and turrets.";
    }
}
