/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        this.field_i = 0L;
        if (param0 == 50) {
          if (this.field_h < this.field_j) {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          } else {
            return;
          }
        } else {
          field_c = (ee) null;
          if (this.field_h >= this.field_j) {
            return;
          } else {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final long b(int param0) {
        if (param0 == 255) {
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_m = true;
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(int param0) {
        long var2;
        long var4;
        long var6;
        int var8;
        int var9;
        var9 = Lexicominos.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - this.field_i;
        this.field_i = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            this.field_f[this.field_e] = var4;
            this.field_e = (this.field_e + 1) % 10;
            if ((this.field_l ^ -1) <= -2) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (this.field_l < var8) {
                  if (param0 != 10) {
                    return -86L;
                  } else {
                    return var6 / (long)this.field_l;
                  }
                } else {
                  var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              this.field_l = this.field_l + 1;
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (this.field_l < var8) {
                  if (param0 != 10) {
                    return -86L;
                  } else {
                    return var6 / (long)this.field_l;
                  }
                } else {
                  var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (this.field_l < var8) {
                if (param0 != 10) {
                  return -86L;
                } else {
                  return var6 / (long)this.field_l;
                }
              } else {
                var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (this.field_l < var8) {
              if (param0 != 10) {
                return -86L;
              } else {
                return var6 / (long)this.field_l;
              }
            } else {
              var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 113) {
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L0: while (true) {
              L1: {
                this.field_j = this.field_j + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L1;
                } else {
                  if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                  this.field_j = this.field_h;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        } else {
          field_g = -117;
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L3: while (true) {
              L4: {
                this.field_j = this.field_j + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L4;
                } else {
                  if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                  this.field_j = this.field_h;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var4;
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                rk.a(true);
                break L1;
              }
            }
            L2: {
              if (param0 < 2) {
                break L2;
              } else {
                if (param0 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackIn_42_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (-1 != (var8 ^ -1)) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (param3) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackIn_26_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var9 < param0) {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var9 + param0 * var6;
                          if (var6 == var10 / param0) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            stackIn_37_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          stackIn_31_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    rk() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_e = 0;
        this.field_i = 0L;
        this.field_l = 1;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
