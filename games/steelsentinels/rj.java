/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    private long field_a;
    static int field_j;
    private long field_e;
    private int field_g;
    static cm field_d;
    private long field_i;
    private long field_o;
    private sn field_q;
    private byte[] field_n;
    private long field_l;
    private byte[] field_p;
    static String field_c;
    private long field_f;
    static int field_b;
    static String[] field_m;
    private int field_h;
    static cm field_k;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$1 = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            try {
              L1: {
                if (param2 + param3 > param1.length) {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param3));
                } else {
                  L2: {
                    if (-1L == this.field_a) {
                      break L2;
                    } else {
                      if (this.field_l < this.field_a) {
                        break L2;
                      } else {
                        if ((long)param2 + this.field_l <= (long)this.field_h + this.field_a) {
                          ii.a(this.field_p, (int)(-this.field_a + this.field_l), param1, param3, param2);
                          this.field_l = this.field_l + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_l;
                    var7 = param3;
                    var8 = param2;
                    if ((this.field_l ^ -1L) > (this.field_i ^ -1L)) {
                      break L3;
                    } else {
                      if (((long)this.field_g + this.field_i ^ -1L) < (this.field_l ^ -1L)) {
                        L4: {
                          var9_int = (int)((long)this.field_g + -this.field_l - -this.field_i);
                          if (var9_int > param2) {
                            var9_int = param2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ii.a(this.field_n, (int)(this.field_l + -this.field_i), param1, param3, var9_int);
                        param3 = param3 + var9_int;
                        this.field_l = this.field_l + (long)var9_int;
                        param2 = param2 - var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param2 > this.field_n.length) {
                      this.field_q.a(this.field_l, -1);
                      this.field_e = this.field_l;
                      L6: while (true) {
                        if ((param2 ^ -1) >= -1) {
                          break L5;
                        } else {
                          var9_int = this.field_q.a(param1, param3, param2, false);
                          if (var9_int == -1) {
                            break L5;
                          } else {
                            param2 = param2 - var9_int;
                            param3 = param3 + var9_int;
                            this.field_l = this.field_l + (long)var9_int;
                            this.field_e = this.field_e + (long)var9_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if ((param2 ^ -1) < -1) {
                        L7: {
                          this.b(-84);
                          var9_int = param2;
                          if (this.field_g < var9_int) {
                            var9_int = this.field_g;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ii.a(this.field_n, 0, param1, param3, var9_int);
                        param3 = param3 + var9_int;
                        param2 = param2 - var9_int;
                        this.field_l = this.field_l + (long)var9_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if ((this.field_a ^ -1L) == 0L) {
                      break L8;
                    } else {
                      L9: {
                        if (this.field_l >= this.field_a) {
                          break L9;
                        } else {
                          if (param2 <= 0) {
                            break L9;
                          } else {
                            L10: {
                              var9_int = param3 + (int)(-this.field_l + this.field_a);
                              if (param3 - -param2 < var9_int) {
                                var9_int = param2 + param3;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (param3 >= var9_int) {
                                break L9;
                              } else {
                                incrementValue$1 = param3;
                                param3++;
                                param1[incrementValue$1] = (byte) 0;
                                param2--;
                                this.field_l = this.field_l + 1L;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var9 = -1L;
                          if (this.field_a < var5_long) {
                            break L13;
                          } else {
                            if (this.field_a < (long)var8 + var5_long) {
                              var9 = this.field_a;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((var5_long ^ -1L) > (this.field_a ^ -1L)) {
                          break L12;
                        } else {
                          if (this.field_a - -(long)this.field_h > var5_long) {
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
                          if ((long)this.field_h + this.field_a <= var5_long) {
                            break L15;
                          } else {
                            if ((this.field_a + (long)this.field_h ^ -1L) < ((long)var8 + var5_long ^ -1L)) {
                              break L15;
                            } else {
                              var11 = (long)this.field_h + this.field_a;
                              break L14;
                            }
                          }
                        }
                        if (var5_long - -(long)var8 <= this.field_a) {
                          break L14;
                        } else {
                          if ((this.field_a + (long)this.field_h ^ -1L) > (var5_long + (long)var8 ^ -1L)) {
                            break L14;
                          } else {
                            var11 = (long)var8 + var5_long;
                            break L14;
                          }
                        }
                      }
                      if (-1L >= var9) {
                        break L8;
                      } else {
                        if (var9 >= var11) {
                          break L8;
                        } else {
                          var13 = (int)(-var9 + var11);
                          ii.a(this.field_p, (int)(var9 + -this.field_a), param1, var7 - -(int)(-var5_long + var9), var13);
                          if ((this.field_l ^ -1L) > (var11 ^ -1L)) {
                            param2 = (int)((long)param2 - (-this.field_l + var11));
                            this.field_l = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  L16: {
                    if (param0 == 115) {
                      break L16;
                    } else {
                      this.field_o = -101L;
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
              this.field_e = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (-1 <= (param2 ^ -1)) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) (var5_ref);
            stackOut_62_1 = new StringBuilder().append("rj.B(").append(param0).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L17;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        java.applet.Applet var8 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          if ((this.field_a ^ -1L) != 0L) {
            L1: {
              if ((this.field_a ^ -1L) != (this.field_e ^ -1L)) {
                this.field_q.a(this.field_a, -1);
                this.field_e = this.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_q.a(this.field_h, 1, this.field_p, 0);
              this.field_e = this.field_e + (long)this.field_h;
              if ((this.field_f ^ -1L) > (this.field_e ^ -1L)) {
                this.field_f = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (this.field_i > this.field_a) {
                  break L4;
                } else {
                  if ((this.field_a ^ -1L) <= ((long)this.field_g + this.field_i ^ -1L)) {
                    break L4;
                  } else {
                    var2 = this.field_a;
                    break L3;
                  }
                }
              }
              if (this.field_a > this.field_i) {
                break L3;
              } else {
                if ((this.field_i ^ -1L) > (this.field_a + (long)this.field_h ^ -1L)) {
                  var2 = this.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((long)this.field_h + this.field_a <= this.field_i) {
                  break L6;
                } else {
                  if ((long)this.field_h + this.field_a <= (long)this.field_g + this.field_i) {
                    var4 = this.field_a - -(long)this.field_h;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (this.field_i + (long)this.field_g <= this.field_a) {
                break L5;
              } else {
                if (this.field_a - -(long)this.field_h < (long)this.field_g + this.field_i) {
                  break L5;
                } else {
                  var4 = (long)this.field_g + this.field_i;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  ii.a(this.field_p, (int)(-this.field_a + var2), this.field_n, (int)(-this.field_i + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_h = 0;
            this.field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 < -43) {
            break L8;
          } else {
            var8 = (java.applet.Applet) null;
            rj.a((String) null, (java.applet.Applet) null, (byte) -111);
            break L8;
          }
        }
    }

    final long a(byte param0) {
        int var2 = -54 / ((param0 - 45) / 43);
        return this.field_o;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qd var5_ref_qd = null;
        int var6 = 0;
        qd var6_ref_qd = null;
        int var7_int = 0;
        gh var7 = null;
        qd var8 = null;
        int var8_int = 0;
        gh var8_ref = null;
        gh var9 = null;
        int var10_int = 0;
        gh var10 = null;
        int var11_int = 0;
        gh var11 = null;
        gh var12 = null;
        int var12_int = 0;
        nk var13_ref_nk = null;
        int var13 = 0;
        Object var14 = null;
        int var14_int = 0;
        Object var15 = null;
        gh var16 = null;
        int var16_int = 0;
        int[] var16_array = null;
        int var17 = 0;
        Object var17_ref = null;
        int var18 = 0;
        int[] var18_ref_int__ = null;
        int var19 = 0;
        int var20_int = 0;
        gh var20 = null;
        gh var21 = null;
        int var21_int = 0;
        lb var23 = null;
        int var25 = 0;
        int var26_int = 0;
        gh var26 = null;
        Object var27_ref = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int var32 = 0;
        qd var34 = null;
        nk var35 = null;
        qd var36 = null;
        kg var37 = null;
        kg var38 = null;
        gh var39 = null;
        gh var40 = null;
        gh var41 = null;
        gh var42 = null;
        gh var43 = null;
        jc var46 = null;
        gh var47 = null;
        gh var48 = null;
        gh var49 = null;
        gh var50 = null;
        jc var51 = null;
        gh var52 = null;
        gh var53 = null;
        gh var54 = null;
        gh var55 = null;
        gh var56 = null;
        gh var57 = null;
        gh var58 = null;
        gh var59 = null;
        kg var61 = null;
        gh var62 = null;
        gh var63 = null;
        gh var64 = null;
        gh var65 = null;
        kg var66 = null;
        gh var67 = null;
        kg var68 = null;
        int[] var77 = null;
        int[] var78 = null;
        int[] var79 = null;
        int[][] var80 = null;
        Object var81 = null;
        Object var82 = null;
        Object var83 = null;
        CharSequence var84 = null;
        CharSequence var85 = null;
        CharSequence var86 = null;
        int stackIn_18_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_296_0 = 0;
        gh stackIn_333_0 = null;
        int stackIn_346_0 = 0;
        int stackIn_346_1 = 0;
        int stackIn_347_0 = 0;
        int stackIn_347_1 = 0;
        int stackIn_348_0 = 0;
        int stackIn_348_1 = 0;
        int stackIn_348_2 = 0;
        int stackIn_372_0 = 0;
        Object stackIn_431_0 = null;
        int stackIn_431_1 = 0;
        String[] stackIn_431_2 = null;
        String[] stackIn_431_3 = null;
        int stackIn_431_4 = 0;
        Object stackIn_432_0 = null;
        int stackIn_432_1 = 0;
        String[] stackIn_432_2 = null;
        String[] stackIn_432_3 = null;
        int stackIn_432_4 = 0;
        Object stackIn_433_0 = null;
        int stackIn_433_1 = 0;
        String[] stackIn_433_2 = null;
        String[] stackIn_433_3 = null;
        int stackIn_433_4 = 0;
        String stackIn_433_5 = null;
        int stackIn_452_0 = 0;
        gh stackIn_488_0 = null;
        gh stackIn_488_1 = null;
        String stackIn_488_2 = null;
        gh stackIn_489_0 = null;
        gh stackIn_489_1 = null;
        String stackIn_489_2 = null;
        gh stackIn_490_0 = null;
        gh stackIn_490_1 = null;
        String stackIn_490_2 = null;
        gh stackIn_490_3 = null;
        gh stackIn_491_0 = null;
        wk[] stackIn_491_1 = null;
        int stackIn_491_2 = 0;
        gh stackIn_492_0 = null;
        wk[] stackIn_492_1 = null;
        int stackIn_492_2 = 0;
        gh stackIn_493_0 = null;
        wk[] stackIn_493_1 = null;
        int stackIn_493_2 = 0;
        int stackIn_493_3 = 0;
        int stackIn_546_0 = 0;
        gh stackIn_549_0 = null;
        int stackIn_549_1 = 0;
        int stackIn_549_2 = 0;
        int stackIn_549_3 = 0;
        gh stackIn_550_0 = null;
        int stackIn_550_1 = 0;
        int stackIn_550_2 = 0;
        int stackIn_550_3 = 0;
        gh stackIn_551_0 = null;
        int stackIn_551_1 = 0;
        int stackIn_551_2 = 0;
        int stackIn_551_3 = 0;
        int stackIn_551_4 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        Object stackOut_430_0 = null;
        int stackOut_430_1 = 0;
        String[] stackOut_430_2 = null;
        String[] stackOut_430_3 = null;
        int stackOut_430_4 = 0;
        Object stackOut_432_0 = null;
        int stackOut_432_1 = 0;
        String[] stackOut_432_2 = null;
        String[] stackOut_432_3 = null;
        int stackOut_432_4 = 0;
        String stackOut_432_5 = null;
        Object stackOut_431_0 = null;
        int stackOut_431_1 = 0;
        String[] stackOut_431_2 = null;
        String[] stackOut_431_3 = null;
        int stackOut_431_4 = 0;
        String stackOut_431_5 = null;
        Object stackOut_332_0 = null;
        gh stackOut_331_0 = null;
        int stackOut_345_0 = 0;
        int stackOut_345_1 = 0;
        int stackOut_347_0 = 0;
        int stackOut_347_1 = 0;
        int stackOut_347_2 = 0;
        int stackOut_346_0 = 0;
        int stackOut_346_1 = 0;
        int stackOut_346_2 = 0;
        int stackOut_371_0 = 0;
        int stackOut_370_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_451_0 = 0;
        int stackOut_450_0 = 0;
        int stackOut_545_0 = 0;
        int stackOut_544_0 = 0;
        gh stackOut_548_0 = null;
        int stackOut_548_1 = 0;
        int stackOut_548_2 = 0;
        int stackOut_548_3 = 0;
        gh stackOut_550_0 = null;
        int stackOut_550_1 = 0;
        int stackOut_550_2 = 0;
        int stackOut_550_3 = 0;
        int stackOut_550_4 = 0;
        gh stackOut_549_0 = null;
        int stackOut_549_1 = 0;
        int stackOut_549_2 = 0;
        int stackOut_549_3 = 0;
        int stackOut_549_4 = 0;
        gh stackOut_487_0 = null;
        gh stackOut_487_1 = null;
        String stackOut_487_2 = null;
        gh stackOut_489_0 = null;
        gh stackOut_489_1 = null;
        String stackOut_489_2 = null;
        gh stackOut_489_3 = null;
        gh stackOut_488_0 = null;
        gh stackOut_488_1 = null;
        String stackOut_488_2 = null;
        Object stackOut_488_3 = null;
        gh stackOut_490_0 = null;
        wk[] stackOut_490_1 = null;
        int stackOut_490_2 = 0;
        gh stackOut_492_0 = null;
        wk[] stackOut_492_1 = null;
        int stackOut_492_2 = 0;
        int stackOut_492_3 = 0;
        gh stackOut_491_0 = null;
        wk[] stackOut_491_1 = null;
        int stackOut_491_2 = 0;
        int stackOut_491_3 = 0;
        var81 = null;
        var82 = null;
        var83 = null;
        var32 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (ti.field_B == null) {
                if ((ij.field_Y ^ -1) <= -1) {
                  var2 = 16;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var2 = 100;
                break L1;
              }
            }
            L2: {
              if (null != bl.field_c) {
                if (bl.field_c.field_Rb <= oh.field_f) {
                  if (var2 + bl.field_c.field_Rb + bl.field_c.field_zb > oh.field_f) {
                    if (bl.field_c.field_cb <= pi.field_c) {
                      if (bl.field_c.field_Lb + bl.field_c.field_cb <= pi.field_c) {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L2;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_18_0 = stackOut_15_0;
                        break L2;
                      }
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_18_0 = stackOut_13_0;
                      break L2;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_18_0 = stackOut_11_0;
                    break L2;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_18_0 = stackOut_9_0;
                  break L2;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_18_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = stackIn_18_0;
                if (var3 != 0) {
                  break L4;
                } else {
                  if (sn.field_l) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              kf.field_s = true;
              break L3;
            }
            L5: {
              sn.field_l = var3 != 0;
              if (kk.field_a != null) {
                if (oh.field_f >= kk.field_a.field_Rb) {
                  if (kk.field_a.field_zb + kk.field_a.field_Rb > oh.field_f) {
                    if (kk.field_a.field_cb <= pi.field_c) {
                      if (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) {
                        stackOut_32_0 = 0;
                        stackIn_34_0 = stackOut_32_0;
                        break L5;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_34_0 = stackOut_31_0;
                        break L5;
                      }
                    } else {
                      stackOut_29_0 = 0;
                      stackIn_34_0 = stackOut_29_0;
                      break L5;
                    }
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_34_0 = stackOut_27_0;
                    break L5;
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_34_0 = stackOut_25_0;
                  break L5;
                }
              } else {
                stackOut_23_0 = 0;
                stackIn_34_0 = stackOut_23_0;
                break L5;
              }
            }
            L6: {
              L7: {
                var4 = stackIn_34_0;
                if (var4 != 0) {
                  break L7;
                } else {
                  if (!nl.field_X) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              lg.field_l = true;
              break L6;
            }
            L8: {
              if (-1 >= (dc.field_g ^ -1)) {
                kf.field_s = true;
                lg.field_l = true;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              nl.field_X = var4 != 0;
              if (qa.field_M == 0) {
                break L9;
              } else {
                if (57 != qa.field_M) {
                  lg.field_l = true;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if ((fg.field_Ob ^ -1) != -2) {
                qa.field_M = Math.max(qa.field_M - 6, 0);
                break L10;
              } else {
                qa.field_M = Math.min(qa.field_M - -6, 57);
                break L10;
              }
            }
            L11: {
              if (qa.field_M == 0) {
                break L11;
              } else {
                if ((qa.field_M ^ -1) != -58) {
                  lg.field_l = true;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (null == hl.field_v) {
                break L12;
              } else {
                L13: {
                  if (null == kh.field_v) {
                    break L13;
                  } else {
                    if (kh.field_v.field_N == hl.field_v.field_N) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                var5 = uc.field_b[0];
                var77 = nl.a(var5, (byte) 123);
                var7_int = 0;
                L14: while (true) {
                  if (var7_int >= dn.field_bc.length) {
                    kh.field_v = ji.a(var77, (byte) -50, dn.field_bc);
                    break L12;
                  } else {
                    dn.field_bc[var7_int] = -1;
                    var7_int++;
                    continue L14;
                  }
                }
              }
            }
            L15: {
              if (-2 != pa.field_e) {
                break L15;
              } else {
                if (lb.field_gc != 1) {
                  break L15;
                } else {
                  if (he.a((byte) 127)) {
                    var5 = 0;
                    L16: while (true) {
                      if (var5 >= di.field_c.length) {
                        break L15;
                      } else {
                        di.field_c[var5] = dn.field_bc[var5];
                        var5++;
                        continue L16;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            L17: {
              L18: {
                if ((pa.field_e ^ -1) > -1) {
                  break L18;
                } else {
                  if (!he.a((byte) 123)) {
                    break L18;
                  } else {
                    if (-3 == (lb.field_gc ^ -1)) {
                      if ((ij.field_Y ^ -1) <= -1) {
                        lg.field_l = true;
                        ij.field_Y = -1;
                        break L17;
                      } else {
                        di.field_c[pa.field_e] = -1;
                        break L17;
                      }
                    } else {
                      if ((lb.field_gc ^ -1) == -2) {
                        L19: {
                          var5 = di.field_c[pa.field_e];
                          di.field_c[pa.field_e] = ij.field_Y;
                          if (fg.field_Ob == 0) {
                            break L19;
                          } else {
                            fg.field_Ob = 0;
                            var1_int = 1;
                            kf.field_s = true;
                            lg.field_l = true;
                            break L19;
                          }
                        }
                        if (0 <= ij.field_Y) {
                          ij.field_Y = -1;
                          break L17;
                        } else {
                          ij.field_Y = var5;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                }
              }
              if (lj.field_h == null) {
                break L17;
              } else {
                L20: {
                  if (-2 != (lb.field_gc ^ -1)) {
                    break L20;
                  } else {
                    if (!fc.field_e[81]) {
                      break L20;
                    } else {
                      if (!he.a((byte) 118)) {
                        break L20;
                      } else {
                        var34 = lj.field_h;
                        var6 = kh.field_v.a((byte) 2, var34);
                        if (-1 < (var6 ^ -1)) {
                          break L17;
                        } else {
                          L21: {
                            if (null == var34.field_d) {
                              break L21;
                            } else {
                              if (var6 != var34.field_d.field_N) {
                                break L21;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L22: {
                            if (null == var34.field_d) {
                              break L22;
                            } else {
                              if (83 == var34.field_d.field_N) {
                                var1_int = 1;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                          L23: {
                            var34.field_d = new nk(ul.a(var6, (byte) 67));
                            var7_int = ub.a(125, var6);
                            if (-1 >= (var7_int ^ -1)) {
                              var8 = hl.field_v.c(0, lj.field_h.field_r);
                              if (var8 == null) {
                                break L23;
                              } else {
                                var8.field_d = new nk(ul.a(var7_int, (byte) 67));
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (var6 == 83) {
                              var1_int = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          ee.c(param0 + -6996144, 25);
                          break L17;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if ((lb.field_gc ^ -1) != -3) {
                    break L25;
                  } else {
                    if (!he.a((byte) 126)) {
                      break L25;
                    } else {
                      if (ti.field_B == null) {
                        L26: {
                          var35 = lj.field_h.field_d;
                          if (var35 == null) {
                            break L26;
                          } else {
                            L27: {
                              if (var35.field_Q == 4) {
                                break L27;
                              } else {
                                if ((var35.field_Q ^ -1) == -2049) {
                                  break L27;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            var6_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                            if (var6_ref_qd == null) {
                              break L26;
                            } else {
                              var6_ref_qd.field_d = null;
                              break L26;
                            }
                          }
                        }
                        lj.field_h.field_d = null;
                        if (var35 == null) {
                          break L17;
                        } else {
                          if (-84 != (var35.field_N ^ -1)) {
                            break L17;
                          } else {
                            var1_int = 1;
                            break L17;
                          }
                        }
                      } else {
                        ti.field_B = null;
                        f.field_A = null;
                        break L17;
                      }
                    }
                  }
                }
                if (lb.field_gc != 1) {
                  break L17;
                } else {
                  if (he.a((byte) 126)) {
                    L28: {
                      if (-1 == (fg.field_Ob & 16 ^ -1)) {
                        break L28;
                      } else {
                        if (ti.field_B != null) {
                          if (-1 <= (ti.field_B.field_Q & lj.field_h.field_q ^ -1)) {
                            break L17;
                          } else {
                            L29: {
                              if ((ti.field_B.field_N ^ -1) == -84) {
                                var1_int = 1;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            lj.field_h.field_d = new nk(ti.field_B);
                            ee.c(-2483, 25);
                            break L17;
                          }
                        } else {
                          break L28;
                        }
                      }
                    }
                    if (null == lj.field_h.field_d) {
                      if (null == ti.field_B) {
                        break L17;
                      } else {
                        if ((ti.field_B.field_Q & lj.field_h.field_q) <= 0) {
                          break L17;
                        } else {
                          L30: {
                            lj.field_h.field_d = ti.field_B;
                            if ((ti.field_B.field_N ^ -1) != -84) {
                              break L30;
                            } else {
                              var1_int = 1;
                              break L30;
                            }
                          }
                          L31: {
                            ee.c(-2483, 25);
                            if (null == f.field_A) {
                              break L31;
                            } else {
                              var5_ref_qd = hl.field_v.c(param0 ^ 6993661, lj.field_h.field_r);
                              if (var5_ref_qd != null) {
                                var5_ref_qd.field_d = f.field_A;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          ti.field_B = null;
                          f.field_A = null;
                          break L17;
                        }
                      }
                    } else {
                      L32: {
                        if (ti.field_B == null) {
                          break L32;
                        } else {
                          if (0 < (ti.field_B.field_Q & lj.field_h.field_q)) {
                            L33: {
                              lj.field_h.field_d = ti.field_B;
                              if ((ti.field_B.field_N ^ -1) != -84) {
                                break L33;
                              } else {
                                var1_int = 1;
                                break L33;
                              }
                            }
                            L34: {
                              ee.c(-2483, 25);
                              if (null == f.field_A) {
                                break L34;
                              } else {
                                var5_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                                if (var5_ref_qd == null) {
                                  break L34;
                                } else {
                                  var5_ref_qd.field_d = f.field_A;
                                  break L34;
                                }
                              }
                            }
                            f.field_A = null;
                            ti.field_B = null;
                            break L17;
                          } else {
                            break L32;
                          }
                        }
                      }
                      if (null == ti.field_B) {
                        L35: {
                          L36: {
                            ti.field_B = lj.field_h.field_d;
                            f.field_A = null;
                            if (4 == ti.field_B.field_Q) {
                              break L36;
                            } else {
                              if (-2049 != (ti.field_B.field_Q ^ -1)) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          var36 = hl.field_v.c(0, lj.field_h.field_r);
                          if (var36 != null) {
                            f.field_A = var36.field_d;
                            var36.field_d = null;
                            break L35;
                          } else {
                            f.field_A = null;
                            break L35;
                          }
                        }
                        L37: {
                          if (null == lj.field_h.field_d) {
                            break L37;
                          } else {
                            if (lj.field_h.field_d.field_N != 83) {
                              break L37;
                            } else {
                              var1_int = 1;
                              break L37;
                            }
                          }
                        }
                        L38: {
                          if (ti.field_B != null) {
                            break L38;
                          } else {
                            f.field_A = null;
                            ti.field_B = null;
                            break L38;
                          }
                        }
                        lj.field_h.field_d = null;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  } else {
                    break L17;
                  }
                }
              }
            }
            L39: {
              L40: {
                L41: {
                  if (gd.field_jb != null) {
                    L42: {
                      L43: {
                        if (null == bi.field_f) {
                          break L43;
                        } else {
                          if (null == bi.field_f.field_Ub) {
                            break L43;
                          } else {
                            stackOut_161_0 = bi.field_f.field_Ub.field_eb;
                            stackIn_163_0 = stackOut_161_0;
                            break L42;
                          }
                        }
                      }
                      stackOut_162_0 = -2147483648;
                      stackIn_163_0 = stackOut_162_0;
                      break L42;
                    }
                    L44: {
                      L45: {
                        var5 = stackIn_163_0;
                        if (null == vd.field_a) {
                          break L45;
                        } else {
                          if (vd.field_a.field_Ub != null) {
                            stackOut_167_0 = vd.field_a.field_Ub.field_eb;
                            stackIn_168_0 = stackOut_167_0;
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                      stackOut_166_0 = -2147483648;
                      stackIn_168_0 = stackOut_166_0;
                      break L44;
                    }
                    L46: {
                      L47: {
                        var6 = stackIn_168_0;
                        gd.field_jb.a((byte) -107, true);
                        if (null == bi.field_f) {
                          break L47;
                        } else {
                          if (bi.field_f.field_Ub != null) {
                            stackOut_172_0 = bi.field_f.field_Ub.field_eb;
                            stackIn_173_0 = stackOut_172_0;
                            break L46;
                          } else {
                            break L47;
                          }
                        }
                      }
                      stackOut_171_0 = -2147483648;
                      stackIn_173_0 = stackOut_171_0;
                      break L46;
                    }
                    L48: {
                      var7_int = stackIn_173_0;
                      if (var5 == var7_int) {
                        break L48;
                      } else {
                        kf.field_s = true;
                        break L48;
                      }
                    }
                    L49: {
                      L50: {
                        if (null == vd.field_a) {
                          break L50;
                        } else {
                          if (null == vd.field_a.field_Ub) {
                            break L50;
                          } else {
                            stackOut_177_0 = vd.field_a.field_Ub.field_eb;
                            stackIn_179_0 = stackOut_177_0;
                            break L49;
                          }
                        }
                      }
                      stackOut_178_0 = -2147483648;
                      stackIn_179_0 = stackOut_178_0;
                      break L49;
                    }
                    L51: {
                      var8_int = stackIn_179_0;
                      if (var8_int == var6) {
                        break L51;
                      } else {
                        lg.field_l = true;
                        break L51;
                      }
                    }
                    L52: {
                      var37 = bi.field_f;
                      if (var37 == null) {
                        break L52;
                      } else {
                        L53: {
                          if (null != var37.field_Ub) {
                            stackOut_184_0 = var37.field_Ub.field_eb;
                            stackIn_185_0 = stackOut_184_0;
                            break L53;
                          } else {
                            stackOut_183_0 = -2147483648;
                            stackIn_185_0 = stackOut_183_0;
                            break L53;
                          }
                        }
                        L54: {
                          var10_int = stackIn_185_0;
                          var37.a((byte) 96, jj.field_d * 32, 128, false, 32);
                          if (null == var37.field_Ub) {
                            stackOut_187_0 = -2147483648;
                            stackIn_188_0 = stackOut_187_0;
                            break L54;
                          } else {
                            stackOut_186_0 = var37.field_Ub.field_eb;
                            stackIn_188_0 = stackOut_186_0;
                            break L54;
                          }
                        }
                        L55: {
                          var11_int = stackIn_188_0;
                          if (var10_int == var11_int) {
                            break L55;
                          } else {
                            kf.field_s = true;
                            break L55;
                          }
                        }
                        L56: {
                          var12_int = -1;
                          if (-1 == (fg.field_Ob ^ -1)) {
                            var12_int = 3;
                            break L56;
                          } else {
                            if ((fg.field_Ob & 1) != 0) {
                              var12_int = 0;
                              break L56;
                            } else {
                              if ((fg.field_Ob & 2) != 0) {
                                var12_int = 1;
                                break L56;
                              } else {
                                if (0 == (fg.field_Ob & 16)) {
                                  break L56;
                                } else {
                                  var12_int = 2;
                                  break L56;
                                }
                              }
                            }
                          }
                        }
                        if (-1 >= (var12_int ^ -1)) {
                          va.field_k[var12_int] = var37.field_Ub.field_eb;
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                    }
                    L57: {
                      var38 = vd.field_a;
                      if (var38 == null) {
                        break L57;
                      } else {
                        L58: {
                          if (var38.field_Ub != null) {
                            stackOut_204_0 = var38.field_Ub.field_eb;
                            stackIn_205_0 = stackOut_204_0;
                            break L58;
                          } else {
                            stackOut_203_0 = -2147483648;
                            stackIn_205_0 = stackOut_203_0;
                            break L58;
                          }
                        }
                        L59: {
                          var11_int = stackIn_205_0;
                          var38.a((byte) 96, 32 * jj.field_d, 128, false, 32);
                          if (null != var38.field_Ub) {
                            stackOut_207_0 = var38.field_Ub.field_eb;
                            stackIn_208_0 = stackOut_207_0;
                            break L59;
                          } else {
                            stackOut_206_0 = -2147483648;
                            stackIn_208_0 = stackOut_206_0;
                            break L59;
                          }
                        }
                        var12_int = stackIn_208_0;
                        if (var11_int == var12_int) {
                          break L57;
                        } else {
                          lg.field_l = true;
                          break L57;
                        }
                      }
                    }
                    L60: {
                      if (lb.field_gc == 1) {
                        L61: {
                          var11_int = fg.field_Ob;
                          var39 = wc.field_h[0];
                          var49 = var39;
                          var49 = var39;
                          if (var39 == null) {
                            break L61;
                          } else {
                            if (var39.field_kb) {
                              fg.field_Ob = 1;
                              var1_int = 1;
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                        }
                        L62: {
                          var40 = wc.field_h[1];
                          var49 = var40;
                          var49 = var40;
                          if (var40 == null) {
                            break L62;
                          } else {
                            if (var40.field_kb) {
                              fg.field_Ob = 2062;
                              var1_int = 1;
                              break L62;
                            } else {
                              break L62;
                            }
                          }
                        }
                        L63: {
                          var41 = wc.field_h[2];
                          var49 = var41;
                          var49 = var41;
                          if (var41 == null) {
                            break L63;
                          } else {
                            if (!var41.field_kb) {
                              break L63;
                            } else {
                              fg.field_Ob = 1008;
                              var1_int = 1;
                              break L63;
                            }
                          }
                        }
                        L64: {
                          var42 = wc.field_h[3];
                          var49 = var42;
                          var49 = var42;
                          if (var42 == null) {
                            break L64;
                          } else {
                            if (var42.field_kb) {
                              var1_int = 1;
                              fg.field_Ob = 0;
                              break L64;
                            } else {
                              break L64;
                            }
                          }
                        }
                        if (var11_int == fg.field_Ob) {
                          break L60;
                        } else {
                          L65: {
                            if (var37 != null) {
                              L66: {
                                var13 = -1;
                                if (0 == (var11_int & 1)) {
                                  break L66;
                                } else {
                                  var13 = 0;
                                  break L66;
                                }
                              }
                              L67: {
                                if (-1 == (2 & var11_int ^ -1)) {
                                  break L67;
                                } else {
                                  var13 = 1;
                                  break L67;
                                }
                              }
                              L68: {
                                if ((16 & var11_int) == 0) {
                                  break L68;
                                } else {
                                  var13 = 2;
                                  break L68;
                                }
                              }
                              L69: {
                                if (var11_int == 0) {
                                  var13 = 3;
                                  break L69;
                                } else {
                                  break L69;
                                }
                              }
                              if (0 > var13) {
                                break L65;
                              } else {
                                va.field_k[var13] = var37.field_Ub.field_eb;
                                break L65;
                              }
                            } else {
                              break L65;
                            }
                          }
                          f.field_A = null;
                          ij.field_Y = -1;
                          ti.field_B = null;
                          ee.c(-2483, 95);
                          break L60;
                        }
                      } else {
                        break L60;
                      }
                    }
                    L70: {
                      t.field_h = -1;
                      df.field_K = false;
                      f.field_y = null;
                      var11 = rh.field_u;
                      if (var11 == null) {
                        break L70;
                      } else {
                        if (fg.field_Ob == 0) {
                          var12_int = 0;
                          L71: while (true) {
                            if (var12_int >= 35) {
                              break L70;
                            } else {
                              L72: {
                                var49 = cj.field_a[var12_int];
                                if (var49 == null) {
                                  break L72;
                                } else {
                                  if (var49.field_kb) {
                                    L73: {
                                      var50 = var49.a("engineer", false);
                                      if (var50 == null) {
                                        break L73;
                                      } else {
                                        if (var50.field_kb) {
                                          df.field_K = true;
                                          break L73;
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    L74: {
                                      L75: {
                                        if (lb.field_gc != 1) {
                                          break L75;
                                        } else {
                                          if (!df.field_K) {
                                            break L75;
                                          } else {
                                            if (he.a((byte) 121)) {
                                              L76: {
                                                var15 = null;
                                                if (!t.a(fe.field_D, var12_int, -20370)) {
                                                  if (ad.a(var12_int, nk.f((byte) -96), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                                                    if (qf.field_h[var12_int] > li.field_v) {
                                                      var15 = hd.field_g;
                                                      ln.field_c = b.field_q[2];
                                                      break L76;
                                                    } else {
                                                      break L76;
                                                    }
                                                  } else {
                                                    L77: {
                                                      var15 = ha.field_R;
                                                      ln.field_c = b.field_q[2];
                                                      var16_int = nm.a(param0 ^ 6985420, var12_int);
                                                      if (-1 < (var16_int ^ -1)) {
                                                        break L77;
                                                      } else {
                                                        if (t.a(fe.field_D, var16_int, -20370)) {
                                                          break L77;
                                                        } else {
                                                          var15 = oc.field_e;
                                                          var15 = db.a((String) (var15), -65, new String[]{field_m[var16_int], field_m[var12_int]});
                                                          break L77;
                                                        }
                                                      }
                                                    }
                                                    var17 = var12_int;
                                                    if (var17 == 26) {
                                                      var15 = b.field_i;
                                                      break L76;
                                                    } else {
                                                      if (-24 == (var17 ^ -1)) {
                                                        var15 = k.field_Eb;
                                                        break L76;
                                                      } else {
                                                        if (25 != var17) {
                                                          if (var17 != 27) {
                                                            break L76;
                                                          } else {
                                                            var15 = kd.field_t;
                                                            break L76;
                                                          }
                                                        } else {
                                                          var15 = rd.field_c;
                                                          break L76;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ln.field_c = b.field_q[0];
                                                  var15 = va.field_i;
                                                  break L76;
                                                }
                                              }
                                              L78: {
                                                if (var15 != null) {
                                                  break L78;
                                                } else {
                                                  if (ni.b(param0 + -6993613)) {
                                                    break L78;
                                                  } else {
                                                    sn.field_q = var12_int;
                                                    f.field_v = qf.field_h[var12_int];
                                                    ee.c(-2483, 95);
                                                    break L78;
                                                  }
                                                }
                                              }
                                              if (var15 != null) {
                                                L79: {
                                                  stackOut_430_0 = var15;
                                                  stackOut_430_1 = param0 ^ -6993616;
                                                  stackOut_430_2 = new String[1];
                                                  stackOut_430_3 = new String[1];
                                                  stackOut_430_4 = 0;
                                                  stackIn_432_0 = stackOut_430_0;
                                                  stackIn_432_1 = stackOut_430_1;
                                                  stackIn_432_2 = stackOut_430_2;
                                                  stackIn_432_3 = stackOut_430_3;
                                                  stackIn_432_4 = stackOut_430_4;
                                                  stackIn_431_0 = stackOut_430_0;
                                                  stackIn_431_1 = stackOut_430_1;
                                                  stackIn_431_2 = stackOut_430_2;
                                                  stackIn_431_3 = stackOut_430_3;
                                                  stackIn_431_4 = stackOut_430_4;
                                                  if ((var12_int ^ -1) == -35) {
                                                    stackOut_432_0 = stackIn_432_0;
                                                    stackOut_432_1 = stackIn_432_1;
                                                    stackOut_432_2 = (String[]) ((Object) stackIn_432_2);
                                                    stackOut_432_3 = (String[]) ((Object) stackIn_432_3);
                                                    stackOut_432_4 = stackIn_432_4;
                                                    stackOut_432_5 = "GODULE";
                                                    stackIn_433_0 = stackOut_432_0;
                                                    stackIn_433_1 = stackOut_432_1;
                                                    stackIn_433_2 = stackOut_432_2;
                                                    stackIn_433_3 = stackOut_432_3;
                                                    stackIn_433_4 = stackOut_432_4;
                                                    stackIn_433_5 = stackOut_432_5;
                                                    break L79;
                                                  } else {
                                                    stackOut_431_0 = stackIn_431_0;
                                                    stackOut_431_1 = stackIn_431_1;
                                                    stackOut_431_2 = (String[]) ((Object) stackIn_431_2);
                                                    stackOut_431_3 = (String[]) ((Object) stackIn_431_3);
                                                    stackOut_431_4 = stackIn_431_4;
                                                    stackOut_431_5 = field_m[var12_int];
                                                    stackIn_433_0 = stackOut_431_0;
                                                    stackIn_433_1 = stackOut_431_1;
                                                    stackIn_433_2 = stackOut_431_2;
                                                    stackIn_433_3 = stackOut_431_3;
                                                    stackIn_433_4 = stackOut_431_4;
                                                    stackIn_433_5 = stackOut_431_5;
                                                    break L79;
                                                  }
                                                }
                                                stackIn_433_3[stackIn_433_4] = stackIn_433_5;
                                                km.field_a = db.a((String) ((Object) stackIn_433_0), stackIn_433_1, stackIn_433_2);
                                                break L74;
                                              } else {
                                                break L74;
                                              }
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                      }
                                      if (1 != lb.field_gc) {
                                        break L74;
                                      } else {
                                        if (!uc.a(var12_int, -3958)) {
                                          break L74;
                                        } else {
                                          if (he.a((byte) 127)) {
                                            ij.field_Y = var12_int;
                                            ti.field_B = null;
                                            f.field_A = null;
                                            ee.c(-2483, 100);
                                            break L74;
                                          } else {
                                            break L74;
                                          }
                                        }
                                      }
                                    }
                                    t.field_h = var12_int;
                                    if (null == f.field_y) {
                                      var51 = new jc(var49.field_M);
                                      var16 = (gh) ((Object) var51.b(2));
                                      L80: while (true) {
                                        if (var16 == null) {
                                          break L72;
                                        } else {
                                          L81: {
                                            if (!var16.field_kb) {
                                              break L81;
                                            } else {
                                              if (var16.field_S == null) {
                                                break L81;
                                              } else {
                                                if (!var16.field_S.startsWith("<img=")) {
                                                  break L81;
                                                } else {
                                                  if (7 == var16.field_S.length()) {
                                                    f.field_y = var16;
                                                    break L72;
                                                  } else {
                                                    break L81;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var16 = (gh) ((Object) var51.d(2));
                                          continue L80;
                                        }
                                      }
                                    } else {
                                      break L72;
                                    }
                                  } else {
                                    break L72;
                                  }
                                }
                              }
                              var12_int++;
                              continue L71;
                            }
                          }
                        } else {
                          var12_int = 0;
                          var13_ref_nk = (nk) ((Object) ao.field_H.e(13058));
                          L82: while (true) {
                            if (var13_ref_nk == null) {
                              L83: {
                                if ((fg.field_Ob ^ -1) != -2) {
                                  break L83;
                                } else {
                                  var13 = 0;
                                  L84: while (true) {
                                    if (ue.field_c.length <= var13) {
                                      break L83;
                                    } else {
                                      L85: {
                                        var14_int = var13 + 101;
                                        if (null == ue.field_c[var13]) {
                                          stackOut_332_0 = null;
                                          stackIn_333_0 = (gh) ((Object) stackOut_332_0);
                                          break L85;
                                        } else {
                                          stackOut_331_0 = cj.field_a[var14_int];
                                          stackIn_333_0 = stackOut_331_0;
                                          break L85;
                                        }
                                      }
                                      var47 = stackIn_333_0;
                                      var15 = var47;
                                      if (var15 != null) {
                                        if (var47.field_kb) {
                                          if ((lb.field_gc ^ -1) == -2) {
                                            L86: {
                                              L87: {
                                                var48 = ((gh) (var15)).a("bin", false);
                                                if (var48 == null) {
                                                  break L87;
                                                } else {
                                                  if (var48.field_kb) {
                                                    ue.field_c[var13] = null;
                                                    var17 = var13;
                                                    L88: while (true) {
                                                      if (ue.field_c.length - 1 <= var17) {
                                                        ue.field_c[ue.field_c.length + -1] = null;
                                                        ue.field_g[ue.field_c.length - 1] = null;
                                                        var1_int = 1;
                                                        break L86;
                                                      } else {
                                                        ue.field_c[var17] = ue.field_c[1 + var17];
                                                        ue.field_g[var17] = ue.field_g[1 + var17];
                                                        var17++;
                                                        continue L88;
                                                      }
                                                    }
                                                  } else {
                                                    break L87;
                                                  }
                                                }
                                              }
                                              L89: {
                                                var17 = 0;
                                                if (nk.f((byte) -46)) {
                                                  break L89;
                                                } else {
                                                  var18 = 0;
                                                  L90: while (true) {
                                                    if (var18 >= ue.field_c[var13].length) {
                                                      break L89;
                                                    } else {
                                                      L91: {
                                                        stackOut_345_0 = ue.field_c[var13][var18];
                                                        stackOut_345_1 = -109;
                                                        stackIn_347_0 = stackOut_345_0;
                                                        stackIn_347_1 = stackOut_345_1;
                                                        stackIn_346_0 = stackOut_345_0;
                                                        stackIn_346_1 = stackOut_345_1;
                                                        if (var18 < -8 + ue.field_c[var13].length) {
                                                          stackOut_347_0 = stackIn_347_0;
                                                          stackOut_347_1 = stackIn_347_1;
                                                          stackOut_347_2 = 0;
                                                          stackIn_348_0 = stackOut_347_0;
                                                          stackIn_348_1 = stackOut_347_1;
                                                          stackIn_348_2 = stackOut_347_2;
                                                          break L91;
                                                        } else {
                                                          stackOut_346_0 = stackIn_346_0;
                                                          stackOut_346_1 = stackIn_346_1;
                                                          stackOut_346_2 = 1;
                                                          stackIn_348_0 = stackOut_346_0;
                                                          stackIn_348_1 = stackOut_346_1;
                                                          stackIn_348_2 = stackOut_346_2;
                                                          break L91;
                                                        }
                                                      }
                                                      if (oc.a(stackIn_348_0, stackIn_348_1, stackIn_348_2 == 0)) {
                                                        var18++;
                                                        continue L90;
                                                      } else {
                                                        var17 = 1;
                                                        break L89;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var17 == 0) {
                                                ee.c(-2483, 99);
                                                di.field_c = new int[8];
                                                var12_int = 1;
                                                var18 = 0;
                                                L92: while (true) {
                                                  if (var18 >= 8) {
                                                    L93: {
                                                      var18_ref_int__ = ue.field_c[var13];
                                                      ij.field_Y = -1;
                                                      if (var18_ref_int__ != null) {
                                                        uc.field_b = var18_ref_int__;
                                                        break L93;
                                                      } else {
                                                        break L93;
                                                      }
                                                    }
                                                    ti.field_B = null;
                                                    break L86;
                                                  } else {
                                                    di.field_c[var18] = -1;
                                                    var18++;
                                                    continue L92;
                                                  }
                                                }
                                              } else {
                                                var13++;
                                                continue L84;
                                              }
                                            }
                                            var13++;
                                            continue L84;
                                          } else {
                                            var13++;
                                            continue L84;
                                          }
                                        } else {
                                          var13++;
                                          continue L84;
                                        }
                                      } else {
                                        var13++;
                                        continue L84;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var12_int != 0) {
                                hl.field_v = ji.a(uc.field_b, (byte) -53, di.field_c);
                                hl.field_v.b(6993661, 113);
                                break L70;
                              } else {
                                L94: {
                                  if (-3 != (lb.field_gc ^ -1)) {
                                    break L94;
                                  } else {
                                    if (!he.a((byte) 126)) {
                                      break L94;
                                    } else {
                                      ij.field_Y = -1;
                                      ti.field_B = null;
                                      f.field_A = null;
                                      break L94;
                                    }
                                  }
                                }
                                L95: {
                                  if (ti.field_B != null) {
                                    stackOut_371_0 = ti.field_B.field_N;
                                    stackIn_372_0 = stackOut_371_0;
                                    break L95;
                                  } else {
                                    stackOut_370_0 = -1;
                                    stackIn_372_0 = stackOut_370_0;
                                    break L95;
                                  }
                                }
                                L96: {
                                  var5 = stackIn_372_0;
                                  if (-1 >= (var5 ^ -1)) {
                                    break L96;
                                  } else {
                                    if ((ij.field_Y ^ -1) > -1) {
                                      break L96;
                                    } else {
                                      var5 = ij.field_Y;
                                      break L96;
                                    }
                                  }
                                }
                                L97: {
                                  if (param0 == 6993661) {
                                    break L97;
                                  } else {
                                    field_j = -1;
                                    break L97;
                                  }
                                }
                                L98: {
                                  if (var5 != fl.field_a) {
                                    lg.field_l = true;
                                    fl.field_a = var5;
                                    ad.field_h = true;
                                    kf.field_s = true;
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                                L99: {
                                  if (var1_int == 0) {
                                    break L99;
                                  } else {
                                    if (gd.field_jb == null) {
                                      break L99;
                                    } else {
                                      vn.d(-95);
                                      break L99;
                                    }
                                  }
                                }
                                if (gd.field_jb != null) {
                                  break L39;
                                } else {
                                  var6 = 0;
                                  L100: while (true) {
                                    if (var6 >= jg.field_h.length) {
                                      break L40;
                                    } else {
                                      jg.field_h[var6] = null;
                                      var6++;
                                      continue L100;
                                    }
                                  }
                                }
                              }
                            } else {
                              L101: {
                                var14 = null;
                                if (0 > var13_ref_nk.field_N) {
                                  break L101;
                                } else {
                                  if (var13_ref_nk.field_N >= cj.field_a.length) {
                                    break L101;
                                  } else {
                                    if (0 == (fg.field_Ob & var13_ref_nk.field_Q)) {
                                      break L101;
                                    } else {
                                      var14 = cj.field_a[var13_ref_nk.field_N];
                                      break L101;
                                    }
                                  }
                                }
                              }
                              L102: {
                                if (var14 == null) {
                                  break L102;
                                } else {
                                  if (!((gh) (var14)).field_kb) {
                                    break L102;
                                  } else {
                                    L103: {
                                      var43 = ((gh) (var14)).a("engineer", false);
                                      if (var43 == null) {
                                        break L103;
                                      } else {
                                        if (!var43.field_kb) {
                                          break L103;
                                        } else {
                                          df.field_K = true;
                                          break L103;
                                        }
                                      }
                                    }
                                    L104: {
                                      L105: {
                                        if (1 != lb.field_gc) {
                                          break L105;
                                        } else {
                                          if (!df.field_K) {
                                            break L105;
                                          } else {
                                            if (!he.a((byte) 117)) {
                                              break L105;
                                            } else {
                                              L106: {
                                                var16_int = 0;
                                                if (1 == var13_ref_nk.field_Q) {
                                                  var17_ref = ki.b(var13_ref_nk.field_N, (byte) -85);
                                                  var18_ref_int__ = ne.a(var13_ref_nk.field_N, (byte) 28);
                                                  var78 = (int[]) (var17_ref);
                                                  var20_int = 0;
                                                  L107: while (true) {
                                                    if (var78.length <= var20_int) {
                                                      var79 = var18_ref_int__;
                                                      var20_int = 0;
                                                      L108: while (true) {
                                                        if (var20_int >= var79.length) {
                                                          break L106;
                                                        } else {
                                                          L109: {
                                                            var21_int = var79[var20_int];
                                                            if (!t.a(rn.field_D, var21_int, param0 + -7014031)) {
                                                              var16_int = var16_int + sj.field_v[var21_int];
                                                              break L109;
                                                            } else {
                                                              break L109;
                                                            }
                                                          }
                                                          var20_int++;
                                                          continue L108;
                                                        }
                                                      }
                                                    } else {
                                                      L110: {
                                                        var21_int = var78[var20_int];
                                                        if (!t.a(fe.field_D, var21_int, param0 + -7014031)) {
                                                          var16_int = var16_int + qf.field_h[var21_int];
                                                          break L110;
                                                        } else {
                                                          break L110;
                                                        }
                                                      }
                                                      var20_int++;
                                                      continue L107;
                                                    }
                                                  }
                                                } else {
                                                  var16_int = sj.field_v[var13_ref_nk.field_N];
                                                  break L106;
                                                }
                                              }
                                              L111: {
                                                var17_ref = null;
                                                if (t.a(rn.field_D, var13_ref_nk.field_N, -20370)) {
                                                  var17_ref = qi.field_e;
                                                  ln.field_c = b.field_q[0];
                                                  break L111;
                                                } else {
                                                  if (var16_int > li.field_v) {
                                                    ln.field_c = b.field_q[2];
                                                    var17_ref = bj.field_a;
                                                    break L111;
                                                  } else {
                                                    break L111;
                                                  }
                                                }
                                              }
                                              L112: {
                                                if (var17_ref != null) {
                                                  break L112;
                                                } else {
                                                  if (!ni.b(88)) {
                                                    f.field_v = var16_int;
                                                    sn.field_q = var13_ref_nk.field_N + 128;
                                                    ee.c(-2483, 95);
                                                    break L112;
                                                  } else {
                                                    break L112;
                                                  }
                                                }
                                              }
                                              if (var17_ref == null) {
                                                break L104;
                                              } else {
                                                km.field_a = db.a((String) (var17_ref), param0 + -6993681, new String[]{t.field_e[var13_ref_nk.field_N]});
                                                break L104;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (lb.field_gc != 1) {
                                        break L104;
                                      } else {
                                        if (!mm.a(-16242, var13_ref_nk)) {
                                          break L104;
                                        } else {
                                          L113: {
                                            if (-2 == (var13_ref_nk.field_Q ^ -1)) {
                                              break L113;
                                            } else {
                                              if (!he.a((byte) 116)) {
                                                break L104;
                                              } else {
                                                if (!hl.field_v.f(var13_ref_nk.field_Q, -1)) {
                                                  break L104;
                                                } else {
                                                  break L113;
                                                }
                                              }
                                            }
                                          }
                                          L114: {
                                            if (-2 != (var13_ref_nk.field_Q ^ -1)) {
                                              break L114;
                                            } else {
                                              if (var13_ref_nk.field_N == 55) {
                                                break L114;
                                              } else {
                                                if ((4 & dm.field_a) != 0) {
                                                  break L114;
                                                } else {
                                                  if (he.a((byte) 120)) {
                                                    break L114;
                                                  } else {
                                                    L115: {
                                                      if (-58 == (var13_ref_nk.field_N ^ -1)) {
                                                        stackOut_295_0 = 6;
                                                        stackIn_296_0 = stackOut_295_0;
                                                        break L115;
                                                      } else {
                                                        stackOut_294_0 = 10;
                                                        stackIn_296_0 = stackOut_294_0;
                                                        break L115;
                                                      }
                                                    }
                                                    if (stackIn_296_0 > fm.field_f[0]) {
                                                      km.field_a = dj.field_i;
                                                      dm.field_a = dm.field_a | 4;
                                                      if (!ni.b(param0 + -6993572)) {
                                                        um.f((byte) 3);
                                                        break L104;
                                                      } else {
                                                        break L104;
                                                      }
                                                    } else {
                                                      break L114;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var13_ref_nk.field_Q != 1) {
                                            L116: {
                                              ee.c(param0 ^ -6995792, 100);
                                              t.field_h = var13_ref_nk.field_N;
                                              ti.field_B = new nk(var13_ref_nk);
                                              f.field_A = null;
                                              var16_int = ub.a(119, var13_ref_nk.field_N);
                                              if ((var16_int ^ -1) <= -1) {
                                                f.field_A = new nk(ul.a(var16_int, (byte) 67));
                                                break L116;
                                              } else {
                                                break L116;
                                              }
                                            }
                                            ij.field_Y = -1;
                                            break L104;
                                          } else {
                                            ee.c(-2483, 99);
                                            di.field_c = new int[8];
                                            qh.field_Wb = true;
                                            var16_int = 0;
                                            L117: while (true) {
                                              if ((var16_int ^ -1) <= -9) {
                                                L118: {
                                                  var12_int = 1;
                                                  var16_array = nl.a(var13_ref_nk.field_N, (byte) 123);
                                                  if (var16_array != null) {
                                                    uc.field_b = var16_array;
                                                    break L118;
                                                  } else {
                                                    var12_int = 0;
                                                    hl.field_v = new nk(var13_ref_nk);
                                                    break L118;
                                                  }
                                                }
                                                ij.field_Y = -1;
                                                ti.field_B = null;
                                                break L104;
                                              } else {
                                                di.field_c[var16_int] = -1;
                                                var16_int++;
                                                continue L117;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    t.field_h = var13_ref_nk.field_N;
                                    if (null == f.field_y) {
                                      var46 = new jc(((gh) (var14)).field_M);
                                      var17_ref = (gh) ((Object) var46.b(2));
                                      L119: while (true) {
                                        if (var17_ref == null) {
                                          break L102;
                                        } else {
                                          L120: {
                                            if (!((gh) (var17_ref)).field_kb) {
                                              break L120;
                                            } else {
                                              if (null == ((gh) (var17_ref)).field_S) {
                                                break L120;
                                              } else {
                                                L121: {
                                                  if (((gh) (var17_ref)).field_S.startsWith("<img=6>")) {
                                                    break L121;
                                                  } else {
                                                    if (((gh) (var17_ref)).field_S.startsWith("<img=2>")) {
                                                      break L121;
                                                    } else {
                                                      if (((gh) (var17_ref)).field_S.startsWith("<img=3>")) {
                                                        break L121;
                                                      } else {
                                                        if (-8 != (((gh) (var17_ref)).field_S.length() ^ -1)) {
                                                          break L120;
                                                        } else {
                                                          if (((gh) (var17_ref)).field_S.startsWith("<img=")) {
                                                            break L121;
                                                          } else {
                                                            break L120;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                f.field_y = (gh) (var17_ref);
                                                break L102;
                                              }
                                            }
                                          }
                                          var17_ref = (gh) ((Object) var46.d(2));
                                          continue L119;
                                        }
                                      }
                                    } else {
                                      var13_ref_nk = (nk) ((Object) ao.field_H.a((byte) -27));
                                      continue L82;
                                    }
                                  }
                                }
                              }
                              var13_ref_nk = (nk) ((Object) ao.field_H.a((byte) -27));
                              continue L82;
                            }
                          }
                        }
                      }
                    }
                    if (-3 != (lb.field_gc ^ -1)) {
                      break L41;
                    } else {
                      if (!he.a((byte) 126)) {
                        break L41;
                      } else {
                        ij.field_Y = -1;
                        ti.field_B = null;
                        f.field_A = null;
                        break L41;
                      }
                    }
                  } else {
                    break L41;
                  }
                }
                L122: {
                  if (ti.field_B != null) {
                    stackOut_451_0 = ti.field_B.field_N;
                    stackIn_452_0 = stackOut_451_0;
                    break L122;
                  } else {
                    stackOut_450_0 = -1;
                    stackIn_452_0 = stackOut_450_0;
                    break L122;
                  }
                }
                L123: {
                  var5 = stackIn_452_0;
                  if (-1 >= (var5 ^ -1)) {
                    break L123;
                  } else {
                    if ((ij.field_Y ^ -1) > -1) {
                      break L123;
                    } else {
                      var5 = ij.field_Y;
                      break L123;
                    }
                  }
                }
                L124: {
                  if (param0 == 6993661) {
                    break L124;
                  } else {
                    field_j = -1;
                    break L124;
                  }
                }
                L125: {
                  if (var5 != fl.field_a) {
                    lg.field_l = true;
                    fl.field_a = var5;
                    ad.field_h = true;
                    kf.field_s = true;
                    break L125;
                  } else {
                    break L125;
                  }
                }
                L126: {
                  if (var1_int == 0) {
                    break L126;
                  } else {
                    if (gd.field_jb == null) {
                      break L126;
                    } else {
                      vn.d(-95);
                      break L126;
                    }
                  }
                }
                if (gd.field_jb != null) {
                  break L39;
                } else {
                  var6 = 0;
                  L127: while (true) {
                    if (var6 >= jg.field_h.length) {
                      break L40;
                    } else {
                      jg.field_h[var6] = null;
                      var6++;
                      continue L127;
                    }
                  }
                }
              }
              L128: {
                L129: {
                  var6 = jj.field_e.field_z;
                  jj.field_e.d();
                  pb.a(0, 0, var6, var6, 0);
                  var7_int = ul.a((byte) 105, uc.field_b[0]);
                  if (-1 < (var7_int ^ -1)) {
                    break L129;
                  } else {
                    if (si.field_E.length <= var7_int) {
                      break L129;
                    } else {
                      break L128;
                    }
                  }
                }
                var7_int = 0;
                break L128;
              }
              si.field_E[var7_int].c(0, 0, 4 * var6, 4 * var6);
              sb.field_bb.b((byte) 122);
              var6 = hj.field_w;
              hj.field_w = 4096;
              var7 = new gh();
              var7.field_I = wd.field_a;
              var7.field_Kb = 1;
              var7.field_nb = 16777215;
              var7.field_L = (mi) ((Object) fk.field_d);
              var7.field_Fb = 1;
              var8_ref = new gh("", var7);
              var8_ref.field_I = km.field_e;
              kh.field_s = new gh("", var7);
              kh.field_s.field_Kb = 0;
              kh.field_s.field_Fb = 0;
              kh.field_s.field_ub = 4;
              kh.field_s.field_I = null;
              kh.field_s.field_nb = 16777215;
              kh.field_s.field_Ib = 17;
              var9 = new gh("", var7);
              var9.field_I = vh.field_b;
              dg.field_g = new gh("", var7);
              dg.field_g.field_I = ng.field_p;
              dg.field_g.field_Ab = cm.field_b;
              var10 = new gh("", var7);
              var10.field_Ab = ta.field_c;
              var10.field_nb = 16777215;
              var10.field_I = wc.field_k;
              var10.field_V = 192;
              var11 = new gh("", var7);
              var11.field_V = 192;
              var11.field_I = ta.field_c;
              var11.field_nb = 16777215;
              var12 = new gh("", var7);
              var12.field_Ab = ta.field_c;
              var12.field_I = wc.field_k;
              var52 = new gh("", var7);
              var52.field_I = bm.field_Y;
              var14 = new gh("", var7);
              ((gh) (var14)).field_I = sb.field_X;
              ((gh) (var14)).field_Ab = oe.field_f;
              ei.field_n = new gh("", var7);
              ei.field_n.field_I = co.field_d;
              sb.field_Y = new gh("", var7);
              sb.field_Y.field_I = be.field_f;
              dd.field_b = new gh("", var7);
              dd.field_b.field_I = lj.field_b;
              dd.field_b.field_Kb = 0;
              var54 = new gh("", var7);
              var54.field_I = nn.field_a;
              var63 = new gh("", var7);
              var63.field_L = (mi) ((Object) fk.field_d);
              var63.field_ub = 4;
              var63.field_I = pa.field_g;
              var63.field_Fb = 0;
              var63.field_Ib = 15;
              var63.field_Kb = 1;
              var63.field_nb = 0;
              gd.field_jb = new gh();
              gd.field_jb.a(0, 0, 480, 0, 640);
              var17 = am.field_d.length;
              var18 = 204 / var17;
              var19 = 10;
              var20_int = 0;
              L130: while (true) {
                if (var17 <= var20_int) {
                  bl.field_c = new gh("Listselectpane", var54);
                  bl.field_c.a(0, 84, 349, 10, 204);
                  gd.field_jb.a(bl.field_c, 118);
                  bi.field_d = 15;
                  pf.field_n = 4;
                  bg.field_y = 4;
                  var55 = new gh();
                  var55.field_db = sj.field_x[1];
                  var55.field_Pb = sj.field_x[0];
                  var20 = new gh();
                  var20.field_db = ah.field_Zb[1];
                  var20.field_Pb = ah.field_Zb[0];
                  var21 = new gh();
                  var21.field_I = qi.field_a;
                  var56 = new gh();
                  var56.field_I = jn.field_f;
                  var23 = new lb("", var55, var20, var21, var56);
                  var57 = new gh("Dataview", (gh) null);
                  rh.field_u = var57;
                  var25 = 0;
                  L131: while (true) {
                    if (var25 >= cj.field_a.length) {
                      L132: {
                        var25 = bl.field_c.field_zb + (-(2 * pf.field_n) - bi.field_d) - bg.field_y;
                        qa.field_O = var25;
                        var26_int = -2;
                        if (fg.field_Ob != 0) {
                          var26_int = te.a(var57, var26_int, true, -1);
                          break L132;
                        } else {
                          var26_int = pi.a((byte) -46, var57, var26_int, true);
                          break L132;
                        }
                      }
                      L133: {
                        var27_ref = null;
                        if (1 != fg.field_Ob) {
                          if (!he.a((byte) 124)) {
                            var27_ref = ai.field_v;
                            break L133;
                          } else {
                            if ((2 & fg.field_Ob) != 0) {
                              var27_ref = li.field_E;
                              break L133;
                            } else {
                              if ((fg.field_Ob & 16) != 0) {
                                var27_ref = re.field_hb;
                                break L133;
                              } else {
                                if (fg.field_Ob != 0) {
                                  break L133;
                                } else {
                                  var27_ref = bg.field_D;
                                  break L133;
                                }
                              }
                            }
                          }
                        } else {
                          var27_ref = kc.field_u;
                          break L133;
                        }
                      }
                      L134: {
                        if (var27_ref == null) {
                          break L134;
                        } else {
                          var58 = new gh(-1L, kh.field_s);
                          var29 = fk.field_d.a((String) (var27_ref), -(2 * var58.field_ub) + var25 + -(var58.field_qb * 2), kh.field_s.field_Ib);
                          var59 = new gh(-1L, (gh) null);
                          var26_int += 2;
                          var57.a(var59, 127);
                          var59.a(0, var26_int, var29, 0, var25);
                          var58.field_S = (String) (var27_ref);
                          var58.a(0, 0, var29, 0, var25 - 2 * var58.field_qb);
                          var59.a(var58, 125);
                          var26_int = var26_int + var29;
                          var26_int -= 2;
                          var26_int += 8;
                          break L134;
                        }
                      }
                      L135: {
                        hb.field_d = var26_int;
                        if (fg.field_Ob == 0) {
                          var26_int = pi.a((byte) -70, var57, var26_int, false);
                          break L135;
                        } else {
                          var26_int = te.a(var57, var26_int, false, -1);
                          break L135;
                        }
                      }
                      L136: {
                        var28 = 0;
                        if (1 == fg.field_Ob) {
                          var80 = ue.field_c;
                          var30 = 0;
                          L137: while (true) {
                            if (var80.length <= var30) {
                              if (-1 > (var28 ^ -1)) {
                                var26_int = si.a(var57, true, var26_int + 4);
                                break L136;
                              } else {
                                break L136;
                              }
                            } else {
                              L138: {
                                var31 = var80[var30];
                                if (var31 != null) {
                                  var28++;
                                  break L138;
                                } else {
                                  break L138;
                                }
                              }
                              var30++;
                              continue L137;
                            }
                          }
                        } else {
                          break L136;
                        }
                      }
                      L139: {
                        if (var27_ref != null) {
                          var26_int += 2;
                          break L139;
                        } else {
                          break L139;
                        }
                      }
                      L140: {
                        var57.a(0, 0, var26_int, 0, 0);
                        var84 = (CharSequence) ((Object) "Scrollingview");
                        var61 = new kg(ke.a(var84, (byte) -48), var57, (gh) null, var23);
                        bi.field_f = var61;
                        var61.a(bl.field_c.field_zb + -(2 * pf.field_n), -2048, bi.field_d, bl.field_c.field_Lb + -(pf.field_n * 2), bg.field_y, pf.field_n, pf.field_n);
                        bl.field_c.a(var61, 124);
                        var30 = -1;
                        if (fg.field_Ob == 0) {
                          var30 = 3;
                          break L140;
                        } else {
                          if (-1 == (1 & fg.field_Ob ^ -1)) {
                            if (0 != (16 & fg.field_Ob)) {
                              var30 = 2;
                              break L140;
                            } else {
                              if (-1 == (fg.field_Ob & 2 ^ -1)) {
                                break L140;
                              } else {
                                var30 = 1;
                                break L140;
                              }
                            }
                          } else {
                            var30 = 0;
                            break L140;
                          }
                        }
                      }
                      L141: {
                        if (0 <= var30) {
                          var61.field_Ub.field_eb = va.field_k[var30];
                          var61.field_Sb.a(var61.field_Tb.field_Lb, -va.field_k[var30], var61.field_Ub.field_Lb, -1);
                          break L141;
                        } else {
                          break L141;
                        }
                      }
                      L142: {
                        hj.field_w = var6;
                        kk.field_a = new gh("Itempane", kh.field_s);
                        kk.field_a.a(0, 64, 280, 518, 110);
                        gd.field_jb.a(kk.field_a, param0 + -6993534);
                        var62 = new gh(-1L, (gh) null);
                        var62.field_I = tk.field_t;
                        var62.a(0, 20, 257, 0, 110);
                        kk.field_a.a(var62, 126);
                        if (fg.field_Ob == 1) {
                          kk.field_a.field_S = "";
                          break L142;
                        } else {
                          if ((2 & fg.field_Ob ^ -1) < -1) {
                            var67 = new gh("", var63);
                            var67.field_S = mc.field_b;
                            var67.a(0, 0, 18, 0, 110);
                            kk.field_a.a(var67, param0 ^ 6993543);
                            var26 = new gh("DataListView", (gh) null);
                            hm.field_a = var26;
                            var27 = 4 + oc.a(4, var26);
                            var26.field_I = tk.field_t;
                            var26.a(0, 20, var27, 0, 110);
                            if (var27 > 284) {
                              var86 = (CharSequence) ((Object) "Scrollingview2");
                              var68 = new kg(ke.a(var86, (byte) -48), var26, (gh) null, var23);
                              vd.field_a = var68;
                              var68.a(110, -2048, bi.field_d, 301, bg.field_y, 0, 21);
                              kk.field_a.a(var68, 119);
                              break L142;
                            } else {
                              var62.field_I = null;
                              kk.field_a.a(var26, 125);
                              break L142;
                            }
                          } else {
                            if (-1 <= (fg.field_Ob & 16 ^ -1)) {
                              if (fg.field_Ob == 0) {
                                vb.a(kk.field_a, (byte) 19);
                                break L142;
                              } else {
                                break L142;
                              }
                            } else {
                              L143: {
                                var64 = new gh("", var63);
                                var64.field_S = kf.field_B;
                                var64.a(0, 0, 18, 0, 110);
                                kk.field_a.a(var64, 119);
                                var26_int = og.a(true);
                                var27 = 254;
                                if (var27 >= var26_int) {
                                  stackOut_545_0 = 0;
                                  stackIn_546_0 = stackOut_545_0;
                                  break L143;
                                } else {
                                  stackOut_544_0 = 1;
                                  stackIn_546_0 = stackOut_544_0;
                                  break L143;
                                }
                              }
                              L144: {
                                kc.field_r = stackIn_546_0 != 0;
                                var65 = new gh("DataListView", (gh) null);
                                if (kc.field_r) {
                                  break L144;
                                } else {
                                  var65.field_I = tk.field_t;
                                  break L144;
                                }
                              }
                              L145: {
                                hm.field_a = var65;
                                var29 = ak.a(var65, 112);
                                lg.field_l = true;
                                stackOut_548_0 = (gh) (var65);
                                stackOut_548_1 = 0;
                                stackOut_548_2 = 20;
                                stackOut_548_3 = var29;
                                stackIn_550_0 = stackOut_548_0;
                                stackIn_550_1 = stackOut_548_1;
                                stackIn_550_2 = stackOut_548_2;
                                stackIn_550_3 = stackOut_548_3;
                                stackIn_549_0 = stackOut_548_0;
                                stackIn_549_1 = stackOut_548_1;
                                stackIn_549_2 = stackOut_548_2;
                                stackIn_549_3 = stackOut_548_3;
                                if (kc.field_r) {
                                  stackOut_550_0 = (gh) ((Object) stackIn_550_0);
                                  stackOut_550_1 = stackIn_550_1;
                                  stackOut_550_2 = stackIn_550_2;
                                  stackOut_550_3 = stackIn_550_3;
                                  stackOut_550_4 = bi.field_d / 2 - -2;
                                  stackIn_551_0 = stackOut_550_0;
                                  stackIn_551_1 = stackOut_550_1;
                                  stackIn_551_2 = stackOut_550_2;
                                  stackIn_551_3 = stackOut_550_3;
                                  stackIn_551_4 = stackOut_550_4;
                                  break L145;
                                } else {
                                  stackOut_549_0 = (gh) ((Object) stackIn_549_0);
                                  stackOut_549_1 = stackIn_549_1;
                                  stackOut_549_2 = stackIn_549_2;
                                  stackOut_549_3 = stackIn_549_3;
                                  stackOut_549_4 = 0;
                                  stackIn_551_0 = stackOut_549_0;
                                  stackIn_551_1 = stackOut_549_1;
                                  stackIn_551_2 = stackOut_549_2;
                                  stackIn_551_3 = stackOut_549_3;
                                  stackIn_551_4 = stackOut_549_4;
                                  break L145;
                                }
                              }
                              ((gh) (Object) stackIn_551_0).a(stackIn_551_1, stackIn_551_2, stackIn_551_3, stackIn_551_4, 110);
                              if (kc.field_r) {
                                var85 = (CharSequence) ((Object) "Scrollingview2");
                                var66 = new kg(ke.a(var85, (byte) -48), var65, (gh) null, var23);
                                vd.field_a = var66;
                                var66.a(107, -2048, bi.field_d, -2 + var27, bg.field_y, 0, 23);
                                kk.field_a.a(var66, 121);
                                break L142;
                              } else {
                                var62.field_I = null;
                                kk.field_a.a(var65, 120);
                                break L142;
                              }
                            }
                          }
                        }
                      }
                      if (fg.field_Ob == 1) {
                        var62.field_I = null;
                        break L39;
                      } else {
                        break L39;
                      }
                    } else {
                      cj.field_a[var25] = null;
                      var25++;
                      continue L131;
                    }
                  }
                } else {
                  L146: {
                    var21_int = 0;
                    if (var20_int != 0) {
                      break L146;
                    } else {
                      if (fg.field_Ob == 1) {
                        var21_int = 1;
                        break L146;
                      } else {
                        break L146;
                      }
                    }
                  }
                  L147: {
                    if (1 != var20_int) {
                      break L147;
                    } else {
                      if (-1 > (fg.field_Ob & 2 ^ -1)) {
                        var21_int = 1;
                        break L147;
                      } else {
                        break L147;
                      }
                    }
                  }
                  L148: {
                    if (2 != var20_int) {
                      break L148;
                    } else {
                      if (0 >= (16 & fg.field_Ob)) {
                        break L148;
                      } else {
                        var21_int = 1;
                        break L148;
                      }
                    }
                  }
                  L149: {
                    if (-4 != (var20_int ^ -1)) {
                      break L149;
                    } else {
                      if (fg.field_Ob != 0) {
                        break L149;
                      } else {
                        var21_int = 1;
                        break L149;
                      }
                    }
                  }
                  L150: {
                    stackOut_487_0 = null;
                    stackOut_487_1 = null;
                    stackOut_487_2 = am.field_d[var20_int];
                    stackIn_489_0 = stackOut_487_0;
                    stackIn_489_1 = stackOut_487_1;
                    stackIn_489_2 = stackOut_487_2;
                    stackIn_488_0 = stackOut_487_0;
                    stackIn_488_1 = stackOut_487_1;
                    stackIn_488_2 = stackOut_487_2;
                    if (var21_int != 0) {
                      stackOut_489_0 = null;
                      stackOut_489_1 = null;
                      stackOut_489_2 = (String) ((Object) stackIn_489_2);
                      stackOut_489_3 = (gh) (var52);
                      stackIn_490_0 = stackOut_489_0;
                      stackIn_490_1 = stackOut_489_1;
                      stackIn_490_2 = stackOut_489_2;
                      stackIn_490_3 = stackOut_489_3;
                      break L150;
                    } else {
                      stackOut_488_0 = null;
                      stackOut_488_1 = null;
                      stackOut_488_2 = (String) ((Object) stackIn_488_2);
                      stackOut_488_3 = var14;
                      stackIn_490_0 = stackOut_488_0;
                      stackIn_490_1 = stackOut_488_1;
                      stackIn_490_2 = stackOut_488_2;
                      stackIn_490_3 = (gh) ((Object) stackOut_488_3);
                      break L150;
                    }
                  }
                  L151: {
                    var53 = new gh(stackIn_490_2, stackIn_490_3);
                    wc.field_h[var20_int] = var53;
                    stackOut_490_0 = (gh) (var53);
                    stackOut_490_1 = da.field_e;
                    stackOut_490_2 = var20_int;
                    stackIn_492_0 = stackOut_490_0;
                    stackIn_492_1 = stackOut_490_1;
                    stackIn_492_2 = stackOut_490_2;
                    stackIn_491_0 = stackOut_490_0;
                    stackIn_491_1 = stackOut_490_1;
                    stackIn_491_2 = stackOut_490_2;
                    if (var21_int != 0) {
                      stackOut_492_0 = (gh) ((Object) stackIn_492_0);
                      stackOut_492_1 = (wk[]) ((Object) stackIn_492_1);
                      stackOut_492_2 = stackIn_492_2;
                      stackOut_492_3 = 0;
                      stackIn_493_0 = stackOut_492_0;
                      stackIn_493_1 = stackOut_492_1;
                      stackIn_493_2 = stackOut_492_2;
                      stackIn_493_3 = stackOut_492_3;
                      break L151;
                    } else {
                      stackOut_491_0 = (gh) ((Object) stackIn_491_0);
                      stackOut_491_1 = (wk[]) ((Object) stackIn_491_1);
                      stackOut_491_2 = stackIn_491_2;
                      stackOut_491_3 = 4;
                      stackIn_493_0 = stackOut_491_0;
                      stackIn_493_1 = stackOut_491_1;
                      stackIn_493_2 = stackOut_491_2;
                      stackIn_493_3 = stackOut_491_3;
                      break L151;
                    }
                  }
                  stackIn_493_0.field_Pb = stackIn_493_1[stackIn_493_2 - -stackIn_493_3];
                  var53.a(param0 ^ 6993661, 59, 25, var19, var18);
                  gd.field_jb.a(var53, 126);
                  vb.field_a[var20_int] = var53;
                  var19 = var19 + var18;
                  var20_int++;
                  continue L130;
                }
              }
            }
            on.b(param0 + -6993611);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rj.F(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) 115, param1, param1.length, 0);
              if (param0 < -45) {
                break L1;
              } else {
                rj.a(-54);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("rj.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        rm.field_g = param2;
        ig.field_e = param0;
        ck.field_e = param3;
        if (param4 != -89) {
            field_k = (cm) null;
        }
        jk.field_d = param1;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param1.getCodeBase(), param0);
                    var3 = ge.a(param2 ^ -47, var3, param1);
                    if (param2 == -47) {
                      be.a(true, (byte) 26, var3.toString(), param1);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("rj.J(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              L4: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        this.field_g = 0;
        if (!(this.field_e == this.field_l)) {
            this.field_q.a(this.field_l, -1);
            this.field_e = this.field_l;
        }
        if (param0 != -84) {
            return;
        }
        this.field_i = this.field_l;
        while (this.field_g < this.field_n.length) {
            var2 = -this.field_g + this.field_n.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = this.field_q.a(this.field_n, this.field_g, var2, false);
            if (0 == (var3 ^ -1)) {
                break;
            }
            this.field_e = this.field_e + (long)var3;
            this.field_g = this.field_g + var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
            throw new IOException();
        }
        this.field_l = param1;
        if (param0 > -88) {
            this.field_i = 68L;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_o >= this.field_l - -(long)param1) {
                    break L2;
                  } else {
                    this.field_o = (long)param1 + this.field_l;
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_a ^ -1L) == 0L) {
                    break L3;
                  } else {
                    if ((this.field_l ^ -1L) <= (this.field_a ^ -1L)) {
                      if ((this.field_l ^ -1L) >= (this.field_a - -(long)this.field_h ^ -1L)) {
                        break L3;
                      } else {
                        this.b((byte) -104);
                        break L3;
                      }
                    } else {
                      this.b((byte) -104);
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((this.field_a ^ -1L) == 0L) {
                    break L4;
                  } else {
                    if ((this.field_a + (long)this.field_p.length ^ -1L) <= (this.field_l + (long)param1 ^ -1L)) {
                      break L4;
                    } else {
                      var5_int = (int)((long)this.field_p.length + -this.field_l - -this.field_a);
                      ii.a(param3, param0, this.field_p, (int)(this.field_l + -this.field_a), var5_int);
                      param0 = param0 + var5_int;
                      param1 = param1 - var5_int;
                      this.field_l = this.field_l + (long)var5_int;
                      this.field_h = this.field_p.length;
                      this.b((byte) -118);
                      break L4;
                    }
                  }
                }
                if (param1 > this.field_p.length) {
                  L5: {
                    if ((this.field_l ^ -1L) == (this.field_e ^ -1L)) {
                      break L5;
                    } else {
                      this.field_q.a(this.field_l, -1);
                      this.field_e = this.field_l;
                      break L5;
                    }
                  }
                  L6: {
                    this.field_q.a(param1, 1, param3, param0);
                    this.field_e = this.field_e + (long)param1;
                    if (this.field_e > this.field_f) {
                      this.field_f = this.field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var5_long = -1L;
                      var7 = -1L;
                      if ((this.field_l ^ -1L) > (this.field_i ^ -1L)) {
                        break L8;
                      } else {
                        if ((long)this.field_g + this.field_i > this.field_l) {
                          var5_long = this.field_l;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (this.field_i < this.field_l) {
                      break L7;
                    } else {
                      if (((long)param1 + this.field_l ^ -1L) < (this.field_i ^ -1L)) {
                        var5_long = this.field_i;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (this.field_l - -(long)param1 <= this.field_i) {
                        break L10;
                      } else {
                        if ((long)param1 + this.field_l <= (long)this.field_g + this.field_i) {
                          var7 = (long)param1 + this.field_l;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (((long)this.field_g + this.field_i ^ -1L) >= (this.field_l ^ -1L)) {
                      break L9;
                    } else {
                      if ((this.field_i + (long)this.field_g ^ -1L) >= ((long)param1 + this.field_l ^ -1L)) {
                        var7 = (long)this.field_g + this.field_i;
                        break L9;
                      } else {
                        L11: {
                          if (var5_long <= -1L) {
                            break L11;
                          } else {
                            if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                              break L11;
                            } else {
                              var9 = (int)(var7 - var5_long);
                              ii.a(param3, (int)(var5_long + ((long)param0 + -this.field_l)), this.field_n, (int)(var5_long - this.field_i), var9);
                              break L11;
                            }
                          }
                        }
                        this.field_l = this.field_l + (long)param1;
                        return;
                      }
                    }
                  }
                  L12: {
                    if (var5_long <= -1L) {
                      break L12;
                    } else {
                      if ((var5_long ^ -1L) <= (var7 ^ -1L)) {
                        break L12;
                      } else {
                        var9 = (int)(var7 - var5_long);
                        ii.a(param3, (int)(var5_long + ((long)param0 + -this.field_l)), this.field_n, (int)(var5_long - this.field_i), var9);
                        break L12;
                      }
                    }
                  }
                  this.field_l = this.field_l + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param1 > 0) {
                    L13: {
                      if (this.field_a != -1L) {
                        break L13;
                      } else {
                        this.field_a = this.field_l;
                        break L13;
                      }
                    }
                    L14: {
                      ii.a(param3, param0, this.field_p, (int)(this.field_l - this.field_a), param1);
                      this.field_l = this.field_l + (long)param1;
                      if (-this.field_a + this.field_l <= (long)this.field_h) {
                        break L14;
                      } else {
                        this.field_h = (int)(this.field_l - this.field_a);
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_e = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                L15: {
                  if (param2 > 17) {
                    break L15;
                  } else {
                    var11 = (java.applet.Applet) null;
                    rj.a((String) null, (java.applet.Applet) null, (byte) -7);
                    break L15;
                  }
                }
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var5_ref);
            stackOut_55_1 = new StringBuilder().append("rj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    rj(sn param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = -1L;
        this.field_i = -1L;
        this.field_h = 0;
        try {
            this.field_q = param0;
            dupTemp$0 = param0.d(0);
            this.field_f = dupTemp$0;
            this.field_o = dupTemp$0;
            this.field_p = new byte[param2];
            this.field_n = new byte[param1];
            this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) throws IOException {
        if (param0 >= -122) {
            this.field_n = (byte[]) null;
        }
        this.b((byte) -97);
        this.field_q.a(true);
    }

    public static void a(int param0) {
        field_k = null;
        field_c = null;
        field_d = null;
        if (param0 != 83) {
            return;
        }
        field_m = null;
    }

    static {
        field_j = 0;
        field_c = "Send private message to <%0>";
        field_m = new String[]{"Light reactor", "Core reactor", "Dual reactor", "Heavy reactor", "Fusion reactor", "Light capacitor", "Base capacitor", "Heavy capacitor", "Ring capacitor", "Magnon capacitor", "Haze energy shield", "Electron energy shield", "Plasma energy shield", "Dragon energy shield", "Solar energy shield", "EMP bomb", "Targeter", "AMARDS", "Missile scrambler", "Repair system", "Experimental reactor", "Scanner", "Speed loader", "Coolant array", "Emergency displacement deployment", "High-energy amplifier", "Energised armour", "EMP hardening", "Gravity pods", "Aeruak stabilisers", "Walton mirage device", "Siege stabilisation system", "Reinforced armour", "Reactive armour"};
        field_b = 66;
    }
}
