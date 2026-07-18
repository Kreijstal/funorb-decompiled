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
            if (param2 + param3 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param3));
            } else {
              L1: {
                if (-1L == ((rj) this).field_a) {
                  break L1;
                } else {
                  if (((rj) this).field_l < ((rj) this).field_a) {
                    break L1;
                  } else {
                    if ((long)param2 + ((rj) this).field_l <= (long)((rj) this).field_h + ((rj) this).field_a) {
                      ii.a(((rj) this).field_p, (int)(-((rj) this).field_a + ((rj) this).field_l), param1, param3, param2);
                      ((rj) this).field_l = ((rj) this).field_l + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((rj) this).field_l;
                var7 = param3;
                var8 = param2;
                if (~((rj) this).field_l > ~((rj) this).field_i) {
                  break L2;
                } else {
                  if (~((long)((rj) this).field_g + ((rj) this).field_i) < ~((rj) this).field_l) {
                    L3: {
                      var9_int = (int)((long)((rj) this).field_g + -((rj) this).field_l - -((rj) this).field_i);
                      if (var9_int > param2) {
                        var9_int = param2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ii.a(((rj) this).field_n, (int)(((rj) this).field_l + -((rj) this).field_i), param1, param3, var9_int);
                    param3 = param3 + var9_int;
                    ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                    param2 = param2 - var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (param2 > ((rj) this).field_n.length) {
                  ((rj) this).field_q.a(((rj) this).field_l, -1);
                  ((rj) this).field_e = ((rj) this).field_l;
                  L5: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((rj) this).field_q.a(param1, param3, param2, false);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        param2 = param2 - var9_int;
                        param3 = param3 + var9_int;
                        ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                        ((rj) this).field_e = ((rj) this).field_e + (long)var9_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param2 > 0) {
                    L6: {
                      int discarded$2 = -84;
                      this.b();
                      var9_int = param2;
                      if (((rj) this).field_g < var9_int) {
                        var9_int = ((rj) this).field_g;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ii.a(((rj) this).field_n, 0, param1, param3, var9_int);
                    param3 = param3 + var9_int;
                    param2 = param2 - var9_int;
                    ((rj) this).field_l = ((rj) this).field_l + (long)var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (((rj) this).field_a == -1L) {
                  break L7;
                } else {
                  L8: {
                    if (((rj) this).field_l >= ((rj) this).field_a) {
                      break L8;
                    } else {
                      if (param2 <= 0) {
                        break L8;
                      } else {
                        L9: {
                          var9_int = param3 + (int)(-((rj) this).field_l + ((rj) this).field_a);
                          if (param3 - -param2 < var9_int) {
                            var9_int = param2 + param3;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param3 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$3 = param3;
                            param3++;
                            param1[incrementValue$3] = (byte) 0;
                            param2--;
                            ((rj) this).field_l = ((rj) this).field_l + 1L;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var9 = -1L;
                      if (((rj) this).field_a < var5_long) {
                        break L12;
                      } else {
                        if (((rj) this).field_a < (long)var8 + var5_long) {
                          var9 = ((rj) this).field_a;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~var5_long > ~((rj) this).field_a) {
                      break L11;
                    } else {
                      if (((rj) this).field_a - -(long)((rj) this).field_h > var5_long) {
                        var9 = var5_long;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var11 = -1L;
                      if ((long)((rj) this).field_h + ((rj) this).field_a <= var5_long) {
                        break L14;
                      } else {
                        if (~(((rj) this).field_a + (long)((rj) this).field_h) < ~((long)var8 + var5_long)) {
                          break L14;
                        } else {
                          var11 = (long)((rj) this).field_h + ((rj) this).field_a;
                          break L13;
                        }
                      }
                    }
                    if (var5_long - -(long)var8 <= ((rj) this).field_a) {
                      break L13;
                    } else {
                      if (~(((rj) this).field_a + (long)((rj) this).field_h) > ~(var5_long + (long)var8)) {
                        break L13;
                      } else {
                        var11 = (long)var8 + var5_long;
                        break L13;
                      }
                    }
                  }
                  if (-1L >= var9) {
                    break L7;
                  } else {
                    if (var9 >= var11) {
                      break L7;
                    } else {
                      var13 = (int)(-var9 + var11);
                      ii.a(((rj) this).field_p, (int)(var9 + -((rj) this).field_a), param1, var7 - -(int)(-var5_long + var9), var13);
                      if (~((rj) this).field_l > ~var11) {
                        param2 = (int)((long)param2 - (-((rj) this).field_l + var11));
                        ((rj) this).field_l = var11;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              L15: {
                if (param0 == 115) {
                  break L15;
                } else {
                  ((rj) this).field_o = -101L;
                  break L15;
                }
              }
              if (param2 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((rj) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5_ref;
            stackOut_62_1 = new StringBuilder().append("rj.B(").append(param0).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          if (((rj) this).field_a != -1L) {
            L1: {
              if (~((rj) this).field_a != ~((rj) this).field_e) {
                ((rj) this).field_q.a(((rj) this).field_a, -1);
                ((rj) this).field_e = ((rj) this).field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rj) this).field_q.a(((rj) this).field_h, 1, ((rj) this).field_p, 0);
              ((rj) this).field_e = ((rj) this).field_e + (long)((rj) this).field_h;
              if (~((rj) this).field_f > ~((rj) this).field_e) {
                ((rj) this).field_f = ((rj) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((rj) this).field_i > ((rj) this).field_a) {
                  break L4;
                } else {
                  if (~((rj) this).field_a <= ~((long)((rj) this).field_g + ((rj) this).field_i)) {
                    break L4;
                  } else {
                    var2 = ((rj) this).field_a;
                    break L3;
                  }
                }
              }
              if (((rj) this).field_a > ((rj) this).field_i) {
                break L3;
              } else {
                if (~((rj) this).field_i > ~(((rj) this).field_a + (long)((rj) this).field_h)) {
                  var2 = ((rj) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((long)((rj) this).field_h + ((rj) this).field_a <= ((rj) this).field_i) {
                  break L6;
                } else {
                  if ((long)((rj) this).field_h + ((rj) this).field_a <= (long)((rj) this).field_g + ((rj) this).field_i) {
                    var4 = ((rj) this).field_a - -(long)((rj) this).field_h;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((rj) this).field_i + (long)((rj) this).field_g <= ((rj) this).field_a) {
                break L5;
              } else {
                if (((rj) this).field_a - -(long)((rj) this).field_h < (long)((rj) this).field_g + ((rj) this).field_i) {
                  break L5;
                } else {
                  var4 = (long)((rj) this).field_g + ((rj) this).field_i;
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
                  ii.a(((rj) this).field_p, (int)(-((rj) this).field_a + var2), ((rj) this).field_n, (int)(-((rj) this).field_i + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((rj) this).field_h = 0;
            ((rj) this).field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 < -43) {
            break L8;
          } else {
            var8 = null;
            rj.a((String) null, (java.applet.Applet) null, (byte) -111);
            break L8;
          }
        }
    }

    final long a(byte param0) {
        int var2 = -54 / ((param0 - 45) / 43);
        return ((rj) this).field_o;
    }

    final static void d() {
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
        gh var10 = null;
        int var10_int = 0;
        gh var11 = null;
        int var11_int = 0;
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
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_287_0 = 0;
        gh stackIn_324_0 = null;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        int stackIn_335_0 = 0;
        int stackIn_335_1 = 0;
        int stackIn_336_0 = 0;
        int stackIn_336_1 = 0;
        int stackIn_336_2 = 0;
        int stackIn_360_0 = 0;
        Object stackIn_417_0 = null;
        int stackIn_417_1 = 0;
        String[] stackIn_417_2 = null;
        String[] stackIn_417_3 = null;
        int stackIn_417_4 = 0;
        Object stackIn_418_0 = null;
        int stackIn_418_1 = 0;
        String[] stackIn_418_2 = null;
        String[] stackIn_418_3 = null;
        int stackIn_418_4 = 0;
        Object stackIn_419_0 = null;
        int stackIn_419_1 = 0;
        String[] stackIn_419_2 = null;
        String[] stackIn_419_3 = null;
        int stackIn_419_4 = 0;
        String stackIn_419_5 = null;
        int stackIn_438_0 = 0;
        gh stackIn_472_0 = null;
        gh stackIn_472_1 = null;
        String stackIn_472_2 = null;
        gh stackIn_473_0 = null;
        gh stackIn_473_1 = null;
        String stackIn_473_2 = null;
        gh stackIn_474_0 = null;
        gh stackIn_474_1 = null;
        String stackIn_474_2 = null;
        gh stackIn_474_3 = null;
        gh stackIn_475_0 = null;
        wk[] stackIn_475_1 = null;
        int stackIn_475_2 = 0;
        gh stackIn_476_0 = null;
        wk[] stackIn_476_1 = null;
        int stackIn_476_2 = 0;
        gh stackIn_477_0 = null;
        wk[] stackIn_477_1 = null;
        int stackIn_477_2 = 0;
        int stackIn_477_3 = 0;
        int stackIn_530_0 = 0;
        gh stackIn_533_0 = null;
        int stackIn_533_1 = 0;
        int stackIn_533_2 = 0;
        int stackIn_533_3 = 0;
        gh stackIn_534_0 = null;
        int stackIn_534_1 = 0;
        int stackIn_534_2 = 0;
        int stackIn_534_3 = 0;
        gh stackIn_535_0 = null;
        int stackIn_535_1 = 0;
        int stackIn_535_2 = 0;
        int stackIn_535_3 = 0;
        int stackIn_535_4 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        Object stackOut_416_0 = null;
        int stackOut_416_1 = 0;
        String[] stackOut_416_2 = null;
        String[] stackOut_416_3 = null;
        int stackOut_416_4 = 0;
        Object stackOut_418_0 = null;
        int stackOut_418_1 = 0;
        String[] stackOut_418_2 = null;
        String[] stackOut_418_3 = null;
        int stackOut_418_4 = 0;
        String stackOut_418_5 = null;
        Object stackOut_417_0 = null;
        int stackOut_417_1 = 0;
        String[] stackOut_417_2 = null;
        String[] stackOut_417_3 = null;
        int stackOut_417_4 = 0;
        String stackOut_417_5 = null;
        Object stackOut_323_0 = null;
        gh stackOut_322_0 = null;
        int stackOut_333_0 = 0;
        int stackOut_333_1 = 0;
        int stackOut_335_0 = 0;
        int stackOut_335_1 = 0;
        int stackOut_335_2 = 0;
        int stackOut_334_0 = 0;
        int stackOut_334_1 = 0;
        int stackOut_334_2 = 0;
        int stackOut_359_0 = 0;
        int stackOut_358_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_437_0 = 0;
        int stackOut_436_0 = 0;
        int stackOut_529_0 = 0;
        int stackOut_528_0 = 0;
        gh stackOut_532_0 = null;
        int stackOut_532_1 = 0;
        int stackOut_532_2 = 0;
        int stackOut_532_3 = 0;
        gh stackOut_534_0 = null;
        int stackOut_534_1 = 0;
        int stackOut_534_2 = 0;
        int stackOut_534_3 = 0;
        int stackOut_534_4 = 0;
        gh stackOut_533_0 = null;
        int stackOut_533_1 = 0;
        int stackOut_533_2 = 0;
        int stackOut_533_3 = 0;
        int stackOut_533_4 = 0;
        gh stackOut_471_0 = null;
        gh stackOut_471_1 = null;
        String stackOut_471_2 = null;
        gh stackOut_473_0 = null;
        gh stackOut_473_1 = null;
        String stackOut_473_2 = null;
        gh stackOut_473_3 = null;
        gh stackOut_472_0 = null;
        gh stackOut_472_1 = null;
        String stackOut_472_2 = null;
        Object stackOut_472_3 = null;
        gh stackOut_474_0 = null;
        wk[] stackOut_474_1 = null;
        int stackOut_474_2 = 0;
        gh stackOut_476_0 = null;
        wk[] stackOut_476_1 = null;
        int stackOut_476_2 = 0;
        int stackOut_476_3 = 0;
        gh stackOut_475_0 = null;
        wk[] stackOut_475_1 = null;
        int stackOut_475_2 = 0;
        int stackOut_475_3 = 0;
        L0: {
          var81 = null;
          var82 = null;
          var83 = null;
          var32 = SteelSentinels.field_G;
          var1_int = 0;
          var2 = 0;
          if (ti.field_B == null) {
            if (ij.field_Y >= 0) {
              var2 = 16;
              break L0;
            } else {
              break L0;
            }
          } else {
            var2 = 100;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == bl.field_c) {
              break L2;
            } else {
              if (~bl.field_c.field_Rb < ~oh.field_f) {
                break L2;
              } else {
                if (~(var2 + bl.field_c.field_Rb + bl.field_c.field_zb) >= ~oh.field_f) {
                  break L2;
                } else {
                  if (bl.field_c.field_cb > pi.field_c) {
                    break L2;
                  } else {
                    if (bl.field_c.field_Lb + bl.field_c.field_cb <= pi.field_c) {
                      break L2;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_11_0 = 0;
          stackIn_12_0 = stackOut_11_0;
          break L1;
        }
        L3: {
          L4: {
            var3 = stackIn_12_0;
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
          L6: {
            sn.field_l = var3 != 0;
            if (kk.field_a == null) {
              break L6;
            } else {
              if (~oh.field_f > ~kk.field_a.field_Rb) {
                break L6;
              } else {
                if (~(kk.field_a.field_zb + kk.field_a.field_Rb) >= ~oh.field_f) {
                  break L6;
                } else {
                  if (~kk.field_a.field_cb < ~pi.field_c) {
                    break L6;
                  } else {
                    if (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) {
                      break L6;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L5;
                    }
                  }
                }
              }
            }
          }
          stackOut_22_0 = 0;
          stackIn_23_0 = stackOut_22_0;
          break L5;
        }
        L7: {
          L8: {
            var4 = stackIn_23_0;
            if (var4 != 0) {
              break L8;
            } else {
              if (!nl.field_X) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          lg.field_l = true;
          break L7;
        }
        L9: {
          if (dc.field_g >= 0) {
            kf.field_s = true;
            lg.field_l = true;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          nl.field_X = var4 != 0;
          if (qa.field_M == 0) {
            break L10;
          } else {
            if (57 != qa.field_M) {
              lg.field_l = true;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (fg.field_Ob != 1) {
            qa.field_M = Math.max(qa.field_M - 6, 0);
            break L11;
          } else {
            qa.field_M = Math.min(qa.field_M - -6, 57);
            break L11;
          }
        }
        L12: {
          if (qa.field_M == 0) {
            break L12;
          } else {
            if (qa.field_M != 57) {
              lg.field_l = true;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L13: {
          if (null == hl.field_v) {
            break L13;
          } else {
            L14: {
              if (null == kh.field_v) {
                break L14;
              } else {
                if (~kh.field_v.field_N == ~hl.field_v.field_N) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            var5 = uc.field_b[0];
            var77 = nl.a(var5, (byte) 123);
            var7_int = 0;
            L15: while (true) {
              if (var7_int >= dn.field_bc.length) {
                kh.field_v = ji.a(var77, (byte) -50, dn.field_bc);
                break L13;
              } else {
                dn.field_bc[var7_int] = -1;
                var7_int++;
                continue L15;
              }
            }
          }
        }
        L16: {
          if (-2 != pa.field_e) {
            break L16;
          } else {
            if (lb.field_gc != 1) {
              break L16;
            } else {
              if (he.a((byte) 127)) {
                var5 = 0;
                L17: while (true) {
                  if (var5 >= di.field_c.length) {
                    break L16;
                  } else {
                    di.field_c[var5] = dn.field_bc[var5];
                    var5++;
                    continue L17;
                  }
                }
              } else {
                break L16;
              }
            }
          }
        }
        L18: {
          L19: {
            if (pa.field_e < 0) {
              break L19;
            } else {
              if (!he.a((byte) 123)) {
                break L19;
              } else {
                if (lb.field_gc == 2) {
                  if (ij.field_Y >= 0) {
                    lg.field_l = true;
                    ij.field_Y = -1;
                    break L18;
                  } else {
                    di.field_c[pa.field_e] = -1;
                    break L18;
                  }
                } else {
                  if (lb.field_gc == 1) {
                    L20: {
                      var5 = di.field_c[pa.field_e];
                      di.field_c[pa.field_e] = ij.field_Y;
                      if (fg.field_Ob == 0) {
                        break L20;
                      } else {
                        fg.field_Ob = 0;
                        var1_int = 1;
                        kf.field_s = true;
                        lg.field_l = true;
                        break L20;
                      }
                    }
                    if (0 <= ij.field_Y) {
                      ij.field_Y = -1;
                      break L18;
                    } else {
                      ij.field_Y = var5;
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
          }
          if (lj.field_h == null) {
            break L18;
          } else {
            L21: {
              if (lb.field_gc != 1) {
                break L21;
              } else {
                if (!fc.field_e[81]) {
                  break L21;
                } else {
                  if (!he.a((byte) 118)) {
                    break L21;
                  } else {
                    L22: {
                      var34 = lj.field_h;
                      var6 = kh.field_v.a((byte) 2, var34);
                      if (var6 < 0) {
                        break L22;
                      } else {
                        L23: {
                          if (null == var34.field_d) {
                            break L23;
                          } else {
                            if (var6 != var34.field_d.field_N) {
                              break L23;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L24: {
                          if (null == var34.field_d) {
                            break L24;
                          } else {
                            if (83 == var34.field_d.field_N) {
                              var1_int = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                        L25: {
                          var34.field_d = new nk(ul.a(var6, (byte) 67));
                          var7_int = ub.a(125, var6);
                          if (var7_int >= 0) {
                            var8 = hl.field_v.c(0, lj.field_h.field_r);
                            if (var8 == null) {
                              break L25;
                            } else {
                              var8.field_d = new nk(ul.a(var7_int, (byte) 67));
                              break L25;
                            }
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (var6 == 83) {
                            var1_int = 1;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        ee.c(-2483, 25);
                        break L22;
                      }
                    }
                    break L18;
                  }
                }
              }
            }
            L27: {
              if (lb.field_gc != 2) {
                break L27;
              } else {
                if (!he.a((byte) 126)) {
                  break L27;
                } else {
                  if (ti.field_B == null) {
                    L28: {
                      var35 = lj.field_h.field_d;
                      if (var35 == null) {
                        break L28;
                      } else {
                        L29: {
                          if (var35.field_Q == 4) {
                            break L29;
                          } else {
                            if (var35.field_Q == 2048) {
                              break L29;
                            } else {
                              break L28;
                            }
                          }
                        }
                        var6_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                        if (var6_ref_qd == null) {
                          break L28;
                        } else {
                          var6_ref_qd.field_d = null;
                          break L28;
                        }
                      }
                    }
                    L30: {
                      lj.field_h.field_d = null;
                      if (var35 == null) {
                        break L30;
                      } else {
                        if (var35.field_N != 83) {
                          break L30;
                        } else {
                          var1_int = 1;
                          break L30;
                        }
                      }
                    }
                    break L18;
                  } else {
                    ti.field_B = null;
                    f.field_A = null;
                    break L18;
                  }
                }
              }
            }
            if (lb.field_gc != 1) {
              break L18;
            } else {
              if (he.a((byte) 126)) {
                L31: {
                  if ((fg.field_Ob & 16) == 0) {
                    break L31;
                  } else {
                    if (ti.field_B != null) {
                      if ((ti.field_B.field_Q & lj.field_h.field_q) <= 0) {
                        break L18;
                      } else {
                        L32: {
                          if (ti.field_B.field_N == 83) {
                            var1_int = 1;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        lj.field_h.field_d = new nk(ti.field_B);
                        ee.c(-2483, 25);
                        break L18;
                      }
                    } else {
                      break L31;
                    }
                  }
                }
                if (null == lj.field_h.field_d) {
                  if (null == ti.field_B) {
                    break L18;
                  } else {
                    if ((ti.field_B.field_Q & lj.field_h.field_q) <= 0) {
                      break L18;
                    } else {
                      L33: {
                        lj.field_h.field_d = ti.field_B;
                        if (ti.field_B.field_N != 83) {
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
                          if (var5_ref_qd != null) {
                            var5_ref_qd.field_d = f.field_A;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                      }
                      ti.field_B = null;
                      f.field_A = null;
                      break L18;
                    }
                  }
                } else {
                  L35: {
                    if (ti.field_B == null) {
                      break L35;
                    } else {
                      if (0 < (ti.field_B.field_Q & lj.field_h.field_q)) {
                        L36: {
                          lj.field_h.field_d = ti.field_B;
                          if (ti.field_B.field_N != 83) {
                            break L36;
                          } else {
                            var1_int = 1;
                            break L36;
                          }
                        }
                        L37: {
                          ee.c(-2483, 25);
                          if (null == f.field_A) {
                            break L37;
                          } else {
                            var5_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                            if (var5_ref_qd == null) {
                              break L37;
                            } else {
                              var5_ref_qd.field_d = f.field_A;
                              break L37;
                            }
                          }
                        }
                        f.field_A = null;
                        ti.field_B = null;
                        break L18;
                      } else {
                        break L35;
                      }
                    }
                  }
                  if (null == ti.field_B) {
                    L38: {
                      L39: {
                        ti.field_B = lj.field_h.field_d;
                        f.field_A = null;
                        if (4 == ti.field_B.field_Q) {
                          break L39;
                        } else {
                          if (ti.field_B.field_Q != 2048) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      var36 = hl.field_v.c(0, lj.field_h.field_r);
                      if (var36 != null) {
                        f.field_A = var36.field_d;
                        var36.field_d = null;
                        break L38;
                      } else {
                        f.field_A = null;
                        break L38;
                      }
                    }
                    L40: {
                      if (null == lj.field_h.field_d) {
                        break L40;
                      } else {
                        if (lj.field_h.field_d.field_N != 83) {
                          break L40;
                        } else {
                          var1_int = 1;
                          break L40;
                        }
                      }
                    }
                    L41: {
                      if (ti.field_B != null) {
                        break L41;
                      } else {
                        f.field_A = null;
                        ti.field_B = null;
                        break L41;
                      }
                    }
                    lj.field_h.field_d = null;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
          }
        }
        L42: {
          L43: {
            L44: {
              if (gd.field_jb != null) {
                L45: {
                  L46: {
                    if (null == bi.field_f) {
                      break L46;
                    } else {
                      if (null == bi.field_f.field_Ub) {
                        break L46;
                      } else {
                        stackOut_152_0 = bi.field_f.field_Ub.field_eb;
                        stackIn_154_0 = stackOut_152_0;
                        break L45;
                      }
                    }
                  }
                  stackOut_153_0 = -2147483648;
                  stackIn_154_0 = stackOut_153_0;
                  break L45;
                }
                L47: {
                  L48: {
                    var5 = stackIn_154_0;
                    if (null == vd.field_a) {
                      break L48;
                    } else {
                      if (vd.field_a.field_Ub != null) {
                        stackOut_158_0 = vd.field_a.field_Ub.field_eb;
                        stackIn_159_0 = stackOut_158_0;
                        break L47;
                      } else {
                        break L48;
                      }
                    }
                  }
                  stackOut_157_0 = -2147483648;
                  stackIn_159_0 = stackOut_157_0;
                  break L47;
                }
                L49: {
                  L50: {
                    var6 = stackIn_159_0;
                    gd.field_jb.a((byte) -107, true);
                    if (null == bi.field_f) {
                      break L50;
                    } else {
                      if (bi.field_f.field_Ub != null) {
                        stackOut_163_0 = bi.field_f.field_Ub.field_eb;
                        stackIn_164_0 = stackOut_163_0;
                        break L49;
                      } else {
                        break L50;
                      }
                    }
                  }
                  stackOut_162_0 = -2147483648;
                  stackIn_164_0 = stackOut_162_0;
                  break L49;
                }
                L51: {
                  var7_int = stackIn_164_0;
                  if (~var5 == ~var7_int) {
                    break L51;
                  } else {
                    kf.field_s = true;
                    break L51;
                  }
                }
                L52: {
                  L53: {
                    if (null == vd.field_a) {
                      break L53;
                    } else {
                      if (null == vd.field_a.field_Ub) {
                        break L53;
                      } else {
                        stackOut_168_0 = vd.field_a.field_Ub.field_eb;
                        stackIn_170_0 = stackOut_168_0;
                        break L52;
                      }
                    }
                  }
                  stackOut_169_0 = -2147483648;
                  stackIn_170_0 = stackOut_169_0;
                  break L52;
                }
                L54: {
                  var8_int = stackIn_170_0;
                  if (~var8_int == ~var6) {
                    break L54;
                  } else {
                    lg.field_l = true;
                    break L54;
                  }
                }
                L55: {
                  var37 = bi.field_f;
                  if (var37 == null) {
                    break L55;
                  } else {
                    L56: {
                      if (null != var37.field_Ub) {
                        stackOut_175_0 = var37.field_Ub.field_eb;
                        stackIn_176_0 = stackOut_175_0;
                        break L56;
                      } else {
                        stackOut_174_0 = -2147483648;
                        stackIn_176_0 = stackOut_174_0;
                        break L56;
                      }
                    }
                    L57: {
                      var10_int = stackIn_176_0;
                      var37.a((byte) 96, jj.field_d * 32, 128, false, 32);
                      if (null == var37.field_Ub) {
                        stackOut_178_0 = -2147483648;
                        stackIn_179_0 = stackOut_178_0;
                        break L57;
                      } else {
                        stackOut_177_0 = var37.field_Ub.field_eb;
                        stackIn_179_0 = stackOut_177_0;
                        break L57;
                      }
                    }
                    L58: {
                      var11_int = stackIn_179_0;
                      if (~var10_int == ~var11_int) {
                        break L58;
                      } else {
                        kf.field_s = true;
                        break L58;
                      }
                    }
                    L59: {
                      var12_int = -1;
                      if (fg.field_Ob == 0) {
                        var12_int = 3;
                        break L59;
                      } else {
                        if ((fg.field_Ob & 1) != 0) {
                          var12_int = 0;
                          break L59;
                        } else {
                          if ((fg.field_Ob & 2) != 0) {
                            var12_int = 1;
                            break L59;
                          } else {
                            if (0 == (fg.field_Ob & 16)) {
                              break L59;
                            } else {
                              var12_int = 2;
                              break L59;
                            }
                          }
                        }
                      }
                    }
                    if (var12_int >= 0) {
                      va.field_k[var12_int] = var37.field_Ub.field_eb;
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                }
                L60: {
                  var38 = vd.field_a;
                  if (var38 == null) {
                    break L60;
                  } else {
                    L61: {
                      if (var38.field_Ub != null) {
                        stackOut_195_0 = var38.field_Ub.field_eb;
                        stackIn_196_0 = stackOut_195_0;
                        break L61;
                      } else {
                        stackOut_194_0 = -2147483648;
                        stackIn_196_0 = stackOut_194_0;
                        break L61;
                      }
                    }
                    L62: {
                      var11_int = stackIn_196_0;
                      var38.a((byte) 96, 32 * jj.field_d, 128, false, 32);
                      if (null != var38.field_Ub) {
                        stackOut_198_0 = var38.field_Ub.field_eb;
                        stackIn_199_0 = stackOut_198_0;
                        break L62;
                      } else {
                        stackOut_197_0 = -2147483648;
                        stackIn_199_0 = stackOut_197_0;
                        break L62;
                      }
                    }
                    var12_int = stackIn_199_0;
                    if (~var11_int == ~var12_int) {
                      break L60;
                    } else {
                      lg.field_l = true;
                      break L60;
                    }
                  }
                }
                L63: {
                  if (lb.field_gc == 1) {
                    L64: {
                      var11_int = fg.field_Ob;
                      var39 = wc.field_h[0];
                      var49 = var39;
                      var49 = var39;
                      if (var39 == null) {
                        break L64;
                      } else {
                        if (var39.field_kb) {
                          fg.field_Ob = 1;
                          var1_int = 1;
                          break L64;
                        } else {
                          break L64;
                        }
                      }
                    }
                    L65: {
                      var40 = wc.field_h[1];
                      var49 = var40;
                      var49 = var40;
                      if (var40 == null) {
                        break L65;
                      } else {
                        if (var40.field_kb) {
                          fg.field_Ob = 2062;
                          var1_int = 1;
                          break L65;
                        } else {
                          break L65;
                        }
                      }
                    }
                    L66: {
                      var41 = wc.field_h[2];
                      var49 = var41;
                      var49 = var41;
                      if (var41 == null) {
                        break L66;
                      } else {
                        if (!var41.field_kb) {
                          break L66;
                        } else {
                          fg.field_Ob = 1008;
                          var1_int = 1;
                          break L66;
                        }
                      }
                    }
                    L67: {
                      var42 = wc.field_h[3];
                      var49 = var42;
                      var49 = var42;
                      if (var42 == null) {
                        break L67;
                      } else {
                        if (var42.field_kb) {
                          var1_int = 1;
                          fg.field_Ob = 0;
                          break L67;
                        } else {
                          break L67;
                        }
                      }
                    }
                    if (var11_int == fg.field_Ob) {
                      break L63;
                    } else {
                      L68: {
                        if (var37 != null) {
                          L69: {
                            var13 = -1;
                            if (0 == (var11_int & 1)) {
                              break L69;
                            } else {
                              var13 = 0;
                              break L69;
                            }
                          }
                          L70: {
                            if ((2 & var11_int) == 0) {
                              break L70;
                            } else {
                              var13 = 1;
                              break L70;
                            }
                          }
                          L71: {
                            if ((16 & var11_int) == 0) {
                              break L71;
                            } else {
                              var13 = 2;
                              break L71;
                            }
                          }
                          L72: {
                            if (var11_int == 0) {
                              var13 = 3;
                              break L72;
                            } else {
                              break L72;
                            }
                          }
                          if (0 > var13) {
                            break L68;
                          } else {
                            va.field_k[var13] = var37.field_Ub.field_eb;
                            break L68;
                          }
                        } else {
                          break L68;
                        }
                      }
                      f.field_A = null;
                      ij.field_Y = -1;
                      ti.field_B = null;
                      ee.c(-2483, 95);
                      break L63;
                    }
                  } else {
                    break L63;
                  }
                }
                L73: {
                  t.field_h = -1;
                  df.field_K = false;
                  f.field_y = null;
                  var11 = rh.field_u;
                  if (var11 == null) {
                    break L73;
                  } else {
                    if (fg.field_Ob == 0) {
                      var12_int = 0;
                      L74: while (true) {
                        if (var12_int >= 35) {
                          break L73;
                        } else {
                          L75: {
                            var49 = cj.field_a[var12_int];
                            if (var49 == null) {
                              break L75;
                            } else {
                              if (var49.field_kb) {
                                L76: {
                                  var50 = var49.a("engineer", false);
                                  if (var50 == null) {
                                    break L76;
                                  } else {
                                    if (var50.field_kb) {
                                      df.field_K = true;
                                      break L76;
                                    } else {
                                      break L76;
                                    }
                                  }
                                }
                                L77: {
                                  L78: {
                                    if (lb.field_gc != 1) {
                                      break L78;
                                    } else {
                                      if (!df.field_K) {
                                        break L78;
                                      } else {
                                        if (he.a((byte) 121)) {
                                          L79: {
                                            var15 = null;
                                            if (!t.a(fe.field_D, var12_int, -20370)) {
                                              if (ad.a(var12_int, nk.f((byte) -96), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                                                if (qf.field_h[var12_int] > li.field_v) {
                                                  var15 = (Object) (Object) hd.field_g;
                                                  ln.field_c = b.field_q[2];
                                                  break L79;
                                                } else {
                                                  break L79;
                                                }
                                              } else {
                                                L80: {
                                                  var15 = (Object) (Object) ha.field_R;
                                                  ln.field_c = b.field_q[2];
                                                  var16_int = nm.a(8241, var12_int);
                                                  if (var16_int < 0) {
                                                    break L80;
                                                  } else {
                                                    if (t.a(fe.field_D, var16_int, -20370)) {
                                                      break L80;
                                                    } else {
                                                      var15 = (Object) (Object) oc.field_e;
                                                      var15 = (Object) (Object) db.a((String) var15, -65, new String[2]);
                                                      break L80;
                                                    }
                                                  }
                                                }
                                                var17 = var12_int;
                                                if (var17 == 26) {
                                                  var15 = (Object) (Object) b.field_i;
                                                  break L79;
                                                } else {
                                                  if (var17 == 23) {
                                                    var15 = (Object) (Object) k.field_Eb;
                                                    break L79;
                                                  } else {
                                                    if (25 != var17) {
                                                      if (var17 != 27) {
                                                        break L79;
                                                      } else {
                                                        var15 = (Object) (Object) kd.field_t;
                                                        break L79;
                                                      }
                                                    } else {
                                                      var15 = (Object) (Object) rd.field_c;
                                                      break L79;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              ln.field_c = b.field_q[0];
                                              var15 = (Object) (Object) va.field_i;
                                              break L79;
                                            }
                                          }
                                          L81: {
                                            if (var15 != null) {
                                              break L81;
                                            } else {
                                              if (ni.b(48)) {
                                                break L81;
                                              } else {
                                                sn.field_q = var12_int;
                                                f.field_v = qf.field_h[var12_int];
                                                ee.c(-2483, 95);
                                                break L81;
                                              }
                                            }
                                          }
                                          if (var15 != null) {
                                            L82: {
                                              stackOut_416_0 = var15;
                                              stackOut_416_1 = -51;
                                              stackOut_416_2 = new String[1];
                                              stackOut_416_3 = new String[1];
                                              stackOut_416_4 = 0;
                                              stackIn_418_0 = stackOut_416_0;
                                              stackIn_418_1 = stackOut_416_1;
                                              stackIn_418_2 = stackOut_416_2;
                                              stackIn_418_3 = stackOut_416_3;
                                              stackIn_418_4 = stackOut_416_4;
                                              stackIn_417_0 = stackOut_416_0;
                                              stackIn_417_1 = stackOut_416_1;
                                              stackIn_417_2 = stackOut_416_2;
                                              stackIn_417_3 = stackOut_416_3;
                                              stackIn_417_4 = stackOut_416_4;
                                              if (var12_int == 34) {
                                                stackOut_418_0 = stackIn_418_0;
                                                stackOut_418_1 = stackIn_418_1;
                                                stackOut_418_2 = (String[]) (Object) stackIn_418_2;
                                                stackOut_418_3 = (String[]) (Object) stackIn_418_3;
                                                stackOut_418_4 = stackIn_418_4;
                                                stackOut_418_5 = "GODULE";
                                                stackIn_419_0 = stackOut_418_0;
                                                stackIn_419_1 = stackOut_418_1;
                                                stackIn_419_2 = stackOut_418_2;
                                                stackIn_419_3 = stackOut_418_3;
                                                stackIn_419_4 = stackOut_418_4;
                                                stackIn_419_5 = stackOut_418_5;
                                                break L82;
                                              } else {
                                                stackOut_417_0 = stackIn_417_0;
                                                stackOut_417_1 = stackIn_417_1;
                                                stackOut_417_2 = (String[]) (Object) stackIn_417_2;
                                                stackOut_417_3 = (String[]) (Object) stackIn_417_3;
                                                stackOut_417_4 = stackIn_417_4;
                                                stackOut_417_5 = field_m[var12_int];
                                                stackIn_419_0 = stackOut_417_0;
                                                stackIn_419_1 = stackOut_417_1;
                                                stackIn_419_2 = stackOut_417_2;
                                                stackIn_419_3 = stackOut_417_3;
                                                stackIn_419_4 = stackOut_417_4;
                                                stackIn_419_5 = stackOut_417_5;
                                                break L82;
                                              }
                                            }
                                            stackIn_419_3[stackIn_419_4] = stackIn_419_5;
                                            km.field_a = db.a((String) (Object) stackIn_419_0, stackIn_419_1, stackIn_419_2);
                                            break L77;
                                          } else {
                                            break L77;
                                          }
                                        } else {
                                          break L78;
                                        }
                                      }
                                    }
                                  }
                                  if (1 != lb.field_gc) {
                                    break L77;
                                  } else {
                                    if (!uc.a(var12_int, -3958)) {
                                      break L77;
                                    } else {
                                      if (he.a((byte) 127)) {
                                        ij.field_Y = var12_int;
                                        ti.field_B = null;
                                        f.field_A = null;
                                        ee.c(-2483, 100);
                                        break L77;
                                      } else {
                                        break L77;
                                      }
                                    }
                                  }
                                }
                                t.field_h = var12_int;
                                if (null == f.field_y) {
                                  var51 = new jc(var49.field_M);
                                  var16 = (gh) (Object) var51.b(2);
                                  L83: while (true) {
                                    if (var16 == null) {
                                      break L75;
                                    } else {
                                      L84: {
                                        if (!var16.field_kb) {
                                          break L84;
                                        } else {
                                          if (var16.field_S == null) {
                                            break L84;
                                          } else {
                                            if (!var16.field_S.startsWith("<img=")) {
                                              break L84;
                                            } else {
                                              if (7 == var16.field_S.length()) {
                                                f.field_y = var16;
                                                break L75;
                                              } else {
                                                break L84;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var16 = (gh) (Object) var51.d(2);
                                      continue L83;
                                    }
                                  }
                                } else {
                                  break L75;
                                }
                              } else {
                                break L75;
                              }
                            }
                          }
                          var12_int++;
                          continue L74;
                        }
                      }
                    } else {
                      var12_int = 0;
                      var13_ref_nk = (nk) (Object) ao.field_H.e(13058);
                      L85: while (true) {
                        if (var13_ref_nk == null) {
                          L86: {
                            if (fg.field_Ob != 1) {
                              break L86;
                            } else {
                              var13 = 0;
                              L87: while (true) {
                                if (~ue.field_c.length >= ~var13) {
                                  break L86;
                                } else {
                                  L88: {
                                    var14_int = var13 + 101;
                                    if (null == ue.field_c[var13]) {
                                      stackOut_323_0 = null;
                                      stackIn_324_0 = (gh) (Object) stackOut_323_0;
                                      break L88;
                                    } else {
                                      stackOut_322_0 = cj.field_a[var14_int];
                                      stackIn_324_0 = stackOut_322_0;
                                      break L88;
                                    }
                                  }
                                  L89: {
                                    var47 = stackIn_324_0;
                                    var15 = (Object) (Object) var47;
                                    if (var15 == null) {
                                      break L89;
                                    } else {
                                      if (!var47.field_kb) {
                                        break L89;
                                      } else {
                                        if (lb.field_gc != 1) {
                                          break L89;
                                        } else {
                                          L90: {
                                            var48 = ((gh) var15).a("bin", false);
                                            if (var48 == null) {
                                              break L90;
                                            } else {
                                              if (var48.field_kb) {
                                                ue.field_c[var13] = null;
                                                var17 = var13;
                                                L91: while (true) {
                                                  if (ue.field_c.length - 1 <= var17) {
                                                    ue.field_c[ue.field_c.length + -1] = null;
                                                    ue.field_g[ue.field_c.length - 1] = null;
                                                    var1_int = 1;
                                                    break L89;
                                                  } else {
                                                    ue.field_c[var17] = ue.field_c[1 + var17];
                                                    ue.field_g[var17] = ue.field_g[1 + var17];
                                                    var17++;
                                                    continue L91;
                                                  }
                                                }
                                              } else {
                                                break L90;
                                              }
                                            }
                                          }
                                          L92: {
                                            var17 = 0;
                                            if (nk.f((byte) -46)) {
                                              break L92;
                                            } else {
                                              var18 = 0;
                                              L93: while (true) {
                                                if (~var18 <= ~ue.field_c[var13].length) {
                                                  break L92;
                                                } else {
                                                  L94: {
                                                    stackOut_333_0 = ue.field_c[var13][var18];
                                                    stackOut_333_1 = -109;
                                                    stackIn_335_0 = stackOut_333_0;
                                                    stackIn_335_1 = stackOut_333_1;
                                                    stackIn_334_0 = stackOut_333_0;
                                                    stackIn_334_1 = stackOut_333_1;
                                                    if (var18 < -8 + ue.field_c[var13].length) {
                                                      stackOut_335_0 = stackIn_335_0;
                                                      stackOut_335_1 = stackIn_335_1;
                                                      stackOut_335_2 = 0;
                                                      stackIn_336_0 = stackOut_335_0;
                                                      stackIn_336_1 = stackOut_335_1;
                                                      stackIn_336_2 = stackOut_335_2;
                                                      break L94;
                                                    } else {
                                                      stackOut_334_0 = stackIn_334_0;
                                                      stackOut_334_1 = stackIn_334_1;
                                                      stackOut_334_2 = 1;
                                                      stackIn_336_0 = stackOut_334_0;
                                                      stackIn_336_1 = stackOut_334_1;
                                                      stackIn_336_2 = stackOut_334_2;
                                                      break L94;
                                                    }
                                                  }
                                                  if (oc.a(stackIn_336_0, stackIn_336_1, stackIn_336_2 == 0)) {
                                                    var18++;
                                                    continue L93;
                                                  } else {
                                                    var17 = 1;
                                                    break L92;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L95: {
                                            if (var17 != 0) {
                                              break L95;
                                            } else {
                                              ee.c(-2483, 99);
                                              di.field_c = new int[8];
                                              var12_int = 1;
                                              var18 = 0;
                                              L96: while (true) {
                                                if (var18 >= 8) {
                                                  L97: {
                                                    var18_ref_int__ = ue.field_c[var13];
                                                    ij.field_Y = -1;
                                                    if (var18_ref_int__ != null) {
                                                      uc.field_b = var18_ref_int__;
                                                      break L97;
                                                    } else {
                                                      break L97;
                                                    }
                                                  }
                                                  ti.field_B = null;
                                                  break L95;
                                                } else {
                                                  di.field_c[var18] = -1;
                                                  var18++;
                                                  continue L96;
                                                }
                                              }
                                            }
                                          }
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                  var13++;
                                  continue L87;
                                }
                              }
                            }
                          }
                          if (var12_int != 0) {
                            hl.field_v = ji.a(uc.field_b, (byte) -53, di.field_c);
                            hl.field_v.b(6993661, 113);
                            break L73;
                          } else {
                            L98: {
                              if (lb.field_gc != 2) {
                                break L98;
                              } else {
                                if (!he.a((byte) 126)) {
                                  break L98;
                                } else {
                                  ij.field_Y = -1;
                                  ti.field_B = null;
                                  f.field_A = null;
                                  break L98;
                                }
                              }
                            }
                            L99: {
                              if (ti.field_B != null) {
                                stackOut_359_0 = ti.field_B.field_N;
                                stackIn_360_0 = stackOut_359_0;
                                break L99;
                              } else {
                                stackOut_358_0 = -1;
                                stackIn_360_0 = stackOut_358_0;
                                break L99;
                              }
                            }
                            L100: {
                              var5 = stackIn_360_0;
                              if (var5 >= 0) {
                                break L100;
                              } else {
                                if (ij.field_Y < 0) {
                                  break L100;
                                } else {
                                  var5 = ij.field_Y;
                                  break L100;
                                }
                              }
                            }
                            L101: {
                              if (~var5 != ~fl.field_a) {
                                lg.field_l = true;
                                fl.field_a = var5;
                                ad.field_h = true;
                                kf.field_s = true;
                                break L101;
                              } else {
                                break L101;
                              }
                            }
                            L102: {
                              if (var1_int == 0) {
                                break L102;
                              } else {
                                if (gd.field_jb == null) {
                                  break L102;
                                } else {
                                  vn.d(-95);
                                  break L102;
                                }
                              }
                            }
                            if (gd.field_jb != null) {
                              break L42;
                            } else {
                              var6 = 0;
                              L103: while (true) {
                                if (~var6 <= ~jg.field_h.length) {
                                  break L43;
                                } else {
                                  jg.field_h[var6] = null;
                                  var6++;
                                  continue L103;
                                }
                              }
                            }
                          }
                        } else {
                          L104: {
                            var14 = null;
                            if (0 > var13_ref_nk.field_N) {
                              break L104;
                            } else {
                              if (var13_ref_nk.field_N >= cj.field_a.length) {
                                break L104;
                              } else {
                                if (0 == (fg.field_Ob & var13_ref_nk.field_Q)) {
                                  break L104;
                                } else {
                                  var14 = (Object) (Object) cj.field_a[var13_ref_nk.field_N];
                                  break L104;
                                }
                              }
                            }
                          }
                          L105: {
                            if (var14 == null) {
                              break L105;
                            } else {
                              if (!((gh) var14).field_kb) {
                                break L105;
                              } else {
                                L106: {
                                  var43 = ((gh) var14).a("engineer", false);
                                  if (var43 == null) {
                                    break L106;
                                  } else {
                                    if (!var43.field_kb) {
                                      break L106;
                                    } else {
                                      df.field_K = true;
                                      break L106;
                                    }
                                  }
                                }
                                L107: {
                                  L108: {
                                    if (1 != lb.field_gc) {
                                      break L108;
                                    } else {
                                      if (!df.field_K) {
                                        break L108;
                                      } else {
                                        if (!he.a((byte) 117)) {
                                          break L108;
                                        } else {
                                          L109: {
                                            var16_int = 0;
                                            if (1 == var13_ref_nk.field_Q) {
                                              var17_ref = (Object) (Object) ki.b(var13_ref_nk.field_N, (byte) -85);
                                              var18_ref_int__ = ne.a(var13_ref_nk.field_N, (byte) 28);
                                              var78 = (int[]) var17_ref;
                                              var20_int = 0;
                                              L110: while (true) {
                                                if (~var78.length >= ~var20_int) {
                                                  var79 = var18_ref_int__;
                                                  var20_int = 0;
                                                  L111: while (true) {
                                                    if (var20_int >= var79.length) {
                                                      break L109;
                                                    } else {
                                                      L112: {
                                                        var21_int = var79[var20_int];
                                                        if (!t.a(rn.field_D, var21_int, -20370)) {
                                                          var16_int = var16_int + sj.field_v[var21_int];
                                                          break L112;
                                                        } else {
                                                          break L112;
                                                        }
                                                      }
                                                      var20_int++;
                                                      continue L111;
                                                    }
                                                  }
                                                } else {
                                                  L113: {
                                                    var21_int = var78[var20_int];
                                                    if (!t.a(fe.field_D, var21_int, -20370)) {
                                                      var16_int = var16_int + qf.field_h[var21_int];
                                                      break L113;
                                                    } else {
                                                      break L113;
                                                    }
                                                  }
                                                  var20_int++;
                                                  continue L110;
                                                }
                                              }
                                            } else {
                                              var16_int = sj.field_v[var13_ref_nk.field_N];
                                              break L109;
                                            }
                                          }
                                          L114: {
                                            var17_ref = null;
                                            if (t.a(rn.field_D, var13_ref_nk.field_N, -20370)) {
                                              var17_ref = (Object) (Object) qi.field_e;
                                              ln.field_c = b.field_q[0];
                                              break L114;
                                            } else {
                                              if (~var16_int < ~li.field_v) {
                                                ln.field_c = b.field_q[2];
                                                var17_ref = (Object) (Object) bj.field_a;
                                                break L114;
                                              } else {
                                                break L114;
                                              }
                                            }
                                          }
                                          L115: {
                                            if (var17_ref != null) {
                                              break L115;
                                            } else {
                                              if (!ni.b(88)) {
                                                f.field_v = var16_int;
                                                sn.field_q = var13_ref_nk.field_N + 128;
                                                ee.c(-2483, 95);
                                                break L115;
                                              } else {
                                                break L115;
                                              }
                                            }
                                          }
                                          if (var17_ref == null) {
                                            break L107;
                                          } else {
                                            km.field_a = db.a((String) var17_ref, -20, new String[1]);
                                            break L107;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (lb.field_gc != 1) {
                                    break L107;
                                  } else {
                                    if (!mm.a(-16242, var13_ref_nk)) {
                                      break L107;
                                    } else {
                                      L116: {
                                        if (var13_ref_nk.field_Q == 1) {
                                          break L116;
                                        } else {
                                          if (!he.a((byte) 116)) {
                                            break L107;
                                          } else {
                                            if (!hl.field_v.f(var13_ref_nk.field_Q, -1)) {
                                              break L107;
                                            } else {
                                              break L116;
                                            }
                                          }
                                        }
                                      }
                                      L117: {
                                        if (var13_ref_nk.field_Q != 1) {
                                          break L117;
                                        } else {
                                          if (var13_ref_nk.field_N == 55) {
                                            break L117;
                                          } else {
                                            if ((4 & dm.field_a) != 0) {
                                              break L117;
                                            } else {
                                              if (he.a((byte) 120)) {
                                                break L117;
                                              } else {
                                                L118: {
                                                  if (var13_ref_nk.field_N == 57) {
                                                    stackOut_286_0 = 6;
                                                    stackIn_287_0 = stackOut_286_0;
                                                    break L118;
                                                  } else {
                                                    stackOut_285_0 = 10;
                                                    stackIn_287_0 = stackOut_285_0;
                                                    break L118;
                                                  }
                                                }
                                                if (stackIn_287_0 > fm.field_f[0]) {
                                                  km.field_a = dj.field_i;
                                                  dm.field_a = dm.field_a | 4;
                                                  if (!ni.b(89)) {
                                                    int discarded$3 = 3;
                                                    um.f();
                                                    break L107;
                                                  } else {
                                                    break L107;
                                                  }
                                                } else {
                                                  break L117;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var13_ref_nk.field_Q != 1) {
                                        L119: {
                                          ee.c(-2483, 100);
                                          t.field_h = var13_ref_nk.field_N;
                                          ti.field_B = new nk(var13_ref_nk);
                                          f.field_A = null;
                                          var16_int = ub.a(119, var13_ref_nk.field_N);
                                          if (var16_int >= 0) {
                                            f.field_A = new nk(ul.a(var16_int, (byte) 67));
                                            break L119;
                                          } else {
                                            break L119;
                                          }
                                        }
                                        ij.field_Y = -1;
                                        break L107;
                                      } else {
                                        ee.c(-2483, 99);
                                        di.field_c = new int[8];
                                        qh.field_Wb = true;
                                        var16_int = 0;
                                        L120: while (true) {
                                          if (var16_int >= 8) {
                                            L121: {
                                              var12_int = 1;
                                              var16_array = nl.a(var13_ref_nk.field_N, (byte) 123);
                                              if (var16_array != null) {
                                                uc.field_b = var16_array;
                                                break L121;
                                              } else {
                                                var12_int = 0;
                                                hl.field_v = new nk(var13_ref_nk);
                                                break L121;
                                              }
                                            }
                                            ij.field_Y = -1;
                                            ti.field_B = null;
                                            break L107;
                                          } else {
                                            di.field_c[var16_int] = -1;
                                            var16_int++;
                                            continue L120;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                t.field_h = var13_ref_nk.field_N;
                                if (null == f.field_y) {
                                  var46 = new jc(((gh) var14).field_M);
                                  var17_ref = (Object) (Object) (gh) (Object) var46.b(2);
                                  L122: while (true) {
                                    if (var17_ref == null) {
                                      break L105;
                                    } else {
                                      L123: {
                                        if (!((gh) var17_ref).field_kb) {
                                          break L123;
                                        } else {
                                          if (null == ((gh) var17_ref).field_S) {
                                            break L123;
                                          } else {
                                            L124: {
                                              if (((gh) var17_ref).field_S.startsWith("<img=6>")) {
                                                break L124;
                                              } else {
                                                if (((gh) var17_ref).field_S.startsWith("<img=2>")) {
                                                  break L124;
                                                } else {
                                                  if (((gh) var17_ref).field_S.startsWith("<img=3>")) {
                                                    break L124;
                                                  } else {
                                                    if (((gh) var17_ref).field_S.length() != 7) {
                                                      break L123;
                                                    } else {
                                                      if (((gh) var17_ref).field_S.startsWith("<img=")) {
                                                        break L124;
                                                      } else {
                                                        break L123;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            f.field_y = (gh) var17_ref;
                                            break L105;
                                          }
                                        }
                                      }
                                      var17_ref = (Object) (Object) (gh) (Object) var46.d(2);
                                      continue L122;
                                    }
                                  }
                                } else {
                                  var13_ref_nk = (nk) (Object) ao.field_H.a((byte) -27);
                                  continue L85;
                                }
                              }
                            }
                          }
                          var13_ref_nk = (nk) (Object) ao.field_H.a((byte) -27);
                          continue L85;
                        }
                      }
                    }
                  }
                }
                if (lb.field_gc != 2) {
                  break L44;
                } else {
                  if (!he.a((byte) 126)) {
                    break L44;
                  } else {
                    ij.field_Y = -1;
                    ti.field_B = null;
                    f.field_A = null;
                    break L44;
                  }
                }
              } else {
                break L44;
              }
            }
            L125: {
              if (ti.field_B != null) {
                stackOut_437_0 = ti.field_B.field_N;
                stackIn_438_0 = stackOut_437_0;
                break L125;
              } else {
                stackOut_436_0 = -1;
                stackIn_438_0 = stackOut_436_0;
                break L125;
              }
            }
            L126: {
              var5 = stackIn_438_0;
              if (var5 >= 0) {
                break L126;
              } else {
                if (ij.field_Y < 0) {
                  break L126;
                } else {
                  var5 = ij.field_Y;
                  break L126;
                }
              }
            }
            L127: {
              if (~var5 != ~fl.field_a) {
                lg.field_l = true;
                fl.field_a = var5;
                ad.field_h = true;
                kf.field_s = true;
                break L127;
              } else {
                break L127;
              }
            }
            L128: {
              if (var1_int == 0) {
                break L128;
              } else {
                if (gd.field_jb == null) {
                  break L128;
                } else {
                  vn.d(-95);
                  break L128;
                }
              }
            }
            if (gd.field_jb != null) {
              break L42;
            } else {
              var6 = 0;
              L129: while (true) {
                if (~var6 <= ~jg.field_h.length) {
                  break L43;
                } else {
                  jg.field_h[var6] = null;
                  var6++;
                  continue L129;
                }
              }
            }
          }
          L130: {
            L131: {
              var6 = jj.field_e.field_z;
              jj.field_e.d();
              pb.a(0, 0, var6, var6, 0);
              var7_int = ul.a((byte) 105, uc.field_b[0]);
              if (var7_int < 0) {
                break L131;
              } else {
                if (~si.field_E.length >= ~var7_int) {
                  break L131;
                } else {
                  break L130;
                }
              }
            }
            var7_int = 0;
            break L130;
          }
          si.field_E[var7_int].c(0, 0, 4 * var6, 4 * var6);
          sb.field_bb.b((byte) 122);
          var6 = hj.field_w;
          hj.field_w = 4096;
          var7 = new gh();
          var7.field_I = wd.field_a;
          var7.field_Kb = 1;
          var7.field_nb = 16777215;
          var7.field_L = (mi) (Object) fk.field_d;
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
          var14 = (Object) (Object) new gh("", var7);
          ((gh) var14).field_I = sb.field_X;
          ((gh) var14).field_Ab = oe.field_f;
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
          var63.field_L = (mi) (Object) fk.field_d;
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
          L132: while (true) {
            if (~var17 >= ~var20_int) {
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
              L133: while (true) {
                if (var25 >= cj.field_a.length) {
                  L134: {
                    var25 = bl.field_c.field_zb + (-(2 * pf.field_n) - bi.field_d) - bg.field_y;
                    qa.field_O = var25;
                    var26_int = -2;
                    if (fg.field_Ob != 0) {
                      int discarded$4 = -1;
                      var26_int = te.a(var57, var26_int, true);
                      break L134;
                    } else {
                      var26_int = pi.a((byte) -46, var57, var26_int, true);
                      break L134;
                    }
                  }
                  L135: {
                    var27_ref = null;
                    if (1 != fg.field_Ob) {
                      if (!he.a((byte) 124)) {
                        var27_ref = (Object) (Object) ai.field_v;
                        break L135;
                      } else {
                        if ((2 & fg.field_Ob) != 0) {
                          var27_ref = (Object) (Object) li.field_E;
                          break L135;
                        } else {
                          if ((fg.field_Ob & 16) != 0) {
                            var27_ref = (Object) (Object) re.field_hb;
                            break L135;
                          } else {
                            if (fg.field_Ob != 0) {
                              break L135;
                            } else {
                              var27_ref = (Object) (Object) bg.field_D;
                              break L135;
                            }
                          }
                        }
                      }
                    } else {
                      var27_ref = (Object) (Object) kc.field_u;
                      break L135;
                    }
                  }
                  L136: {
                    if (var27_ref == null) {
                      break L136;
                    } else {
                      var58 = new gh(-1L, kh.field_s);
                      var29 = fk.field_d.a((String) var27_ref, -(2 * var58.field_ub) + var25 + -(var58.field_qb * 2), kh.field_s.field_Ib);
                      var59 = new gh(-1L, (gh) null);
                      var26_int += 2;
                      var57.a(var59, 127);
                      var59.a(0, var26_int, var29, 0, var25);
                      var58.field_S = (String) var27_ref;
                      var58.a(0, 0, var29, 0, var25 - 2 * var58.field_qb);
                      var59.a(var58, 125);
                      var26_int = var26_int + var29;
                      var26_int -= 2;
                      var26_int += 8;
                      break L136;
                    }
                  }
                  L137: {
                    hb.field_d = var26_int;
                    if (fg.field_Ob == 0) {
                      var26_int = pi.a((byte) -70, var57, var26_int, false);
                      break L137;
                    } else {
                      int discarded$5 = -1;
                      var26_int = te.a(var57, var26_int, false);
                      break L137;
                    }
                  }
                  L138: {
                    var28 = 0;
                    if (1 == fg.field_Ob) {
                      var80 = ue.field_c;
                      var30 = 0;
                      L139: while (true) {
                        if (~var80.length >= ~var30) {
                          if (var28 > 0) {
                            var26_int = si.a(var57, true, var26_int + 4);
                            break L138;
                          } else {
                            break L138;
                          }
                        } else {
                          L140: {
                            var31 = var80[var30];
                            if (var31 != null) {
                              var28++;
                              break L140;
                            } else {
                              break L140;
                            }
                          }
                          var30++;
                          continue L139;
                        }
                      }
                    } else {
                      break L138;
                    }
                  }
                  L141: {
                    if (var27_ref != null) {
                      var26_int += 2;
                      break L141;
                    } else {
                      break L141;
                    }
                  }
                  L142: {
                    var57.a(0, 0, var26_int, 0, 0);
                    var84 = (CharSequence) (Object) "Scrollingview";
                    var61 = new kg(ke.a(var84, (byte) -48), var57, (gh) null, var23);
                    bi.field_f = var61;
                    var61.a(bl.field_c.field_zb + -(2 * pf.field_n), -2048, bi.field_d, bl.field_c.field_Lb + -(pf.field_n * 2), bg.field_y, pf.field_n, pf.field_n);
                    bl.field_c.a((gh) (Object) var61, 124);
                    var30 = -1;
                    if (fg.field_Ob == 0) {
                      var30 = 3;
                      break L142;
                    } else {
                      if ((1 & fg.field_Ob) == 0) {
                        if (0 != (16 & fg.field_Ob)) {
                          var30 = 2;
                          break L142;
                        } else {
                          if ((fg.field_Ob & 2) == 0) {
                            break L142;
                          } else {
                            var30 = 1;
                            break L142;
                          }
                        }
                      } else {
                        var30 = 0;
                        break L142;
                      }
                    }
                  }
                  L143: {
                    if (0 <= var30) {
                      var61.field_Ub.field_eb = va.field_k[var30];
                      var61.field_Sb.a(var61.field_Tb.field_Lb, -va.field_k[var30], var61.field_Ub.field_Lb, -1);
                      break L143;
                    } else {
                      break L143;
                    }
                  }
                  L144: {
                    hj.field_w = var6;
                    kk.field_a = new gh("Itempane", kh.field_s);
                    kk.field_a.a(0, 64, 280, 518, 110);
                    gd.field_jb.a(kk.field_a, 127);
                    var62 = new gh(-1L, (gh) null);
                    var62.field_I = tk.field_t;
                    var62.a(0, 20, 257, 0, 110);
                    kk.field_a.a(var62, 126);
                    if (fg.field_Ob == 1) {
                      kk.field_a.field_S = "";
                      break L144;
                    } else {
                      if ((2 & fg.field_Ob) > 0) {
                        var67 = new gh("", var63);
                        var67.field_S = mc.field_b;
                        var67.a(0, 0, 18, 0, 110);
                        kk.field_a.a(var67, 122);
                        var26 = new gh("DataListView", (gh) null);
                        hm.field_a = var26;
                        var27 = 4 + oc.a(4, var26);
                        var26.field_I = tk.field_t;
                        var26.a(0, 20, var27, 0, 110);
                        if (var27 > 284) {
                          var86 = (CharSequence) (Object) "Scrollingview2";
                          var68 = new kg(ke.a(var86, (byte) -48), var26, (gh) null, var23);
                          vd.field_a = var68;
                          var68.a(110, -2048, bi.field_d, 301, bg.field_y, 0, 21);
                          kk.field_a.a((gh) (Object) var68, 119);
                          break L144;
                        } else {
                          var62.field_I = null;
                          kk.field_a.a(var26, 125);
                          break L144;
                        }
                      } else {
                        if ((fg.field_Ob & 16) <= 0) {
                          if (fg.field_Ob == 0) {
                            vb.a(kk.field_a, (byte) 19);
                            break L144;
                          } else {
                            break L144;
                          }
                        } else {
                          L145: {
                            var64 = new gh("", var63);
                            var64.field_S = kf.field_B;
                            var64.a(0, 0, 18, 0, 110);
                            kk.field_a.a(var64, 119);
                            var26_int = og.a(true);
                            var27 = 254;
                            if (~var27 <= ~var26_int) {
                              stackOut_529_0 = 0;
                              stackIn_530_0 = stackOut_529_0;
                              break L145;
                            } else {
                              stackOut_528_0 = 1;
                              stackIn_530_0 = stackOut_528_0;
                              break L145;
                            }
                          }
                          L146: {
                            kc.field_r = stackIn_530_0 != 0;
                            var65 = new gh("DataListView", (gh) null);
                            if (kc.field_r) {
                              break L146;
                            } else {
                              var65.field_I = tk.field_t;
                              break L146;
                            }
                          }
                          L147: {
                            hm.field_a = var65;
                            var29 = ak.a(var65, 112);
                            lg.field_l = true;
                            stackOut_532_0 = (gh) var65;
                            stackOut_532_1 = 0;
                            stackOut_532_2 = 20;
                            stackOut_532_3 = var29;
                            stackIn_534_0 = stackOut_532_0;
                            stackIn_534_1 = stackOut_532_1;
                            stackIn_534_2 = stackOut_532_2;
                            stackIn_534_3 = stackOut_532_3;
                            stackIn_533_0 = stackOut_532_0;
                            stackIn_533_1 = stackOut_532_1;
                            stackIn_533_2 = stackOut_532_2;
                            stackIn_533_3 = stackOut_532_3;
                            if (kc.field_r) {
                              stackOut_534_0 = (gh) (Object) stackIn_534_0;
                              stackOut_534_1 = stackIn_534_1;
                              stackOut_534_2 = stackIn_534_2;
                              stackOut_534_3 = stackIn_534_3;
                              stackOut_534_4 = bi.field_d / 2 - -2;
                              stackIn_535_0 = stackOut_534_0;
                              stackIn_535_1 = stackOut_534_1;
                              stackIn_535_2 = stackOut_534_2;
                              stackIn_535_3 = stackOut_534_3;
                              stackIn_535_4 = stackOut_534_4;
                              break L147;
                            } else {
                              stackOut_533_0 = (gh) (Object) stackIn_533_0;
                              stackOut_533_1 = stackIn_533_1;
                              stackOut_533_2 = stackIn_533_2;
                              stackOut_533_3 = stackIn_533_3;
                              stackOut_533_4 = 0;
                              stackIn_535_0 = stackOut_533_0;
                              stackIn_535_1 = stackOut_533_1;
                              stackIn_535_2 = stackOut_533_2;
                              stackIn_535_3 = stackOut_533_3;
                              stackIn_535_4 = stackOut_533_4;
                              break L147;
                            }
                          }
                          ((gh) (Object) stackIn_535_0).a(stackIn_535_1, stackIn_535_2, stackIn_535_3, stackIn_535_4, 110);
                          if (kc.field_r) {
                            var85 = (CharSequence) (Object) "Scrollingview2";
                            var66 = new kg(ke.a(var85, (byte) -48), var65, (gh) null, var23);
                            vd.field_a = var66;
                            var66.a(107, -2048, bi.field_d, -2 + var27, bg.field_y, 0, 23);
                            kk.field_a.a((gh) (Object) var66, 121);
                            break L144;
                          } else {
                            var62.field_I = null;
                            kk.field_a.a(var65, 120);
                            break L144;
                          }
                        }
                      }
                    }
                  }
                  if (fg.field_Ob == 1) {
                    var62.field_I = null;
                    break L42;
                  } else {
                    break L42;
                  }
                } else {
                  cj.field_a[var25] = null;
                  var25++;
                  continue L133;
                }
              }
            } else {
              L148: {
                var21_int = 0;
                if (var20_int != 0) {
                  break L148;
                } else {
                  if (fg.field_Ob == 1) {
                    var21_int = 1;
                    break L148;
                  } else {
                    break L148;
                  }
                }
              }
              L149: {
                if (1 != var20_int) {
                  break L149;
                } else {
                  if ((fg.field_Ob & 2) > 0) {
                    var21_int = 1;
                    break L149;
                  } else {
                    break L149;
                  }
                }
              }
              L150: {
                if (2 != var20_int) {
                  break L150;
                } else {
                  if (0 >= (16 & fg.field_Ob)) {
                    break L150;
                  } else {
                    var21_int = 1;
                    break L150;
                  }
                }
              }
              L151: {
                if (var20_int != 3) {
                  break L151;
                } else {
                  if (fg.field_Ob != 0) {
                    break L151;
                  } else {
                    var21_int = 1;
                    break L151;
                  }
                }
              }
              L152: {
                stackOut_471_0 = null;
                stackOut_471_1 = null;
                stackOut_471_2 = am.field_d[var20_int];
                stackIn_473_0 = stackOut_471_0;
                stackIn_473_1 = stackOut_471_1;
                stackIn_473_2 = stackOut_471_2;
                stackIn_472_0 = stackOut_471_0;
                stackIn_472_1 = stackOut_471_1;
                stackIn_472_2 = stackOut_471_2;
                if (var21_int != 0) {
                  stackOut_473_0 = null;
                  stackOut_473_1 = null;
                  stackOut_473_2 = (String) (Object) stackIn_473_2;
                  stackOut_473_3 = (gh) var52;
                  stackIn_474_0 = stackOut_473_0;
                  stackIn_474_1 = stackOut_473_1;
                  stackIn_474_2 = stackOut_473_2;
                  stackIn_474_3 = stackOut_473_3;
                  break L152;
                } else {
                  stackOut_472_0 = null;
                  stackOut_472_1 = null;
                  stackOut_472_2 = (String) (Object) stackIn_472_2;
                  stackOut_472_3 = var14;
                  stackIn_474_0 = stackOut_472_0;
                  stackIn_474_1 = stackOut_472_1;
                  stackIn_474_2 = stackOut_472_2;
                  stackIn_474_3 = (gh) (Object) stackOut_472_3;
                  break L152;
                }
              }
              L153: {
                var53 = new gh(stackIn_474_2, stackIn_474_3);
                wc.field_h[var20_int] = var53;
                stackOut_474_0 = (gh) var53;
                stackOut_474_1 = da.field_e;
                stackOut_474_2 = var20_int;
                stackIn_476_0 = stackOut_474_0;
                stackIn_476_1 = stackOut_474_1;
                stackIn_476_2 = stackOut_474_2;
                stackIn_475_0 = stackOut_474_0;
                stackIn_475_1 = stackOut_474_1;
                stackIn_475_2 = stackOut_474_2;
                if (var21_int != 0) {
                  stackOut_476_0 = (gh) (Object) stackIn_476_0;
                  stackOut_476_1 = (wk[]) (Object) stackIn_476_1;
                  stackOut_476_2 = stackIn_476_2;
                  stackOut_476_3 = 0;
                  stackIn_477_0 = stackOut_476_0;
                  stackIn_477_1 = stackOut_476_1;
                  stackIn_477_2 = stackOut_476_2;
                  stackIn_477_3 = stackOut_476_3;
                  break L153;
                } else {
                  stackOut_475_0 = (gh) (Object) stackIn_475_0;
                  stackOut_475_1 = (wk[]) (Object) stackIn_475_1;
                  stackOut_475_2 = stackIn_475_2;
                  stackOut_475_3 = 4;
                  stackIn_477_0 = stackOut_475_0;
                  stackIn_477_1 = stackOut_475_1;
                  stackIn_477_2 = stackOut_475_2;
                  stackIn_477_3 = stackOut_475_3;
                  break L153;
                }
              }
              stackIn_477_0.field_Pb = stackIn_477_1[stackIn_477_2 - -stackIn_477_3];
              var53.a(0, 59, 25, var19, var18);
              gd.field_jb.a(var53, 126);
              vb.field_a[var20_int] = var53;
              var19 = var19 + var18;
              var20_int++;
              continue L132;
            }
          }
        }
        on.b(50);
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
              ((rj) this).a((byte) 115, param1, param1.length, 0);
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
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("rj.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        rm.field_g = param2;
        ig.field_e = param0;
        ck.field_e = param3;
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
              try {
                L0: {
                  var3 = new java.net.URL(param1.getCodeBase(), param0);
                  var3 = ge.a(param2 ^ -47, var3, param1);
                  if (param2 == -47) {
                    be.a(true, (byte) 26, var3.toString(), param1);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var3_ref = (Exception) (Object) decompiledCaughtException;
                  var3_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("rj.J(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        ((rj) this).field_g = 0;
        if (!(((rj) this).field_e == ((rj) this).field_l)) {
            ((rj) this).field_q.a(((rj) this).field_l, -1);
            ((rj) this).field_e = ((rj) this).field_l;
        }
        ((rj) this).field_i = ((rj) this).field_l;
        while (((rj) this).field_g < ((rj) this).field_n.length) {
            var2 = -((rj) this).field_g + ((rj) this).field_n.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((rj) this).field_q.a(((rj) this).field_n, ((rj) this).field_g, var2, false);
            if (var3 == -1) {
                break;
            }
            ((rj) this).field_e = ((rj) this).field_e + (long)var3;
            ((rj) this).field_g = ((rj) this).field_g + var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
            throw new IOException();
        }
        ((rj) this).field_l = param1;
        if (param0 > -88) {
            ((rj) this).field_i = 68L;
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
        Object var11 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
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
            L1: {
              if (((rj) this).field_o >= ((rj) this).field_l - -(long)param1) {
                break L1;
              } else {
                ((rj) this).field_o = (long)param1 + ((rj) this).field_l;
                break L1;
              }
            }
            L2: {
              if (((rj) this).field_a == -1L) {
                break L2;
              } else {
                if (~((rj) this).field_l <= ~((rj) this).field_a) {
                  if (~((rj) this).field_l >= ~(((rj) this).field_a - -(long)((rj) this).field_h)) {
                    break L2;
                  } else {
                    this.b((byte) -104);
                    break L2;
                  }
                } else {
                  this.b((byte) -104);
                  break L2;
                }
              }
            }
            L3: {
              if (((rj) this).field_a == -1L) {
                break L3;
              } else {
                if (~(((rj) this).field_a + (long)((rj) this).field_p.length) <= ~(((rj) this).field_l + (long)param1)) {
                  break L3;
                } else {
                  var5_int = (int)((long)((rj) this).field_p.length + -((rj) this).field_l - -((rj) this).field_a);
                  ii.a(param3, param0, ((rj) this).field_p, (int)(((rj) this).field_l + -((rj) this).field_a), var5_int);
                  param0 = param0 + var5_int;
                  param1 = param1 - var5_int;
                  ((rj) this).field_l = ((rj) this).field_l + (long)var5_int;
                  ((rj) this).field_h = ((rj) this).field_p.length;
                  this.b((byte) -118);
                  break L3;
                }
              }
            }
            if (param1 > ((rj) this).field_p.length) {
              L4: {
                if (~((rj) this).field_l == ~((rj) this).field_e) {
                  break L4;
                } else {
                  ((rj) this).field_q.a(((rj) this).field_l, -1);
                  ((rj) this).field_e = ((rj) this).field_l;
                  break L4;
                }
              }
              L5: {
                ((rj) this).field_q.a(param1, 1, param3, param0);
                ((rj) this).field_e = ((rj) this).field_e + (long)param1;
                if (((rj) this).field_e > ((rj) this).field_f) {
                  ((rj) this).field_f = ((rj) this).field_e;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5_long = -1L;
                  var7 = -1L;
                  if (~((rj) this).field_l > ~((rj) this).field_i) {
                    break L7;
                  } else {
                    if ((long)((rj) this).field_g + ((rj) this).field_i > ((rj) this).field_l) {
                      var5_long = ((rj) this).field_l;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (((rj) this).field_i < ((rj) this).field_l) {
                  break L6;
                } else {
                  if (~((long)param1 + ((rj) this).field_l) < ~((rj) this).field_i) {
                    var5_long = ((rj) this).field_i;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                L9: {
                  if (((rj) this).field_l - -(long)param1 <= ((rj) this).field_i) {
                    break L9;
                  } else {
                    if ((long)param1 + ((rj) this).field_l <= (long)((rj) this).field_g + ((rj) this).field_i) {
                      var7 = (long)param1 + ((rj) this).field_l;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (~((long)((rj) this).field_g + ((rj) this).field_i) >= ~((rj) this).field_l) {
                  break L8;
                } else {
                  if (~(((rj) this).field_i + (long)((rj) this).field_g) >= ~((long)param1 + ((rj) this).field_l)) {
                    var7 = (long)((rj) this).field_g + ((rj) this).field_i;
                    break L8;
                  } else {
                    L10: {
                      if (var5_long <= -1L) {
                        break L10;
                      } else {
                        if (~var5_long <= ~var7) {
                          break L10;
                        } else {
                          var9 = (int)(var7 - var5_long);
                          ii.a(param3, (int)(var5_long + ((long)param0 + -((rj) this).field_l)), ((rj) this).field_n, (int)(var5_long - ((rj) this).field_i), var9);
                          break L10;
                        }
                      }
                    }
                    ((rj) this).field_l = ((rj) this).field_l + (long)param1;
                    return;
                  }
                }
              }
              L11: {
                if (var5_long <= -1L) {
                  break L11;
                } else {
                  if (~var5_long <= ~var7) {
                    break L11;
                  } else {
                    var9 = (int)(var7 - var5_long);
                    ii.a(param3, (int)(var5_long + ((long)param0 + -((rj) this).field_l)), ((rj) this).field_n, (int)(var5_long - ((rj) this).field_i), var9);
                    break L11;
                  }
                }
              }
              ((rj) this).field_l = ((rj) this).field_l + (long)param1;
              return;
            } else {
              if (param1 > 0) {
                L12: {
                  if (((rj) this).field_a != -1L) {
                    break L12;
                  } else {
                    ((rj) this).field_a = ((rj) this).field_l;
                    break L12;
                  }
                }
                L13: {
                  ii.a(param3, param0, ((rj) this).field_p, (int)(((rj) this).field_l - ((rj) this).field_a), param1);
                  ((rj) this).field_l = ((rj) this).field_l + (long)param1;
                  if (-((rj) this).field_a + ((rj) this).field_l <= (long)((rj) this).field_h) {
                    break L13;
                  } else {
                    ((rj) this).field_h = (int)(((rj) this).field_l - ((rj) this).field_a);
                    break L13;
                  }
                }
                return;
              } else {
                L14: {
                  if (param2 > 17) {
                    break L14;
                  } else {
                    var11 = null;
                    rj.a((String) null, (java.applet.Applet) null, (byte) -7);
                    break L14;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((rj) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var5_ref;
            stackOut_55_1 = new StringBuilder().append("rj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ')');
        }
    }

    rj(sn param0, int param1, int param2) throws IOException {
        ((rj) this).field_a = -1L;
        ((rj) this).field_i = -1L;
        ((rj) this).field_h = 0;
        try {
            ((rj) this).field_q = param0;
            long dupTemp$0 = param0.d(0);
            ((rj) this).field_f = dupTemp$0;
            ((rj) this).field_o = dupTemp$0;
            ((rj) this).field_p = new byte[param2];
            ((rj) this).field_n = new byte[param1];
            ((rj) this).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) throws IOException {
        if (param0 >= -122) {
            ((rj) this).field_n = null;
        }
        this.b((byte) -97);
        ((rj) this).field_q.a(true);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_c = "Send private message to <%0>";
        field_m = new String[]{"Light reactor", "Core reactor", "Dual reactor", "Heavy reactor", "Fusion reactor", "Light capacitor", "Base capacitor", "Heavy capacitor", "Ring capacitor", "Magnon capacitor", "Haze energy shield", "Electron energy shield", "Plasma energy shield", "Dragon energy shield", "Solar energy shield", "EMP bomb", "Targeter", "AMARDS", "Missile scrambler", "Repair system", "Experimental reactor", "Scanner", "Speed loader", "Coolant array", "Emergency displacement deployment", "High-energy amplifier", "Energised armour", "EMP hardening", "Gravity pods", "Aeruak stabilisers", "Walton mirage device", "Siege stabilisation system", "Reinforced armour", "Reactive armour"};
        field_b = 66;
    }
}
