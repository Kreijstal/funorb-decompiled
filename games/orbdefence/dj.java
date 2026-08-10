/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    private gl field_f;
    private int field_d;
    private long field_n;
    private long field_l;
    private long field_i;
    private byte[] field_g;
    private byte[] field_m;
    private long field_h;
    private long field_a;
    private long field_k;
    static String field_j;
    private int field_c;
    private static int[] field_b;
    static String field_e;

    final long b(int param0) {
        int var2 = -3 % ((49 - param0) / 57);
        return this.field_k;
    }

    private final void b(byte param0) throws IOException {
        long var2;
        int var7;
        long var4;
        int var6;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 68) {
          return;
        } else {
          L0: {
            if (-1L == this.field_h) {
              break L0;
            } else {
              L1: {
                if (this.field_i != this.field_h) {
                  this.field_f.a(param0 ^ -8965, this.field_h);
                  this.field_i = this.field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                this.field_f.a(0, (byte) 127, this.field_d, this.field_m);
                this.field_i = this.field_i + (long)this.field_d;
                if ((this.field_l ^ -1L) > (this.field_i ^ -1L)) {
                  this.field_l = this.field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if ((this.field_n ^ -1L) < (this.field_h ^ -1L)) {
                    break L4;
                  } else {
                    if ((this.field_h ^ -1L) > (this.field_n + (long)this.field_c ^ -1L)) {
                      var2 = this.field_h;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_n < this.field_h) {
                  break L3;
                } else {
                  if (this.field_n < (long)this.field_d + this.field_h) {
                    var2 = this.field_n;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((long)this.field_d + this.field_h ^ -1L) >= (this.field_n ^ -1L)) {
                    break L6;
                  } else {
                    if (this.field_n - -(long)this.field_c >= (long)this.field_d + this.field_h) {
                      var4 = this.field_h + (long)this.field_d;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((long)this.field_c + this.field_n <= this.field_h) {
                  break L5;
                } else {
                  if (this.field_n + (long)this.field_c > this.field_h - -(long)this.field_d) {
                    break L5;
                  } else {
                    var4 = (long)this.field_c + this.field_n;
                    break L5;
                  }
                }
              }
              L7: {
                if (-1L >= var2) {
                  break L7;
                } else {
                  if (var4 > var2) {
                    var6 = (int)(-var2 + var4);
                    mk.a(this.field_m, (int)(var2 - this.field_h), this.field_g, (int)(-this.field_n + var2), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_h = -1L;
              this.field_d = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        this.field_a = param0;
        if (param1 != -1) {
            this.field_h = -49L;
        }
    }

    final static void a(ki param0, byte param1, ki param2, ki param3) {
        hj var18 = null;
        qg[] var5 = null;
        qg[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        qg[] var15 = null;
        int var11_int = 0;
        hj var16 = null;
        hj var19 = null;
        hj var11 = null;
        hj var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = OrbDefence.field_D ? 1 : 0;
        try {
            sd.field_f = p.a(13863, "commonui", param2, "frame_top");
            he.field_y = p.a(13863, "commonui", param2, "frame_bottom");
            qe.field_c = fk.a(param2, "jagex_logo_grey", 91, "commonui");
            ea.field_b = p.a(13863, "commonui", param2, "button");
            wd.field_C = t.a("commonui", param2, "validation", -69);
            pc.field_bb = (kc) ((Object) wl.a("arezzo12", (byte) -124, "commonui", param2, param3));
            lm.field_f = (kc) ((Object) wl.a("arezzo14", (byte) -111, "commonui", param2, param3));
            if (param1 <= 91) {
                ki var14 = (ki) null;
                dj.a((ki) null, (byte) 9, (ki) null, (ki) null);
            }
            qc.field_b = (kc) ((Object) wl.a("arezzo14bold", (byte) -120, "commonui", param2, param3));
            var18 = new hj(param0.a("", 1, "button.gif"), (java.awt.Component) ((Object) tf.field_f));
            uc.a(false, "commonui", param2, "dropdown");
            var5 = fl.a(-9945, param2, "commonui", "screen_options");
            kk.field_P = new qg[4];
            dc.field_h = new qg[4];
            ck.field_n = new qg[4];
            var6 = new qg[][]{dc.field_h, kk.field_P, ck.field_n};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_k;
            for (var8 = 1; var20.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var20[0].clone());
            }
            var8 = var5[0].field_l[0];
            var20[2][var8] = 16777215;
            var20[1][var8] = 2394342;
            var20[3][var8] = 4767999;
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var15 = var6[var9];
                qg[] var10 = var15;
                for (var11_int = 0; var15.length > var11_int; var11_int++) {
                    var15[var11_int] = h.a(var5[var9], (byte) 37, var20[var11_int]);
                }
            }
            var9 = var18.field_k;
            h.k(126);
            var18.d();
            ul.h(0, 0, ul.field_f, ul.field_l);
            var16 = new hj(var9, var9);
            var19 = var16;
            var19.d();
            var18.b(0, 0);
            var11 = new hj(var9, var9);
            var11.d();
            var18.b(-var18.field_o + var9, 0);
            var12 = new hj(-(2 * var9) + var18.field_o, var9);
            var12.d();
            var18.b(-var9, 0);
            oc.g((byte) -105);
            ea.field_b = new hj[]{var16, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) throws IOException {
        this.b((byte) 68);
        this.field_f.d(26);
        int var2 = 0 / ((param0 - -41) / 51);
    }

    public static void c(byte param0) {
        field_j = null;
        field_e = null;
        field_b = null;
        if (param0 <= 72) {
            ki var2 = (ki) null;
            dj.a((ki) null, (byte) 47, (ki) null, (ki) null);
        }
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          this.field_c = 0;
          if (this.field_a != this.field_i) {
            this.field_f.a(-9025, this.field_a);
            this.field_i = this.field_a;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_n = this.field_a;
        L1: while (true) {
          L2: {
            if (this.field_g.length <= this.field_c) {
              break L2;
            } else {
              L3: {
                var2 = -this.field_c + this.field_g.length;
                if ((var2 ^ -1) >= -200000001) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = this.field_f.a(this.field_c, var2, -4837, this.field_g);
              if (var3 == -1) {
                break L2;
              } else {
                this.field_i = this.field_i + (long)var3;
                this.field_c = this.field_c + var3;
                continue L1;
              }
            }
          }
          L4: {
            if (param0 == 200000000) {
              break L4;
            } else {
              field_e = (String) null;
              break L4;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param3.length < param2 + param0) {
                  throw new ArrayIndexOutOfBoundsException(-param3.length + param0 + param2);
                } else {
                  L2: {
                    if (this.field_h == -1L) {
                      break L2;
                    } else {
                      if ((this.field_a ^ -1L) > (this.field_h ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_h + (long)this.field_d >= (long)param2 + this.field_a) {
                          mk.a(this.field_m, (int)(-this.field_h + this.field_a), param3, param0, param2);
                          this.field_a = this.field_a + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var7 = -113 / ((param1 - -65) / 40);
                    var5_long = this.field_a;
                    var8 = param0;
                    var9 = param2;
                    if (this.field_n > this.field_a) {
                      break L3;
                    } else {
                      if (this.field_a < (long)this.field_c + this.field_n) {
                        L4: {
                          var10_int = (int)((long)this.field_c + (this.field_n + -this.field_a));
                          if (var10_int <= param2) {
                            break L4;
                          } else {
                            var10_int = param2;
                            break L4;
                          }
                        }
                        mk.a(this.field_g, (int)(-this.field_n + this.field_a), param3, param0, var10_int);
                        this.field_a = this.field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        param0 = param0 + var10_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param2 > this.field_g.length) {
                      this.field_f.a(-9025, this.field_a);
                      this.field_i = this.field_a;
                      L6: while (true) {
                        if ((param2 ^ -1) >= -1) {
                          break L5;
                        } else {
                          var10_int = this.field_f.a(param0, param2, -4837, param3);
                          if (-1 == var10_int) {
                            break L5;
                          } else {
                            this.field_i = this.field_i + (long)var10_int;
                            param0 = param0 + var10_int;
                            this.field_a = this.field_a + (long)var10_int;
                            param2 = param2 - var10_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if (param2 > 0) {
                        L7: {
                          this.a(200000000);
                          var10_int = param2;
                          if (var10_int <= this.field_c) {
                            break L7;
                          } else {
                            var10_int = this.field_c;
                            break L7;
                          }
                        }
                        mk.a(this.field_g, 0, param3, param0, var10_int);
                        param0 = param0 + var10_int;
                        this.field_a = this.field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (-1L == this.field_h) {
                      break L8;
                    } else {
                      L9: {
                        if ((this.field_h ^ -1L) >= (this.field_a ^ -1L)) {
                          break L9;
                        } else {
                          if (0 >= param2) {
                            break L9;
                          } else {
                            L10: {
                              var10_int = param0 - -(int)(-this.field_a + this.field_h);
                              if (var10_int <= param0 + param2) {
                                break L10;
                              } else {
                                var10_int = param0 + param2;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var10_int <= param0) {
                                break L9;
                              } else {
                                param2--;
                                incrementValue$0 = param0;
                                param0++;
                                param3[incrementValue$0] = (byte) 0;
                                this.field_a = this.field_a + 1L;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var10 = -1L;
                          var12 = -1L;
                          if (var5_long > this.field_h) {
                            break L13;
                          } else {
                            if ((long)var9 + var5_long > this.field_h) {
                              var10 = this.field_h;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((var5_long ^ -1L) > (this.field_h ^ -1L)) {
                          break L12;
                        } else {
                          if ((var5_long ^ -1L) > (this.field_h - -(long)this.field_d ^ -1L)) {
                            var10 = var5_long;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (var5_long >= this.field_h - -(long)this.field_d) {
                            break L15;
                          } else {
                            if ((long)var9 + var5_long >= this.field_h - -(long)this.field_d) {
                              var12 = (long)this.field_d + this.field_h;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if ((long)var9 + var5_long <= this.field_h) {
                          break L14;
                        } else {
                          if ((this.field_h - -(long)this.field_d ^ -1L) > (var5_long + (long)var9 ^ -1L)) {
                            break L14;
                          } else {
                            var12 = var5_long + (long)var9;
                            break L14;
                          }
                        }
                      }
                      if (-1L >= var10) {
                        break L8;
                      } else {
                        if (var12 <= var10) {
                          break L8;
                        } else {
                          var14 = (int)(-var10 + var12);
                          mk.a(this.field_m, (int)(var10 + -this.field_h), param3, var8 + (int)(-var5_long + var10), var14);
                          if (var12 > this.field_a) {
                            param2 = (int)((long)param2 - (var12 + -this.field_a));
                            this.field_a = var12;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_i = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if ((param2 ^ -1) >= -1) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_60_0 = (RuntimeException) (var5_ref);

            stackIn_60_1 = new StringBuilder().append("dj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L16;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L16;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 4) {
            return;
        }
        try {
            this.a(0, (byte) -126, param0.length, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
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
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!param0) {
                  L2: {
                    if (((long)param2 + this.field_a ^ -1L) >= (this.field_k ^ -1L)) {
                      break L2;
                    } else {
                      this.field_k = this.field_a + (long)param2;
                      break L2;
                    }
                  }
                  L3: {
                    if (0L == (this.field_h ^ -1L)) {
                      break L3;
                    } else {
                      if ((this.field_a ^ -1L) <= (this.field_h ^ -1L)) {
                        if ((this.field_a ^ -1L) >= (this.field_h + (long)this.field_d ^ -1L)) {
                          break L3;
                        } else {
                          this.b((byte) 68);
                          break L3;
                        }
                      } else {
                        this.b((byte) 68);
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (0L == (this.field_h ^ -1L)) {
                      break L4;
                    } else {
                      if (((long)this.field_m.length + this.field_h ^ -1L) > (this.field_a - -(long)param2 ^ -1L)) {
                        var5_int = (int)((long)this.field_m.length + this.field_h + -this.field_a);
                        mk.a(param1, param3, this.field_m, (int)(this.field_a + -this.field_h), var5_int);
                        param3 = param3 + var5_int;
                        this.field_a = this.field_a + (long)var5_int;
                        param2 = param2 - var5_int;
                        this.field_d = this.field_m.length;
                        this.b((byte) 68);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (this.field_m.length < param2) {
                    L5: {
                      if (this.field_i == this.field_a) {
                        break L5;
                      } else {
                        this.field_f.a(-9025, this.field_a);
                        this.field_i = this.field_a;
                        break L5;
                      }
                    }
                    L6: {
                      this.field_f.a(param3, (byte) 0, param2, param1);
                      this.field_i = this.field_i + (long)param2;
                      if ((this.field_i ^ -1L) < (this.field_l ^ -1L)) {
                        this.field_l = this.field_i;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((this.field_a ^ -1L) > (this.field_n ^ -1L)) {
                          break L8;
                        } else {
                          if (this.field_n + (long)this.field_c > this.field_a) {
                            var5_long = this.field_a;
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (this.field_a > this.field_n) {
                        break L7;
                      } else {
                        if ((this.field_n ^ -1L) > ((long)param2 + this.field_a ^ -1L)) {
                          var5_long = this.field_n;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        if ((this.field_n ^ -1L) <= (this.field_a - -(long)param2 ^ -1L)) {
                          break L10;
                        } else {
                          if ((long)param2 + this.field_a <= (long)this.field_c + this.field_n) {
                            var7 = (long)param2 + this.field_a;
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (this.field_n - -(long)this.field_c <= this.field_a) {
                        break L9;
                      } else {
                        if ((this.field_a + (long)param2 ^ -1L) > ((long)this.field_c + this.field_n ^ -1L)) {
                          break L9;
                        } else {
                          var7 = (long)this.field_c + this.field_n;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (0L <= (var5_long ^ -1L)) {
                        break L11;
                      } else {
                        if (var7 <= var5_long) {
                          break L11;
                        } else {
                          var9 = (int)(var7 + -var5_long);
                          mk.a(param1, (int)((long)param3 - -var5_long - this.field_a), this.field_g, (int)(-this.field_n + var5_long), var9);
                          break L11;
                        }
                      }
                    }
                    this.field_a = this.field_a + (long)param2;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    if (-1 > (param2 ^ -1)) {
                      L12: {
                        if (-1L == this.field_h) {
                          this.field_h = this.field_a;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        mk.a(param1, param3, this.field_m, (int)(this.field_a - this.field_h), param2);
                        this.field_a = this.field_a + (long)param2;
                        if (((long)this.field_d ^ -1L) <= (-this.field_h + this.field_a ^ -1L)) {
                          break L13;
                        } else {
                          this.field_d = (int)(-this.field_h + this.field_a);
                          break L13;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_i = -1L;
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
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var5_ref);

            stackIn_55_1 = new StringBuilder().append("dj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L14;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L14;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param2 + ',' + param3 + ')');
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

    dj(gl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = 0;
        this.field_h = -1L;
        this.field_n = -1L;
        try {
            this.field_f = param0;
            dupTemp$0 = param0.a(1);
            this.field_l = dupTemp$0;
            this.field_k = dupTemp$0;
            this.field_g = new byte[param1];
            this.field_a = 0L;
            this.field_m = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Error connecting to server. Please try using a different server.";
        field_b = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var6 = (long)(1 + (var0 << 2098107521));
            var4 = (long)((var0 << 815378913) + -1);
            var2 = (int)(-32768L + (var4 * var4 >> 2135928146));
            var3 = (int)(-32768L + (var6 * var6 >> -1039789486));
            if (field_b.length <= var3) {
                var3 = field_b.length + -1;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_b[var1] = var0;
            }
        }
        field_e = "Orb Points";
    }
}
